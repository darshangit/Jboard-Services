package com.jboard.services.dao;

import com.jboard.services.entity.LeavesTrainingsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Dash on 9/12/2017.
 */
@Repository
public interface LeavesAndTrainingsDao extends JpaRepository<LeavesTrainingsEntity, Integer>{
    List<LeavesTrainingsEntity> findAllByLoginNameEquals(String user);
}
