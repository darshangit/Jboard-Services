package com.jboard.services.service;

import com.jboard.services.dao.LeavesAndTrainingsDao;
import com.jboard.services.dao.RetroDao;
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

    public void saveRetro(RetroEntity retroEntity){
        retroDao.save(retroEntity);
    }

    public List<RetroEntity> getAllRetros(){
        return retroDao.findTop5ByOrderBySprintNoDesc();
    }

    public  List<LeavesTrainingsEntity> saveLeavesAndTrainings(LeavesTrainingsEntity leavesTrainingsEntity){
        leavesAndTrainingsDao.save(leavesTrainingsEntity);
        return leavesAndTrainingsDao.findAll();
    }

    public List<LeavesTrainingsEntity> getLeavesAndTrainingRows(){
        return leavesAndTrainingsDao.findAll();
    }
}
