package com.ar.ibb.service;

import com.ar.ibb.entity.ApplicationUsersDataEntity;
import com.ar.ibb.model.ApplicationUserDTO;
import com.ar.ibb.repository.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.List;

@Component
public class UserDataService {

    @Autowired
    ApplicationUserRepository applicationUserRepository;

    public List<ApplicationUsersDataEntity> getAllUserData() {
        return (List<ApplicationUsersDataEntity>) applicationUserRepository.findAll();
    }

    public List<ApplicationUsersDataEntity> getUserDataByOS(String osName) {
        return applicationUserRepository.findByUserPhoneOs(osName);
    }

    public List<ApplicationUsersDataEntity> getUserDataByActiveDate(Date userActiveDate) {
        return  applicationUserRepository.findByUserActiveDate(userActiveDate);
    }

    public List<ApplicationUsersDataEntity> getUserDataDateAfter(Date dateAfter) {
        return  applicationUserRepository.findByUserActiveDateAfter(dateAfter);
    }

    public List<ApplicationUsersDataEntity> getUserDataDateBefore(Date dateBefore) {
        return  applicationUserRepository.findByUserActiveDateBefore(dateBefore);
    }

    public List<ApplicationUsersDataEntity> getUserDataDateBetween(Date fromDate, Date toDate) {
        return  applicationUserRepository.findByUserActiveDateBetween(fromDate,toDate);
    }

    public void addUserData(ApplicationUserDTO applicationUserDTO) {
        applicationUserRepository.save(toEntity(applicationUserDTO));
    }

    private ApplicationUsersDataEntity toEntity(ApplicationUserDTO applicationUserDTO)
    {
        ApplicationUsersDataEntity applicationUsersDataEntity = new ApplicationUsersDataEntity();
        applicationUsersDataEntity.setUserLocation(applicationUserDTO.getUserLocation());
        applicationUsersDataEntity.setUserPhoneOs(applicationUserDTO.getUserPhoneOs());
        applicationUsersDataEntity.setUserActiveDate(applicationUserDTO.getUserActiveDate());
        applicationUsersDataEntity.setUserEntranceDate(applicationUserDTO.getUserEntranceDate());
        applicationUsersDataEntity.setUserExitDate(applicationUserDTO.getUserExitDate());
        applicationUsersDataEntity.setUserSpendTime(applicationUserDTO.getUserSpendTime());

        return  applicationUsersDataEntity;
    }
}
