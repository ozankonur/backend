package com.ar.ibb.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "permissions", schema = "ardb")
public class PermissionsEntity {
    private int id;
    private String permissionName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "permission_name")
    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PermissionsEntity that = (PermissionsEntity) o;
        return id == that.id &&
                Objects.equals(permissionName, that.permissionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, permissionName);
    }
}
