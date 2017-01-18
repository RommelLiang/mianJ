package com.mian.repository;

import com.mian.bean.UserReservation;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * com.mian.repository
 * Created by Reinhard Tristan Eugen Heydrich
 * 2017/1/18
 */
public interface UserReservationRepository extends PagingAndSortingRepository<UserReservation,Long> {
    List<UserReservation> findByOpenId(String openID);
    List<UserReservation> findByDemandId(Long demandID);
    UserReservation findByOpenIdAndDemandId(String openID,Long demandID);
}
