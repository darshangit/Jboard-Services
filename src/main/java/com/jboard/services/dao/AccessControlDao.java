package com.jboard.services.dao;

import com.jboard.services.entity.AccessControlEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Dash on 12/3/2017.
 */
@Repository
public interface AccessControlDao extends JpaRepository<AccessControlEntity, Integer>{
    List<AccessControlEntity> findByUserEqualsAndStatusEquals(String userName,String status);
}
