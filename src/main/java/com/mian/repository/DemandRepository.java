package com.mian.repository;

import com.mian.bean.Demand;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * com.mian.repository
 * Created by Reinhard Tristan Eugen Heydrich
 * 2017/1/18
 */
public interface DemandRepository extends PagingAndSortingRepository<Demand,Long> {
    List<Demand> findByOpenId(String opemId);
    Demand findById(Long id);
    @Override
    Page<Demand> findAll(Pageable pageable);
}
