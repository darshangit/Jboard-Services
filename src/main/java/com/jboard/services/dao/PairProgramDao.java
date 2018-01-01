package com.jboard.services.dao;

import com.jboard.services.entity.PairProgrammingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Dash on 1/1/2018.
 */
public interface PairProgramDao extends JpaRepository<PairProgrammingEntity,String>{
}
