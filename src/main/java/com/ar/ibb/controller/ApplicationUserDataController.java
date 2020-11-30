package com.ar.ibb.controller;

import com.ar.ibb.entity.ApplicationUsersDataEntity;
import com.ar.ibb.requestModel.userDataRequestModel.*;
import com.ar.ibb.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
public class ApplicationUserDataController {

    @Autowired
    UserDataService userDataService;

    @RequestMapping(path="/allUserData",method = RequestMethod.POST, consumes = "application/json")
    public List<ApplicationUsersDataEntity> getAllUserData(){
        return userDataService.getAllUserData();
    }

    @RequestMapping(path="/userDataByOS",method = RequestMethod.POST, consumes = "application/json")
    public List<ApplicationUsersDataEntity> getAllUserDataByOS(@RequestBody UserDataByPhoneOS phoneOS){
        return userDataService.getUserDataByOS(phoneOS.getPhoneOS());
    }

    @RequestMapping(path="/userDataByActiveDate",method = RequestMethod.POST, consumes = "application/json")
    public List<ApplicationUsersDataEntity> getUserDataByActiveDate(@RequestBody UserDataByActiveDate activeDate){
        Date sqlActiveDate = Date.valueOf(activeDate.getActiveDate());
        return userDataService.getUserDataByActiveDate(sqlActiveDate);
    }

    @RequestMapping(path="/userDataDateAfter",method = RequestMethod.POST, consumes = "application/json")
    public List<ApplicationUsersDataEntity> getUserDataDateFrom(@RequestBody UserDataDateAfter dateAfter){
        Date sqlDateAfter = Date.valueOf(dateAfter.getDateAfter());
        return userDataService.getUserDataDateAfter(sqlDateAfter);
    }

    @RequestMapping(path="/userDataDateBefore",method = RequestMethod.POST, consumes = "application/json")
    public List<ApplicationUsersDataEntity> getUserDataDateBefore(@RequestBody UserDataDateBefore dateBefore){
        Date sqlDateBefore = Date.valueOf(dateBefore.getDateBefore());
        return userDataService.getUserDataDateBefore(sqlDateBefore);
    }

    @RequestMapping(path="/userDataDateBetween",method = RequestMethod.POST, consumes = "application/json")
    public List<ApplicationUsersDataEntity> getUserDataDateBetween(@RequestBody UserDataDateBetween userDataDateBetween){
        Date sqlFromDate = Date.valueOf(userDataDateBetween.getFromDate());
        Date sqlToDate = Date.valueOf(userDataDateBetween.getToDate());
        return userDataService.getUserDataDateBetween(sqlFromDate,sqlToDate);
    }
}
