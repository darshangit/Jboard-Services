package com.jboard.services.entity;

import javax.persistence.*;

/**
 * Created by Dash on 3/17/2018.
 */
@Entity
@Table(name="SCRUM_ATTENDANCE")
public class ScrumEntity {

    private Integer attendanceUUID;
    private Integer day;
    private String monthYear;
    private String ft1Attendance;
    private String ft2Attendance;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="SCRUM_ATT_UUID")
    public Integer getAttendanceUUID() {
        return attendanceUUID;
    }

    @Column(name="SCRUM_DAY")
    public Integer getDay() {
        return day;
    }

    @Column(name="MONTH_YEAR")
    public String getMonthYear() {
        return monthYear;
    }

    @Column(name="FT1")
    public String getFt1Attendance() {
        return ft1Attendance;
    }

    @Column(name="FT2")
    public String getFt2Attendance() {
        return ft2Attendance;
    }

    public void setAttendanceUUID(Integer attendanceUUID) {
        this.attendanceUUID = attendanceUUID;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public void setMonthYear(String monthYear) {
        this.monthYear = monthYear;
    }

    public void setFt1Attendance(String ft1Attendance) {
        this.ft1Attendance = ft1Attendance;
    }

    public void setFt2Attendance(String ft2Attendance) {
        this.ft2Attendance = ft2Attendance;
    }
}
