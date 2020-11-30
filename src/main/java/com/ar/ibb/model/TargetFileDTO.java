package com.ar.ibb.model;

public class TargetFileDTO {

    private int id;
    private String fileName;
    private String filePath;
    private Boolean fileActive;
    private Boolean file3D;
    private Boolean isResource;
    private String fileType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Boolean getFileActive() {
        return fileActive;
    }

    public void setFileActive(Boolean fileActive) {
        this.fileActive = fileActive;
    }

    public Boolean getFile3D() {
        return file3D;
    }

    public void setFile3D(Boolean file3D) {
        this.file3D = file3D;
    }

    public Boolean getResource() {
        return isResource;
    }

    public void setResource(Boolean resource) {
        isResource = resource;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
}
