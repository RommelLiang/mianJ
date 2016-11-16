package com.mian.repository;

import com.mian.bean.EmployeeJob;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * com.mian.repository
 * Created by Reinhard Tristan Eugen Heydrich
 * 2016/11/16.
 */
public interface EmployeeJobRepository extends JpaRepository<EmployeeJob,Long> {
    ArrayList<EmployeeJob> findByAccountUuid(String accountUuid);
    @Override
    Page<EmployeeJob> findAll(Pageable pageable);
}
