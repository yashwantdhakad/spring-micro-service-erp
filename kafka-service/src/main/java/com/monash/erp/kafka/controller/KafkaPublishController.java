package com.monash.erp.kafka.controller;

import com.monash.erp.kafka.dto.KafkaMessageRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/kafka")
public class KafkaPublishController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaPublishController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/publish")
    public ResponseEntity<Map<String, Object>> publish(@Valid @RequestBody KafkaMessageRequest request) {
        if (request.getKey() == null || request.getKey().isBlank()) {
            kafkaTemplate.send(request.getTopic(), request.getPayload());
        } else {
            kafkaTemplate.send(request.getTopic(), request.getKey(), request.getPayload());
        }

        Map<String, Object> response = new HashMap<>();
        response.put("status", "queued");
        response.put("topic", request.getTopic());
        response.put("key", request.getKey());
        return ResponseEntity.accepted().body(response);
    }
}
