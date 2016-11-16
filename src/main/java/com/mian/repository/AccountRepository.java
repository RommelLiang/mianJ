package com.mian.repository;


import com.mian.bean.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * com.mian.repository
 * Created by Reinhard Tristan Eugen Heydrich
 * 2016/11/14.
 */
@Transactional
@Component
public interface AccountRepository extends PagingAndSortingRepository<Account,Long> {
    Account findByOpenId(String openId);
    Account findByAccountUuid(String accoundUuid);
}
