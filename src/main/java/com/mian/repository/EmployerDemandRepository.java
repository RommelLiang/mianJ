package com.mian.repository;

import com.mian.bean.EmployerDemand;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

/**
 * com.mian.repository
 * Created by Reinhard Tristan Eugen Heydrich
 * 2016/11/16.
 */
public interface EmployerDemandRepository extends JpaRepository<EmployerDemand,Long> {
    ArrayList<EmployerDemand> findByAccountUuid(String accountUuid);

    @Override
    Page<EmployerDemand> findAll(Pageable pageable);
}
