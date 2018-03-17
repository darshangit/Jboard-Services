package com.jboard.services.service;

import com.jboard.services.dao.ScrumAttendanceDao;
import com.jboard.services.entity.ScrumEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;

/**
 * Created by Dash on 3/17/2018.
 */
@Service
public class ScrumAttendanceService {

    @Autowired
    private ScrumAttendanceDao scrumAttendanceDao;

    public List<ScrumEntity> getScrumAttendanceForTheMonth(String monthAndYear) {
        return scrumAttendanceDao.findAllByMonthYearOrderByDayAsc(monthAndYear);
    }

    public List<ScrumEntity> saveScrumAttendance(ScrumEntity scrumEntity){
        Optional<ScrumEntity> dbScrumEntity = Optional.ofNullable(scrumAttendanceDao.findByDayEqualsAndMonthYearEquals(scrumEntity.getDay(), scrumEntity.getMonthYear()));

        if(dbScrumEntity.isPresent()){
            ScrumEntity scrumEnt = dbScrumEntity.get();
            scrumEntity.setFt1Attendance(StringUtils.isEmpty(scrumEntity.getFt1Attendance())? scrumEnt.getFt1Attendance(): scrumEntity.getFt1Attendance());
            scrumEntity.setFt2Attendance(StringUtils.isEmpty(scrumEntity.getFt2Attendance())? scrumEnt.getFt2Attendance(): scrumEntity.getFt2Attendance());
        }
        scrumAttendanceDao.save(scrumEntity);

        return scrumAttendanceDao.findAll();
    }
}
