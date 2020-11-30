package com.ar.ibb.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "targetfile", schema = "ardb")
public class TargetFileEntity {
    private int id;
    private boolean isFile3D;
    private boolean fileActive;
    private String fileName;
    private String filePath;
    private boolean isResource;
    private String fileType;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "is_file3d")
    public boolean isFile3D() {
        return isFile3D;
    }

    public void setFile3D(boolean file3D) {
        isFile3D = file3D;
    }

    @Basic
    @Column(name = "file_active")
    public boolean isFileActive() {
        return fileActive;
    }

    public void setFileActive(boolean fileActive) {
        this.fileActive = fileActive;
    }

    @Basic
    @Column(name = "file_name")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Basic
    @Column(name = "file_path")
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Basic
    @Column(name = "is_resource")
    public boolean isResource() {
        return isResource;
    }

    public void setResource(boolean resource) {
        isResource = resource;
    }

    @Basic
    @Column(name = "file_type")
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TargetFileEntity that = (TargetFileEntity) o;
        return id == that.id &&
                isFile3D == that.isFile3D &&
                fileActive == that.fileActive &&
                isResource == that.isResource &&
                Objects.equals(fileName, that.fileName) &&
                Objects.equals(filePath, that.filePath) &&
                Objects.equals(fileType, that.fileType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isFile3D, fileActive, fileName, filePath, isResource, fileType);
    }
}
