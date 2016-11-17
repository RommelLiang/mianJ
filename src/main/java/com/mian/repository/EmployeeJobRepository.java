package com.mian.repository;

import com.mian.bean.EmployeeJob;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

/**
 * com.mian.repository
 * Created by Reinhard Tristan Eugen Heydrich
 * 2016/11/16.
 */
@Transactional
@Component
public interface EmployeeJobRepository extends PagingAndSortingRepository<EmployeeJob,Long> {
    EmployeeJob findByAccountUuid(String accountUuid);
}
