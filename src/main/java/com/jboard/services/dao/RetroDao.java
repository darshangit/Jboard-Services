package com.jboard.services.dao;

import com.jboard.services.entity.RetroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Dash on 9/9/2017.
 */
@Repository
public interface RetroDao extends JpaRepository<RetroEntity, Integer> {

    List<RetroEntity> findTop5ByLoginNameEqualsOrderBySprintNoDesc(String user);
}
