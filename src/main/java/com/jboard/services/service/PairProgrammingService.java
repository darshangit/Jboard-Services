package com.jboard.services.service;

import com.jboard.services.dao.PairProgramDao;
import com.jboard.services.entity.PairProgrammingEntity;
import org.hibernate.StaleStateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dash on 1/1/2018.
 */
@Service
public class PairProgrammingService {

    @Autowired
    private PairProgramDao pairProgramDao;

    public List<PairProgrammingEntity> save(List<PairProgrammingEntity> incomingNames){
        try {
            pairProgramDao.deleteAll();
        }catch (StaleStateException e){
            System.out.println("No Results for Delete All, ignoring exception");
        }
        pairProgramDao.save(incomingNames);
        return pairProgramDao.findAll();
    }

    public List<PairProgrammingEntity> deleteAll(){
        pairProgramDao.deleteAll();
        return pairProgramDao.findAll();
    }

    public List<PairProgrammingEntity> getAllPairProgrammers(){
        return pairProgramDao.findAll();
    }
}
