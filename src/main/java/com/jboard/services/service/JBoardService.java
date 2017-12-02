package com.jboard.services.service;

import com.jboard.services.dao.HolidayDao;
import com.jboard.services.dao.LeavesAndTrainingsDao;
import com.jboard.services.dao.RetroDao;
import com.jboard.services.entity.HolidaysEntity;
import com.jboard.services.entity.LeavesTrainingsEntity;
import com.jboard.services.entity.RetroEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dash on 9/9/2017.
 */
@Service
public class JBoardService {

    @Autowired
    private RetroDao retroDao;

    @Autowired
    private LeavesAndTrainingsDao leavesAndTrainingsDao;

    @Autowired
    private HolidayDao holidayDao;

    public void saveRetro(RetroEntity retroEntity){
        retroDao.save(retroEntity);
    }

    public List<RetroEntity> getAllRetros(String user){
        return retroDao.findTop5ByLoginNameEqualsOrderBySprintNoDesc(user);
    }

    public List<RetroEntity> deleteRetro(Integer sprintUUID,String user){
        retroDao.delete(sprintUUID);
        return retroDao.findTop5ByLoginNameEqualsOrderBySprintNoDesc(user);
    }

    public  List<LeavesTrainingsEntity> saveLeavesAndTrainings(LeavesTrainingsEntity leavesTrainingsEntity){
        if(leavesTrainingsEntity.getLtUuid() != null){
            LeavesTrainingsEntity leavesTrainEnt = leavesAndTrainingsDao.findOne(leavesTrainingsEntity.getLtUuid());
            leavesTrainEnt.setName(leavesTrainingsEntity.getName());
            leavesTrainEnt.setType(leavesTrainingsEntity.getType());
            leavesTrainEnt.setFromDate(leavesTrainingsEntity.getFromDate());
            leavesTrainEnt.setToDate(leavesTrainingsEntity.getToDate());
            leavesTrainEnt.setCreateTimeStamp(leavesTrainingsEntity.getCreateTimeStamp());
            leavesTrainEnt.setTotalDays(leavesTrainingsEntity.getTotalDays());
            leavesTrainEnt.setLoginName(leavesTrainingsEntity.getLoginName());
            leavesTrainingsEntity = leavesTrainEnt;
        }
        leavesAndTrainingsDao.save(leavesTrainingsEntity);
        return leavesAndTrainingsDao.findAllByLoginNameEquals(leavesTrainingsEntity.getLoginName());
    }

    public List<LeavesTrainingsEntity> getLeavesAndTrainingRows(String user){
        return leavesAndTrainingsDao.findAllByLoginNameEquals(user);
    }

    public  List<LeavesTrainingsEntity> deleteLeaveAndTrainingEntity(Integer uuid,String user){
        leavesAndTrainingsDao.delete(uuid);
        return leavesAndTrainingsDao.findAllByLoginNameEquals(user);
    }

    public List<HolidaysEntity> getHolidayList(){
        return holidayDao.findAll();
    }


}
