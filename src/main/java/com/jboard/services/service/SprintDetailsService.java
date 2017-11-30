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

    public List<SprintDetailsEntity> getAllSprints() {
        return  sprintDetailsDao.findAllByOrderBySprintStatusAsc();
    }

    public List<SprintDetailsEntity> deleteSprint(Integer sprintNo){
        sprintDetailsDao.delete(sprintNo);
        return sprintDetailsDao.findAllByOrderBySprintStatusAsc();
    }

    public List<SprintDetailsEntity> markAsCurrentSprint(Integer sprintNo){
        Optional<SprintDetailsEntity> sprintDetailsEntity = Optional.ofNullable(sprintDetailsDao.findBySprintStatusEquals(CURRENT_SPRINT_STATUS));

        if(sprintDetailsEntity.isPresent()){
            SprintDetailsEntity entity =  sprintDetailsEntity.get();
            entity.setSprintStatus(null);
            sprintDetailsDao.save(entity);
        }
        SprintDetailsEntity currentSprintEntity = sprintDetailsDao.findOne(sprintNo);
        currentSprintEntity.setSprintStatus(CURRENT_SPRINT_STATUS);
        sprintDetailsDao.save(currentSprintEntity);

        return sprintDetailsDao.findAllByOrderBySprintStatusAsc();
    }

    public List<SprintDetailsEntity> addSprint(Integer sprintNo){
        SprintDetailsEntity sprintDetailsEntity = new SprintDetailsEntity();
        sprintDetailsEntity.setSprintStatus(null);
        sprintDetailsEntity.setSprintNumber(sprintNo);

        sprintDetailsDao.save(sprintDetailsEntity);
        return sprintDetailsDao.findAllByOrderBySprintStatusAsc();
    }
}
