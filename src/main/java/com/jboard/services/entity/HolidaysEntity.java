package com.jboard.services.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

/**
 * Created by Dash on 9/18/2017.
 */
@Entity
@Table(name="HOLIDAYS")
public class HolidaysEntity {

    private Integer holidayUuid;
    private String holidayname;
    private Date holidayDate;

    @Id
    @Column(name="HOLIDAY_UUID")
    public Integer getHolidayUuid() {
        return holidayUuid;
    }

    @Column(name="HOLIDAY_NAME")
    public String getHolidayname() {
        return holidayname;
    }

    @Column(name="HOLIDAY_DATE")
    public Date getHolidayDate() {
        return holidayDate;
    }

    public void setHolidayUuid(Integer holidayUuid) {
        this.holidayUuid = holidayUuid;
    }

    public void setHolidayname(String holidayname) {
        this.holidayname = holidayname;
    }

    public void setHolidayDate(Date holidayDate) {
        this.holidayDate = holidayDate;
    }
}
