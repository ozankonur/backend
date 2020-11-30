package com.ar.ibb.repository;

import com.ar.ibb.entity.TargetFileEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TargetFileRepository extends CrudRepository<TargetFileEntity,Integer> {

    List<TargetFileEntity> findByFile3D(Boolean is3D);

    List<TargetFileEntity> findByFileActive(Boolean isActive);

    List<TargetFileEntity> findByResource(Boolean isResource);

    List<TargetFileEntity> findByFileName(String fileName);

    List<TargetFileEntity> findByFileType(String fileType);
}
