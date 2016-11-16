package com.mian.repository;

import com.mian.bean.Consultant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * Created by victor on 12/11/2016.
 */
@Transactional
@Component
public interface ConsultantRepository extends PagingAndSortingRepository<Consultant,Long> {
    Consultant findByAccountUuid(String accountUuid);

}
