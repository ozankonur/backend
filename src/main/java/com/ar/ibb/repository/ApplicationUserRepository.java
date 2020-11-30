package com.ar.ibb.repository;

import com.ar.ibb.entity.ApplicationUsersDataEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface ApplicationUserRepository extends CrudRepository<ApplicationUsersDataEntity,Integer> {

    List<ApplicationUsersDataEntity> findByUserPhoneOs(String osName);

    List<ApplicationUsersDataEntity> findByUserActiveDate(Date userActiveDate);

    List<ApplicationUsersDataEntity> findByUserActiveDateAfter(Date dateAfter);

    List<ApplicationUsersDataEntity> findByUserActiveDateBefore(Date dateBefore);

    List<ApplicationUsersDataEntity> findByUserActiveDateBetween(Date fromDate,Date toDate);
}
