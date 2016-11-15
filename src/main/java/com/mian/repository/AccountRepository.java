package com.mian.repository;


import com.mian.bean.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * com.mian.repository
 * Created by Reinhard Tristan Eugen Heydrich
 * 2016/11/14.
 */
@Repository
public interface AccountRepository extends JpaRepository<Account,Long>{
    Account findByOpenId(String openId);
    Account findByAccountUuid(String accoundUuid);
}
