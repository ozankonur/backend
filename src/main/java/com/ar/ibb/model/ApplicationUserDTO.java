package com.ar.ibb.model;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class ApplicationUserDTO {

    private int id;
    private String userLocation;
    private String userPhoneOs;
    private Time userSpendTime;
    private Timestamp userEntranceDate;
    private Timestamp userExitDate;
    private Date userActiveDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public String getUserPhoneOs() {
        return userPhoneOs;
    }

    public void setUserPhoneOs(String userPhoneOs) {
        this.userPhoneOs = userPhoneOs;
    }

    public Time getUserSpendTime() {
        return userSpendTime;
    }

    public void setUserSpendTime(Time userSpendTime) {
        this.userSpendTime = userSpendTime;
    }

    public Timestamp getUserEntranceDate() {
        return userEntranceDate;
    }

    public void setUserEntranceDate(Timestamp userEntranceDate) {
        this.userEntranceDate = userEntranceDate;
    }

    public Timestamp getUserExitDate() {
        return userExitDate;
    }

    public void setUserExitDate(Timestamp userExitDate) {
        this.userExitDate = userExitDate;
    }

    public Date getUserActiveDate() {
        return userActiveDate;
    }

    public void setUserActiveDate(Date userActiveDate) {
        this.userActiveDate = userActiveDate;
    }
}
