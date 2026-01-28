package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ZplPrinter;
import com.monash.erp.wms.repository.ZplPrinterRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ZplPrinterService {

    private final ZplPrinterRepository repository;

    public ZplPrinterService(ZplPrinterRepository repository) {
        this.repository = repository;
    }

    public List<ZplPrinter> list() {
        return repository.findAll();
    }

    public ZplPrinter get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ZplPrinter %d not found".formatted(id)));
    }

    public ZplPrinter create(ZplPrinter entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ZplPrinter update(Long id, ZplPrinter entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ZplPrinter %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}