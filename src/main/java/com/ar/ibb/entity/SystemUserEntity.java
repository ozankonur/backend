package com.ar.ibb.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "systemuser", schema = "ardb")
public class SystemUserEntity {
    private int id;
    private String userEmail;
    private String userPassword;
    private int userRole;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_email")
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Basic
    @Column(name = "user_password")
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Basic
    @Column(name = "user_role")
    public int getUserRole() {
        return userRole;
    }

    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemUserEntity that = (SystemUserEntity) o;
        return id == that.id &&
                userRole == that.userRole &&
                Objects.equals(userEmail, that.userEmail) &&
                Objects.equals(userPassword, that.userPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userEmail, userPassword, userRole);
    }
}
