package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String documentId;
    private String documentTypeId;
    private LocalDateTime dateCreated;
    private String comments;
    private String documentLocation;
    private String documentText;
    private String imageData;
public void setId(Long id) {
        this.id = id;
    }
public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }
public void setDocumentTypeId(String documentTypeId) {
        this.documentTypeId = documentTypeId;
    }
public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
public void setComments(String comments) {
        this.comments = comments;
    }
public void setDocumentLocation(String documentLocation) {
        this.documentLocation = documentLocation;
    }
public void setDocumentText(String documentText) {
        this.documentText = documentText;
    }
public void setImageData(String imageData) {
        this.imageData = imageData;
    }

}
