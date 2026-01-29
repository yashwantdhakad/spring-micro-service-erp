package com.monash.erp.wms.controller;

import com.monash.erp.wms.dto.PicklistDetailDto;
import com.monash.erp.wms.dto.PicklistSummaryDto;
import com.monash.erp.wms.service.PicklistViewService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;

@RestController
@RequestMapping("/api/picklists-view")
public class PicklistViewController {

    private final PicklistViewService service;

    public PicklistViewController(PicklistViewService service) {
        this.service = service;
    }

    @GetMapping("/summary")
    public List<PicklistSummaryDto> list(
            @RequestParam(name = "facilityId", required = false) String facilityId,
            @RequestParam(name = "statusId", required = false) String statusId,
            @RequestParam(name = "fromDate", required = false) String fromDate,
            @RequestParam(name = "toDate", required = false) String toDate
    ) {
        return service.listSummaries(
                facilityId,
                statusId,
                parseDate(fromDate, "fromDate"),
                parseDate(toDate, "toDate")
        );
    }

    @GetMapping("/{picklistId}")
    public PicklistDetailDto getDetail(@PathVariable String picklistId) {
        return service.getDetail(picklistId);
    }

    private LocalDate parseDate(String value, String fieldName) {
        if (value == null || value.isBlank()) {
            return null;
        }
        try {
            return LocalDate.parse(value);
        } catch (DateTimeParseException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, fieldName + " must be yyyy-MM-dd");
        }
    }
}
