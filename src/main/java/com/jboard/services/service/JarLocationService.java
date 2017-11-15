package com.jboard.services.service;

import com.jboard.services.dao.JarLocationDao;
import com.jboard.services.entity.JarLocationEntity;
import com.jboard.services.response.LocationDetailsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.directory.BasicAttributes;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dash on 11/15/2017.
 */
@Service
public class JarLocationService {

    @Autowired
    private JarLocationDao jarLocationDao;

    public List<LocationDetailsResponse> getJarLocationDetails(){
        List<JarLocationEntity> jarLocationEntities = jarLocationDao.findAll();
        List<LocationDetailsResponse> locationDetailsResponses = new ArrayList<>();

        if(jarLocationEntities != null &&  !jarLocationEntities.isEmpty()){
            jarLocationEntities.stream().forEach(jarLocationEntity -> {
                LocationDetailsResponse locationDetailsResponse = new LocationDetailsResponse();

                Path filePath = Paths.get(jarLocationEntity.getProjectPath());
                locationDetailsResponse.setProjectName(jarLocationEntity.getProjectName());
                try {
                    BasicFileAttributes fileAttributes = Files.getFileAttributeView(filePath, BasicFileAttributeView.class).readAttributes();
                    LocalDateTime ldt = LocalDateTime.ofInstant(Instant.ofEpochMilli(fileAttributes.lastModifiedTime().toMillis()), ZoneId.systemDefault());
                    locationDetailsResponse.setCreateDate(ldt.format(DateTimeFormatter.ofPattern("MMM-dd-yyyy h:mm a")));

                    locationDetailsResponses.add(locationDetailsResponse);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
        return locationDetailsResponses;
    }
}
