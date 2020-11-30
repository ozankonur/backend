package com.ar.ibb.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "applicationusersdata", schema = "ardb")
public class ApplicationUsersDataEntity {
    private int id;
    private Date userActiveDate;
    private Timestamp userEntranceDate;
    private Timestamp userExitDate;
    private String userLocation;
    private String userPhoneOs;
    private Time userSpendTime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_active_date")
    public Date getUserActiveDate() {
        return userActiveDate;
    }

    public void setUserActiveDate(Date userActiveDate) {
        this.userActiveDate = userActiveDate;
    }

    @Basic
    @Column(name = "user_entrance_date")
    public Timestamp getUserEntranceDate() {
        return userEntranceDate;
    }

    public void setUserEntranceDate(Timestamp userEntranceDate) {
        this.userEntranceDate = userEntranceDate;
    }

    @Basic
    @Column(name = "user_exit_date")
    public Timestamp getUserExitDate() {
        return userExitDate;
    }

    public void setUserExitDate(Timestamp userExitDate) {
        this.userExitDate = userExitDate;
    }

    @Basic
    @Column(name = "user_location")
    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    @Basic
    @Column(name = "user_phone_os")
    public String getUserPhoneOs() {
        return userPhoneOs;
    }

    public void setUserPhoneOs(String userPhoneOs) {
        this.userPhoneOs = userPhoneOs;
    }

    @Basic
    @Column(name = "user_spend_time")
    public Time getUserSpendTime() {
        return userSpendTime;
    }

    public void setUserSpendTime(Time userSpendTime) {
        this.userSpendTime = userSpendTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApplicationUsersDataEntity that = (ApplicationUsersDataEntity) o;
        return id == that.id &&
                Objects.equals(userActiveDate, that.userActiveDate) &&
                Objects.equals(userEntranceDate, that.userEntranceDate) &&
                Objects.equals(userExitDate, that.userExitDate) &&
                Objects.equals(userLocation, that.userLocation) &&
                Objects.equals(userPhoneOs, that.userPhoneOs) &&
                Objects.equals(userSpendTime, that.userSpendTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userActiveDate, userEntranceDate, userExitDate, userLocation, userPhoneOs, userSpendTime);
    }
}
