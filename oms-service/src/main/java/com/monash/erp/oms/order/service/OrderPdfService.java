package com.monash.erp.oms.order.service;

import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.monash.erp.oms.order.dto.OrderContactMechDto;
import com.monash.erp.oms.order.dto.OrderDetailResponse;
import com.monash.erp.oms.order.dto.OrderDisplayInfoResponse;
import com.monash.erp.oms.order.dto.OrderItemDto;
import com.monash.erp.oms.order.dto.OrderPartDto;
import com.monash.erp.oms.order.dto.PostalAddressDto;
import com.monash.erp.oms.entity.OrderHeader;
import com.monash.erp.oms.order.repository.OrderHeaderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

@Service
public class OrderPdfService {

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("d MMMM, yyyy", Locale.ENGLISH);

    private final OrderCompositeService orderCompositeService;
    private final OrderHeaderRepository orderHeaderRepository;

    public OrderPdfService(OrderCompositeService orderCompositeService, OrderHeaderRepository orderHeaderRepository) {
        this.orderCompositeService = orderCompositeService;
        this.orderHeaderRepository = orderHeaderRepository;
    }

    public byte[] generateOrderPdf(String orderId) {
        OrderHeader header = orderHeaderRepository.findByOrderId(orderId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Order " + orderId + " not found"));
        OrderDetailResponse detail = orderCompositeService.getOrder(orderId);
        OrderDisplayInfoResponse display = orderCompositeService.getDisplayInfo(orderId);

        String title = "PURCHASE_ORDER".equalsIgnoreCase(header.getOrderTypeId())
                ? "Purchase Order"
                : "Sales Order";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document doc = new Document(PageSize.A4, 36, 36, 36, 36);
        PdfWriter.getInstance(doc, out);
        doc.open();

        Font titleFont = new Font(Font.HELVETICA, 16, Font.BOLD);
        Font bold = new Font(Font.HELVETICA, 10, Font.BOLD);
        Font normal = new Font(Font.HELVETICA, 10);

        PdfPTable headerTable = new PdfPTable(new float[]{2, 1});
        headerTable.setWidthPercentage(100);
        headerTable.getDefaultCell().setBorder(PdfPCell.NO_BORDER);

        PdfPCell left = new PdfPCell();
        left.setBorder(PdfPCell.NO_BORDER);
        left.addElement(new Paragraph("Monash ERP", bold));
        left.addElement(new Paragraph("Sales & Distribution", normal));
        left.addElement(new Paragraph(" ", normal));
        headerTable.addCell(left);

        PdfPCell right = new PdfPCell();
        right.setBorder(PdfPCell.NO_BORDER);
        right.setHorizontalAlignment(Element.ALIGN_RIGHT);
        right.addElement(new Paragraph(title, titleFont));
        right.addElement(new Paragraph("Order #: " + safe(display.getOrderHeader().getOrderId()), normal));
        if (display.getOrderHeader().getEntryDate() != null) {
            right.addElement(new Paragraph("Order Date: " + display.getOrderHeader().getEntryDate().format(DATE_FORMAT), normal));
        }
        if (display.getStatusItem() != null) {
            right.addElement(new Paragraph("Status: " + safe(display.getStatusItem().getDescription()), normal));
        }
        String customerName = resolveCustomerName(detail);
        if (!customerName.isBlank()) {
            right.addElement(new Paragraph("Customer: " + customerName, normal));
        }
        headerTable.addCell(right);
        doc.add(headerTable);

        doc.add(new Paragraph(" "));

        PdfPTable infoTable = new PdfPTable(new float[]{1, 1});
        infoTable.setWidthPercentage(100);
        infoTable.getDefaultCell().setBorder(PdfPCell.NO_BORDER);

        PdfPCell shippingCell = new PdfPCell();
        shippingCell.setBorder(PdfPCell.NO_BORDER);
        shippingCell.addElement(new Paragraph("Shipping Destination", bold));
        for (String line : formatShippingAddress(display.getOrderContactMechList())) {
            shippingCell.addElement(new Paragraph(line, normal));
        }
        infoTable.addCell(shippingCell);

        PdfPCell termsCell = new PdfPCell();
        termsCell.setBorder(PdfPCell.NO_BORDER);
        termsCell.addElement(new Paragraph("Order Terms", bold));
        termsCell.addElement(new Paragraph("- NET 15", normal));
        infoTable.addCell(termsCell);

        doc.add(infoTable);
        doc.add(new Paragraph(" "));

        PdfPTable itemsTable = new PdfPTable(new float[]{0.6f, 2f, 3f, 1f, 1f, 1f});
        itemsTable.setWidthPercentage(100);
        addHeaderCell(itemsTable, "No.", bold);
        addHeaderCell(itemsTable, "Product", bold);
        addHeaderCell(itemsTable, "Description", bold);
        addHeaderCell(itemsTable, "Ordered", bold);
        addHeaderCell(itemsTable, "Unit Price", bold);
        addHeaderCell(itemsTable, "Total", bold);

        int index = 1;
        BigDecimal subtotal = BigDecimal.ZERO;
        for (OrderPartDto part : detail.getParts()) {
            for (OrderItemDto item : part.getItems()) {
                BigDecimal qty = defaultIfNull(item.getQuantity());
                BigDecimal unit = defaultIfNull(item.getUnitAmount());
                BigDecimal total = qty.multiply(unit);
                subtotal = subtotal.add(total);

                addBodyCell(itemsTable, String.valueOf(index++), normal);
                addBodyCell(itemsTable, safe(item.getProductId()), normal);
                String description = item.getItemDescription();
                if (description == null && item.getProduct() != null) {
                    description = item.getProduct().getProductName();
                }
                addBodyCell(itemsTable, safe(description), normal);
                addBodyCell(itemsTable, formatMoney(qty), normal);
                addBodyCell(itemsTable, formatMoney(unit), normal);
                addBodyCell(itemsTable, formatMoney(total), normal);
            }
        }
        doc.add(itemsTable);

        doc.add(new Paragraph(" "));

        PdfPTable totals = new PdfPTable(new float[]{4, 1});
        totals.setWidthPercentage(40);
        totals.setHorizontalAlignment(Element.ALIGN_RIGHT);
        totals.getDefaultCell().setBorder(PdfPCell.NO_BORDER);

        addTotalsRow(totals, "Subtotal", subtotal, bold, normal);
        addTotalsRow(totals, "Grand Total", defaultIfNull(display.getOrderHeader().getGrandTotal()), bold, normal);
        doc.add(totals);

        doc.close();
        return out.toByteArray();
    }

    private void addHeaderCell(PdfPTable table, String value, Font font) {
        PdfPCell cell = new PdfPCell(new Phrase(value, font));
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        table.addCell(cell);
    }

    private void addBodyCell(PdfPTable table, String value, Font font) {
        PdfPCell cell = new PdfPCell(new Phrase(value, font));
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        table.addCell(cell);
    }

    private void addTotalsRow(PdfPTable table, String label, BigDecimal value, Font labelFont, Font valueFont) {
        PdfPCell labelCell = new PdfPCell(new Phrase(label, labelFont));
        labelCell.setBorder(PdfPCell.NO_BORDER);
        labelCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        PdfPCell valueCell = new PdfPCell(new Phrase(formatMoney(value), valueFont));
        valueCell.setBorder(PdfPCell.NO_BORDER);
        valueCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        table.addCell(labelCell);
        table.addCell(valueCell);
    }

    private String resolveCustomerName(OrderDetailResponse detail) {
        if (detail.getParts() == null || detail.getParts().isEmpty()) {
            return "";
        }
        OrderPartDto part = detail.getParts().get(0);
        if (part.getCustomer() != null) {
            if (part.getCustomer().getOrganization() != null) {
                return safe(part.getCustomer().getOrganization().getOrganizationName());
            }
            if (part.getCustomer().getPerson() != null) {
                String first = safe(part.getCustomer().getPerson().getFirstName());
                String last = safe(part.getCustomer().getPerson().getLastName());
                return (first + " " + last).trim();
            }
        }
        return "";
    }

    private List<String> formatShippingAddress(List<OrderContactMechDto> contacts) {
        if (contacts == null) {
            return List.of("Not available");
        }
        for (OrderContactMechDto contact : contacts) {
            if ("SHIPPING_LOCATION".equalsIgnoreCase(contact.getContactMechPurposeTypeId())) {
                PostalAddressDto address = contact.getPostalAddress();
                if (address == null) {
                    continue;
                }
                return List.of(
                        safe(address.getToName()),
                        safe(address.getAddress1()),
                        safe(address.getAddress2()),
                        safe(address.getCity()),
                        safe(address.getStateProvinceGeoId()) + " " + safe(address.getPostalCode()),
                        safe(address.getCountryGeoId())
                );
            }
        }
        return List.of("Not available");
    }

    private String safe(String value) {
        return value == null ? "" : value;
    }

    private BigDecimal defaultIfNull(BigDecimal value) {
        return value == null ? BigDecimal.ZERO : value;
    }

    private String formatMoney(BigDecimal value) {
        if (value == null) {
            return "0";
        }
        return value.stripTrailingZeros().toPlainString();
    }
}
