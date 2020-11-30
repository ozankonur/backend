package com.ar.ibb.controller;

import com.ar.ibb.entity.TargetFileEntity;
import com.ar.ibb.requestModel.targetFileRequestModel.TargetFileByType;
import com.ar.ibb.service.TargetFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TargetFileController {

    @Autowired
    TargetFileService targetFileService;

    @RequestMapping(path="/allFiles",method = RequestMethod.POST, consumes = "application/json")
    public List<TargetFileEntity> getAllFiles(){
        return targetFileService.getAllFiles();
    }

    @RequestMapping(path="/fileByType",method = RequestMethod.POST, consumes = "application/json")
    public List<TargetFileEntity> getFileByType(@RequestBody TargetFileByType targetFileByType){
        return targetFileService.getFilesByType(targetFileByType.getFileType());
    }

}
