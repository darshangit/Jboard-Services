package com.jboard.services.dao;

import com.jboard.services.entity.SprintPlanningEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Dash on 11/20/2017.
 */
@Repository
public interface SprintPlanningDao extends JpaRepository<SprintPlanningEntity, Integer>{

    List<SprintPlanningEntity> findBySprintNo(Integer sprintNo);
}
