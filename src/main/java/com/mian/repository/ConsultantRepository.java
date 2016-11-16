package com.mian.repository;

import com.mian.bean.Consultant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by victor on 12/11/2016.
 */
@Repository
public interface ConsultantRepository extends JpaRepository<Consultant,Long>{
    Consultant findByAccountUuid(String accountUuid);
    @Override
    Page<Consultant> findAll(Pageable pageable);
}
