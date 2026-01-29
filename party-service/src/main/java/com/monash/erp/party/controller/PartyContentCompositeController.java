package com.monash.erp.party.controller;

import com.monash.erp.party.dto.PartyContentDto;
import com.monash.erp.party.service.PartyContentCompositeService;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.net.URLConnection;
import java.util.List;

@RestController
@RequestMapping("/api/parties")
public class PartyContentCompositeController {

    private final PartyContentCompositeService service;

    public PartyContentCompositeController(PartyContentCompositeService service) {
        this.service = service;
    }

    @GetMapping("/{partyId}/contents")
    public List<PartyContentDto> listContents(@PathVariable String partyId) {
        return service.listContents(partyId);
    }

    @PostMapping(value = "/{partyId}/contents", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public PartyContentDto addContent(
            @PathVariable String partyId,
            @RequestPart(value = "partyContentTypeEnumId", required = false) String contentTypeId,
            @RequestPart("description") String description,
            @RequestPart("contentFile") MultipartFile contentFile
    ) {
        return service.addContent(partyId, contentTypeId, description, contentFile);
    }

    @GetMapping("/{partyId}/contents/{contentId}")
    public ResponseEntity<Resource> getContent(
            @PathVariable String partyId,
            @PathVariable String contentId
    ) throws Exception {
        PartyContentCompositeService.PartyContentDownload download = service.loadContent(partyId, contentId);
        Resource resource = new UrlResource(download.getFilePath().toUri());
        String fileName = download.getFileName();
        if (fileName == null || fileName.isBlank()) {
            fileName = contentId;
        }
        String contentType = URLConnection.guessContentTypeFromName(fileName);
        MediaType mediaType = contentType != null ? MediaType.parseMediaType(contentType) : MediaType.APPLICATION_OCTET_STREAM;

        return ResponseEntity.ok()
                .contentType(mediaType)
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + fileName + "\"")
                .body(resource);
    }
}
