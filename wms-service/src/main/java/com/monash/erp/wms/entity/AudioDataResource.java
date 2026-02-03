package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class AudioDataResource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dataResourceId;
    private String audioData;
public void setId(Long id) {
        this.id = id;
    }
public void setDataResourceId(String dataResourceId) {
        this.dataResourceId = dataResourceId;
    }
public void setAudioData(String audioData) {
        this.audioData = audioData;
    }

}
