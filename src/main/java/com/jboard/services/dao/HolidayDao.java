package com.jboard.services.dao;

import com.jboard.services.entity.HolidaysEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Dash on 9/18/2017.
 */
@Repository
public interface HolidayDao extends JpaRepository<HolidaysEntity, Integer>{
}
