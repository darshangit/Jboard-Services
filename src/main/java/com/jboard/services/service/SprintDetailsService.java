package com.jboard.services.service;

import com.jboard.services.dao.SprintDetailsDao;
import com.jboard.services.entity.SprintDetailsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.jboard.services.constants.UniversalConstants.CURRENT_SPRINT_STATUS;

/**
 * Created by Dash on 11/30/2017.
 */
@Service
public class SprintDetailsService {

    @Autowired
    private SprintDetailsDao sprintDetailsDao;

    public List<SprintDetailsEntity> getAllSprints(String user) {
        return  sprintDetailsDao.findAllByLoginNameOrderBySprintStatusAscSprintNumberDesc(user);
    }

    public List<SprintDetailsEntity> deleteSprint(Integer sprintNo, String user){
        SprintDetailsEntity currentSprintEntity = sprintDetailsDao.findBySprintNumberEqualsAndLoginNameEquals(sprintNo,user);
        sprintDetailsDao.delete(currentSprintEntity.getSprintUUID());

        return sprintDetailsDao.findAllByLoginNameOrderBySprintStatusAscSprintNumberDesc(user);
    }

    public List<SprintDetailsEntity> markAsCurrentSprint(Integer sprintNo, String user){
        Optional<SprintDetailsEntity> sprintDetailsEntity = Optional.ofNullable(sprintDetailsDao.findBySprintStatusEqualsAndLoginNameEquals(CURRENT_SPRINT_STATUS,user));

        if(sprintDetailsEntity.isPresent()){
            SprintDetailsEntity entity =  sprintDetailsEntity.get();
            entity.setSprintStatus(null);
            sprintDetailsDao.save(entity);
        }
        SprintDetailsEntity currentSprintEntity = sprintDetailsDao.findBySprintNumberEqualsAndLoginNameEquals(sprintNo,user);
        currentSprintEntity.setSprintStatus(CURRENT_SPRINT_STATUS);
        sprintDetailsDao.save(currentSprintEntity);

        return sprintDetailsDao.findAllByLoginNameOrderBySprintStatusAscSprintNumberDesc(user);
    }

    public List<SprintDetailsEntity> addSprint(Integer sprintNo,String user){
        SprintDetailsEntity sprintDetailsEntity = new SprintDetailsEntity();
        sprintDetailsEntity.setSprintStatus(null);
        sprintDetailsEntity.setSprintNumber(sprintNo);
        sprintDetailsEntity.setLoginName(user);

        sprintDetailsDao.save(sprintDetailsEntity);
        return sprintDetailsDao.findAllByLoginNameOrderBySprintStatusAscSprintNumberDesc(user);
    }

    public SprintDetailsEntity getCurrentSprint(String user){
        SprintDetailsEntity sprintDetailsEntity =  sprintDetailsDao.findBySprintStatusEqualsAndLoginNameEquals(CURRENT_SPRINT_STATUS,user);
        return sprintDetailsEntity;
    }
}
