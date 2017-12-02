package com.jboard.services.service;

import com.jboard.services.dao.SprintPlanningDao;
import com.jboard.services.entity.SprintPlanningEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dash on 11/20/2017.
 */
@Service
public class SprintPlanningService {

    @Autowired
    private SprintPlanningDao sprintPlanningDao;

    public List<SprintPlanningEntity> savePlanning(SprintPlanningEntity sprintPlanningEntity){

        if(sprintPlanningEntity.getPlanningUuid() != null){
            SprintPlanningEntity sprintPlanningFromDb = sprintPlanningDao.findOne(sprintPlanningEntity.getPlanningUuid());
            sprintPlanningFromDb.setAssignee(sprintPlanningEntity.getAssignee());
            sprintPlanningFromDb.setCurrentStatus(sprintPlanningEntity.getCurrentStatus());
            sprintPlanningFromDb.setEndDate(sprintPlanningEntity.getEndDate());
            sprintPlanningFromDb.setStartDate(sprintPlanningEntity.getStartDate());
            sprintPlanningFromDb.setIssueType(sprintPlanningEntity.getIssueType());
            sprintPlanningFromDb.setItemDescription(sprintPlanningEntity.getItemDescription());
            sprintPlanningFromDb.setItemName(sprintPlanningEntity.getItemName());
            sprintPlanningFromDb.setSprintNo(sprintPlanningEntity.getSprintNo());
            sprintPlanningFromDb.setLoginName(sprintPlanningEntity.getLoginName());
            sprintPlanningEntity = sprintPlanningFromDb;
        }
        sprintPlanningDao.save(sprintPlanningEntity);
        return sprintPlanningDao.findAllByLoginNameEquals(sprintPlanningEntity.getLoginName());
    }

    public List<SprintPlanningEntity> getAllPlanningForSprint(Integer sprintNo,String user){
        return sprintPlanningDao.findBySprintNoAndLoginNameEquals(sprintNo, user);
    }

    public List<SprintPlanningEntity> deletePlanning(Integer uuid,Integer sprintNo, String user){
        sprintPlanningDao.delete(uuid);
        return sprintPlanningDao.findBySprintNoAndLoginNameEquals(sprintNo, user);
    }
}
