package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.CommEventContentAssoc;
import com.monash.erp.oms.repository.CommEventContentAssocRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CommEventContentAssocService {

    private final CommEventContentAssocRepository repository;

    public CommEventContentAssocService(CommEventContentAssocRepository repository) {
        this.repository = repository;
    }

    public List<CommEventContentAssoc> list() {
        return repository.findAll();
    }

    public CommEventContentAssoc get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CommEventContentAssoc %d not found".formatted(id)));
    }

    public CommEventContentAssoc create(CommEventContentAssoc entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CommEventContentAssoc update(Long id, CommEventContentAssoc entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CommEventContentAssoc %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}