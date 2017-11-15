package com.jboard.services.dao;

import com.jboard.services.entity.JarLocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Dash on 11/15/2017.
 */
@Repository
public interface JarLocationDao extends JpaRepository<JarLocationEntity, String>{
}
