package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "product",
        indexes = {
                @Index(name = "idx_product_product_id", columnList = "product_id"),
                @Index(name = "idx_product_product_name", columnList = "product_name"),
                @Index(name = "idx_product_internal_name", columnList = "internal_name"),
                @Index(name = "idx_product_product_type_id", columnList = "product_type_id"),
                @Index(name = "idx_product_primary_category_id", columnList = "primary_product_category_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, unique = true)
    private String productId;

    @Column(length = 20)
    private String productTypeId;

    @Column(length = 20)
    private String primaryProductCategoryId;

    @Column(length = 20)
    private String manufacturerPartyId;

    @Column(length = 20)
    private String facilityId;

    private LocalDateTime introductionDate;
    private LocalDateTime supportDiscontinuationDate;
    private LocalDateTime salesDiscontinuationDate;
    private LocalDateTime releaseDate;

    @Column(length = 1)
    private String salesDiscWhenNotAvail;

    @Column(length = 255)
    private String internalName;

    @Column(length = 100)
    private String brandName;

    @Column(length = 255)
    private String comments;

    @Column(length = 100)
    private String productName;

    @Column(length = 255)
    private String description;

    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String longDescription;

    @Column(columnDefinition = "TEXT")
    private String priceDetailText;

    @Column(columnDefinition = "TEXT")
    private String smallImageUrl;

    @Column(columnDefinition = "TEXT")
    private String mediumImageUrl;

    @Column(columnDefinition = "TEXT")
    private String largeImageUrl;

    @Column(columnDefinition = "TEXT")
    private String detailImageUrl;

    @Column(columnDefinition = "TEXT")
    private String originalImageUrl;

    @Column(columnDefinition = "TEXT")
    private String detailScreen;

    @Column(columnDefinition = "TEXT")
    private String inventoryMessage;

    @Column(length = 1)
    private String requireInventory;

    @Column(length = 20)
    private String quantityUomId;

    @Column(precision = 18, scale = 6)
    private BigDecimal quantityIncluded;

    @Column(precision = 20, scale = 0)
    private BigDecimal piecesIncluded;

    @Column(length = 1)
    private String requireAmount;

    @Column(precision = 18, scale = 2)
    private BigDecimal fixedAmount;

    @Column(length = 20)
    private String amountUomTypeId;

    @Column(length = 20)
    private String weightUomId;

    @Column(precision = 18, scale = 6)
    private BigDecimal weight;

    @Column(length = 20)
    private String heightUomId;

    @Column(precision = 18, scale = 6)
    private BigDecimal productHeight;

    @Column(precision = 18, scale = 6)
    private BigDecimal shippingHeight;

    @Column(length = 20)
    private String widthUomId;

    @Column(precision = 18, scale = 6)
    private BigDecimal productWidth;

    @Column(precision = 18, scale = 6)
    private BigDecimal shippingWidth;

    @Column(length = 20)
    private String depthUomId;

    @Column(precision = 18, scale = 6)
    private BigDecimal productDepth;

    @Column(precision = 18, scale = 6)
    private BigDecimal shippingDepth;

    @Column(precision = 18, scale = 6)
    private BigDecimal productRating;

    @Column(length = 20)
    private String ratingTypeEnum;

    @Column(length = 1)
    private String returnable;

    @Column(length = 1)
    private String taxable;

    @Column(length = 1)
    private String chargeShipping;

    @Column(length = 1)
    private String autoCreateKeywords;

    @Column(length = 1)
    private String includeInPromotions;

    @Column(length = 1)
    private String isVirtual;

    @Column(length = 1)
    private String isVariant;

    @Column(length = 20)
    private String virtualVariantMethodEnum;

    @Column(length = 20)
    private String originGeoId;

    @Column(length = 20)
    private String requirementMethodEnumId;

    @Column(precision = 20, scale = 0)
    private BigDecimal billOfMaterialLevel;

    @Column(precision = 18, scale = 6)
    private BigDecimal reservMaxPersons;

    @Column(name = "RESERV2ND_P_P_PERC", precision = 18, scale = 6)
    private BigDecimal reserv2ndPPPerc;

    @Column(name = "RESERV_NTH_P_P_PERC", precision = 18, scale = 6)
    private BigDecimal reservNthPPPerc;

    @Column(length = 20)
    private String configId;

    private LocalDateTime createdDate;

    @Column(length = 250)
    private String createdByUserLogin;

    private LocalDateTime lastModifiedDate;

    @Column(length = 250)
    private String lastModifiedByUserLogin;

    @Column(length = 1)
    private String inShippingBox;

    @Column(length = 20)
    private String defaultShipmentBoxTypeId;

    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;

    @Column(length = 1)
    private String isChemical;

    @Column(length = 1)
    private String serialized;

    @Column(length = 1)
    private String shelfLife;

    @Column(length = 20)
    private String externalId;

    @Column(precision = 18, scale = 6)
    private BigDecimal defaultLeadTimeDays;

    @Column(columnDefinition = "TEXT")
    private String receivingNote;

    @Column(precision = 18, scale = 6)
    private BigDecimal productWeight;

    @Column(length = 20)
    private String diameterUomId;

    @Column(precision = 18, scale = 6)
    private BigDecimal productDiameter;

    @Column(precision = 20, scale = 0)
    private BigDecimal annualFlightHours;

    @Column(length = 1)
    private String hasSleeves;

    @Column(length = 1)
    private String lifeLimitation;
public void setId(Long id) {
        this.id = id;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }
public void setPrimaryProductCategoryId(String primaryProductCategoryId) {
        this.primaryProductCategoryId = primaryProductCategoryId;
    }
public void setManufacturerPartyId(String manufacturerPartyId) {
        this.manufacturerPartyId = manufacturerPartyId;
    }
public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
public void setIntroductionDate(LocalDateTime introductionDate) {
        this.introductionDate = introductionDate;
    }
public void setSupportDiscontinuationDate(LocalDateTime supportDiscontinuationDate) {
        this.supportDiscontinuationDate = supportDiscontinuationDate;
    }
public void setSalesDiscontinuationDate(LocalDateTime salesDiscontinuationDate) {
        this.salesDiscontinuationDate = salesDiscontinuationDate;
    }
public void setReleaseDate(LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }
public void setSalesDiscWhenNotAvail(String salesDiscWhenNotAvail) {
        this.salesDiscWhenNotAvail = salesDiscWhenNotAvail;
    }
public void setInternalName(String internalName) {
        this.internalName = internalName;
    }
public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
public void setComments(String comments) {
        this.comments = comments;
    }
public void setProductName(String productName) {
        this.productName = productName;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
public void setPriceDetailText(String priceDetailText) {
        this.priceDetailText = priceDetailText;
    }
public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }
public void setMediumImageUrl(String mediumImageUrl) {
        this.mediumImageUrl = mediumImageUrl;
    }
public void setLargeImageUrl(String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }
public void setDetailImageUrl(String detailImageUrl) {
        this.detailImageUrl = detailImageUrl;
    }
public void setOriginalImageUrl(String originalImageUrl) {
        this.originalImageUrl = originalImageUrl;
    }
public void setDetailScreen(String detailScreen) {
        this.detailScreen = detailScreen;
    }
public void setInventoryMessage(String inventoryMessage) {
        this.inventoryMessage = inventoryMessage;
    }
public void setRequireInventory(String requireInventory) {
        this.requireInventory = requireInventory;
    }
public void setQuantityUomId(String quantityUomId) {
        this.quantityUomId = quantityUomId;
    }
public void setQuantityIncluded(BigDecimal quantityIncluded) {
        this.quantityIncluded = quantityIncluded;
    }
public void setPiecesIncluded(BigDecimal piecesIncluded) {
        this.piecesIncluded = piecesIncluded;
    }
public void setRequireAmount(String requireAmount) {
        this.requireAmount = requireAmount;
    }
public void setFixedAmount(BigDecimal fixedAmount) {
        this.fixedAmount = fixedAmount;
    }
public void setAmountUomTypeId(String amountUomTypeId) {
        this.amountUomTypeId = amountUomTypeId;
    }
public void setWeightUomId(String weightUomId) {
        this.weightUomId = weightUomId;
    }
public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
public void setHeightUomId(String heightUomId) {
        this.heightUomId = heightUomId;
    }
public void setProductHeight(BigDecimal productHeight) {
        this.productHeight = productHeight;
    }
public void setShippingHeight(BigDecimal shippingHeight) {
        this.shippingHeight = shippingHeight;
    }
public void setWidthUomId(String widthUomId) {
        this.widthUomId = widthUomId;
    }
public void setProductWidth(BigDecimal productWidth) {
        this.productWidth = productWidth;
    }
public void setShippingWidth(BigDecimal shippingWidth) {
        this.shippingWidth = shippingWidth;
    }
public void setDepthUomId(String depthUomId) {
        this.depthUomId = depthUomId;
    }
public void setProductDepth(BigDecimal productDepth) {
        this.productDepth = productDepth;
    }
public void setShippingDepth(BigDecimal shippingDepth) {
        this.shippingDepth = shippingDepth;
    }
public void setProductRating(BigDecimal productRating) {
        this.productRating = productRating;
    }
public void setRatingTypeEnum(String ratingTypeEnum) {
        this.ratingTypeEnum = ratingTypeEnum;
    }
public void setReturnable(String returnable) {
        this.returnable = returnable;
    }
public void setTaxable(String taxable) {
        this.taxable = taxable;
    }
public void setChargeShipping(String chargeShipping) {
        this.chargeShipping = chargeShipping;
    }
public void setAutoCreateKeywords(String autoCreateKeywords) {
        this.autoCreateKeywords = autoCreateKeywords;
    }
public void setIncludeInPromotions(String includeInPromotions) {
        this.includeInPromotions = includeInPromotions;
    }
public void setIsVirtual(String isVirtual) {
        this.isVirtual = isVirtual;
    }
public void setIsVariant(String isVariant) {
        this.isVariant = isVariant;
    }
public void setVirtualVariantMethodEnum(String virtualVariantMethodEnum) {
        this.virtualVariantMethodEnum = virtualVariantMethodEnum;
    }
public void setOriginGeoId(String originGeoId) {
        this.originGeoId = originGeoId;
    }
public void setRequirementMethodEnumId(String requirementMethodEnumId) {
        this.requirementMethodEnumId = requirementMethodEnumId;
    }
public void setBillOfMaterialLevel(BigDecimal billOfMaterialLevel) {
        this.billOfMaterialLevel = billOfMaterialLevel;
    }
public void setReservMaxPersons(BigDecimal reservMaxPersons) {
        this.reservMaxPersons = reservMaxPersons;
    }
public void setReserv2ndPPPerc(BigDecimal reserv2ndPPPerc) {
        this.reserv2ndPPPerc = reserv2ndPPPerc;
    }
public void setReservNthPPPerc(BigDecimal reservNthPPPerc) {
        this.reservNthPPPerc = reservNthPPPerc;
    }
public void setConfigId(String configId) {
        this.configId = configId;
    }
public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }
public void setInShippingBox(String inShippingBox) {
        this.inShippingBox = inShippingBox;
    }
public void setDefaultShipmentBoxTypeId(String defaultShipmentBoxTypeId) {
        this.defaultShipmentBoxTypeId = defaultShipmentBoxTypeId;
    }
public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }
public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }
public void setIsChemical(String isChemical) {
        this.isChemical = isChemical;
    }
public void setSerialized(String serialized) {
        this.serialized = serialized;
    }
public void setShelfLife(String shelfLife) {
        this.shelfLife = shelfLife;
    }
public void setExternalId(String externalId) {
        this.externalId = externalId;
    }
public void setDefaultLeadTimeDays(BigDecimal defaultLeadTimeDays) {
        this.defaultLeadTimeDays = defaultLeadTimeDays;
    }
public void setReceivingNote(String receivingNote) {
        this.receivingNote = receivingNote;
    }
public void setProductWeight(BigDecimal productWeight) {
        this.productWeight = productWeight;
    }
public void setDiameterUomId(String diameterUomId) {
        this.diameterUomId = diameterUomId;
    }
public void setProductDiameter(BigDecimal productDiameter) {
        this.productDiameter = productDiameter;
    }
public void setAnnualFlightHours(BigDecimal annualFlightHours) {
        this.annualFlightHours = annualFlightHours;
    }
public void setHasSleeves(String hasSleeves) {
        this.hasSleeves = hasSleeves;
    }
public void setLifeLimitation(String lifeLimitation) {
        this.lifeLimitation = lifeLimitation;
    }
}
