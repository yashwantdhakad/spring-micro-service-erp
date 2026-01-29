package com.monash.erp.party.service;

import com.monash.erp.party.dto.PartyContentDto;
import com.monash.erp.party.entity.Party;
import com.monash.erp.party.entity.PartyContent;
import com.monash.erp.party.entity.PartyContentInfo;
import com.monash.erp.party.repository.PartyContentInfoRepository;
import com.monash.erp.party.repository.PartyContentRepository;
import com.monash.erp.party.repository.PartyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PartyContentCompositeService {

    private static final Path PARTY_CONTENT_DIR = Paths.get("data", "uploads", "party-contents");

    private final PartyRepository partyRepository;
    private final PartyContentRepository partyContentRepository;
    private final PartyContentInfoRepository partyContentInfoRepository;

    public PartyContentCompositeService(
            PartyRepository partyRepository,
            PartyContentRepository partyContentRepository,
            PartyContentInfoRepository partyContentInfoRepository
    ) {
        this.partyRepository = partyRepository;
        this.partyContentRepository = partyContentRepository;
        this.partyContentInfoRepository = partyContentInfoRepository;
    }

    public List<PartyContentDto> listContents(String partyId) {
        if (isBlank(partyId)) {
            return List.of();
        }
        return partyContentInfoRepository.findByPartyId(partyId).stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public PartyContentDto addContent(String partyId, String contentTypeId, String description, MultipartFile contentFile) {
        Party party = partyRepository.findByPartyId(partyId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Party %s not found".formatted(partyId)));

        if (contentFile == null || contentFile.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "contentFile is required");
        }

        String contentId = "PCN" + UUID.randomUUID().toString().replace("-", "").toUpperCase(Locale.ROOT);
        storePartyContentFile(contentId, contentFile);

        PartyContent partyContent = new PartyContent();
        partyContent.setPartyId(party.getPartyId());
        partyContent.setContentId(contentId);
        partyContent.setPartyContentTypeId(isBlank(contentTypeId) ? null : contentTypeId);
        partyContent.setFromDate(LocalDateTime.now());
        partyContentRepository.save(partyContent);

        PartyContentInfo info = new PartyContentInfo();
        info.setPartyId(party.getPartyId());
        info.setContentId(contentId);
        info.setDescription(description);
        info.setContentLocation(contentFile.getOriginalFilename());
        info.setContentDate(LocalDateTime.now());
        partyContentInfoRepository.save(info);

        return toDto(info);
    }

    public PartyContentDownload loadContent(String partyId, String contentId) {
        if (isBlank(partyId) || isBlank(contentId)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "partyId and contentId are required");
        }

        PartyContentInfo info = partyContentInfoRepository.findByPartyIdAndContentId(partyId, contentId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found"));

        Path filePath = resolvePartyContentPath(contentId);
        if (!Files.exists(filePath)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Content file not found");
        }

        return new PartyContentDownload(filePath, info.getContentLocation());
    }

    private PartyContentDto toDto(PartyContentInfo info) {
        PartyContentDto dto = new PartyContentDto();
        dto.setContentId(info.getContentId());
        dto.setDescription(info.getDescription());
        dto.setContentDate(info.getContentDate());
        dto.setContentLocation(info.getContentLocation());
        return dto;
    }

    private void storePartyContentFile(String contentId, MultipartFile contentFile) {
        try {
            Files.createDirectories(PARTY_CONTENT_DIR);
            Path destination = resolvePartyContentPath(contentId);
            Files.copy(contentFile.getInputStream(), destination, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Failed to store content file");
        }
    }

    private Path resolvePartyContentPath(String contentId) {
        return PARTY_CONTENT_DIR.resolve(contentId);
    }

    private boolean isBlank(String value) {
        return value == null || value.isBlank();
    }

    public static class PartyContentDownload {
        private final Path filePath;
        private final String fileName;

        public PartyContentDownload(Path filePath, String fileName) {
            this.filePath = filePath;
            this.fileName = fileName;
        }

        public Path getFilePath() {
            return filePath;
        }

        public String getFileName() {
            return fileName;
        }
    }
}
