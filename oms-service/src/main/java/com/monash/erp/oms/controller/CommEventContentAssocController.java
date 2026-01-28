package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.CommEventContentAssoc;
import com.monash.erp.oms.service.CommEventContentAssocService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/comm-event-content-assocs")
public class CommEventContentAssocController {

    private final CommEventContentAssocService service;

    public CommEventContentAssocController(CommEventContentAssocService service) {
        this.service = service;
    }

    @GetMapping
    public List<CommEventContentAssoc> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CommEventContentAssoc get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CommEventContentAssoc> create(@RequestBody CommEventContentAssoc entity) {
        CommEventContentAssoc created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CommEventContentAssoc update(@PathVariable Long id, @RequestBody CommEventContentAssoc entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}