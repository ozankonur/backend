package com.ar.ibb.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "resourcefile", schema = "ardb")
public class ResourceFileEntity {
    private int id;
    private boolean fileActive;
    private String fileName;
    private String filePath;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResourceFileEntity that = (ResourceFileEntity) o;
        return id == that.id &&
                fileActive == that.fileActive &&
                Objects.equals(fileName, that.fileName) &&
                Objects.equals(filePath, that.filePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fileActive, fileName, filePath);
    }
}
