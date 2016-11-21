package com.mian.repository;

import com.mian.bean.EmployerDemand;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


/**
 * com.mian.repository
 * Created by Reinhard Tristan Eugen Heydrich
 * 2016/11/16.
 */
@Transactional
@Component
public interface EmployerDemandRepository extends PagingAndSortingRepository<EmployerDemand,Long> {
    ArrayList<EmployerDemand> findByAccountUuid(String accountUuid);

    EmployerDemand findByDemandUuid(String uuid);

    @Override
    Page<EmployerDemand> findAll(Pageable pageable);
    List<EmployerDemand> findAll();
}
