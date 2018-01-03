package com.jboard.services.dao;

import com.jboard.services.entity.PairProgrammingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Dash on 1/1/2018.
 */
@Repository
public interface PairProgramDao extends JpaRepository<PairProgrammingEntity,String>{
}
