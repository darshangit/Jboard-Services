package com.jboard.services.service;

import com.jboard.services.dao.AccessControlDao;
import com.jboard.services.entity.AccessControlEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.jboard.services.constants.UniversalConstants.ACTIVE;

/**
 * Created by Dash on 12/3/2017.
 */
@Service
public class AccessControlService {

    @Autowired
    AccessControlDao accessControlDao;

    public List<String> getAll(String user) {
        List<AccessControlEntity> accessControlEntities =  accessControlDao.findByUserEqualsAndStatusEquals(user,ACTIVE);
        return accessControlEntities.stream().map(AccessControlEntity::getRouteName).collect(Collectors.toList());
    }

    public List<AccessControlEntity> updateStatus(AccessControlEntity controlEntity) {
        accessControlDao.save(controlEntity);
        return accessControlDao.findByUserEqualsAndStatusEquals(controlEntity.getUser(),ACTIVE);
    }
}
