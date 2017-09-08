package com.jboard.services.service;

import com.jboard.services.dao.RetroDao;
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

    public void save(RetroEntity retroEntity){
        retroDao.save(retroEntity);
    }

    public List<RetroEntity> getAllRetros(){
        return retroDao.findTop5ByOrderBySprintNoDesc();
    }
}
