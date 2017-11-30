package com.jboard.services.dao;

import com.jboard.services.entity.SprintDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Dash on 11/30/2017.
 */
@Repository
public interface SprintDetailsDao extends JpaRepository<SprintDetailsEntity, Integer> {

    SprintDetailsEntity findBySprintStatusEquals(String sprintStatus);
    List<SprintDetailsEntity> findAllByOrderBySprintStatusAsc();

}
