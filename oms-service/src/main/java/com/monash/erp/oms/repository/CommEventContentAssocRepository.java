package com.monash.erp.oms.repository;

import com.monash.erp.oms.entity.CommEventContentAssoc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommEventContentAssocRepository extends JpaRepository<CommEventContentAssoc, Long> {
}