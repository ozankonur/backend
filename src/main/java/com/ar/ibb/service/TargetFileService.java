package com.ar.ibb.service;

import com.ar.ibb.entity.TargetFileEntity;
import com.ar.ibb.model.TargetFileDTO;
import com.ar.ibb.repository.TargetFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TargetFileService {

    @Autowired
    TargetFileRepository targetFileRepository;

    public List<TargetFileEntity> getAllFiles() {
        return (List<TargetFileEntity>) targetFileRepository.findAll();
    }

    public List<TargetFileEntity> get3DfilesOnly() {
        return targetFileRepository.findByFile3D(true);
    }

    public List<TargetFileEntity> get2DfilesOnly() {
        return targetFileRepository.findByFile3D(false);
    }

    public List<TargetFileEntity> getFilesByType(String fileType) {
        return targetFileRepository.findByFileType(fileType);
    }

    public void addFile(TargetFileDTO targetFileDTO) {
        targetFileRepository.save(toEntity(targetFileDTO));
    }

    private TargetFileEntity toEntity(TargetFileDTO targetFileDTO)
    {
        TargetFileEntity TargetFileEntity = new TargetFileEntity();
        TargetFileEntity.setFile3D(targetFileDTO.getFile3D());
        TargetFileEntity.setFileActive(targetFileDTO.getFileActive());
        TargetFileEntity.setFileName(targetFileDTO.getFileName());
        TargetFileEntity.setFilePath(targetFileDTO.getFilePath());
        TargetFileEntity.setResource(targetFileDTO.getResource());
        TargetFileEntity.setFileType(targetFileDTO.getFileType());

        return  TargetFileEntity;
    }
}
