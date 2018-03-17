package com.jboard.services.dao;

import com.jboard.services.entity.ScrumEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Dash on 3/17/2018.
 */
@Repository
public interface ScrumAttendanceDao extends JpaRepository<ScrumEntity, Integer> {

    List<ScrumEntity> findAllByMonthYearOrderByDayAsc(String monthAndYear);
    ScrumEntity findByDayEqualsAndMonthYearEquals(Integer day, String monthYear);
}
