package com.mian.repository;

import com.mian.bean.Elite;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * com.mian.repository
 * Created by Reinhard Tristan Eugen Heydrich
 * 2017/1/17
 */
public interface EliteRepository extends PagingAndSortingRepository<Elite,Long> {
    Elite findByOpenId(String openId);
    @Override
    Page<Elite> findAll(Pageable pageable);
}
