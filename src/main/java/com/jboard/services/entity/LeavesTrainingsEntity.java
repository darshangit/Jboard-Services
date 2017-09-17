package com.jboard.services.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Dash on 9/12/2017.
 */
@Entity
@Table(name="LEAVES_TRAININGS")
public class LeavesTrainingsEntity {

    private Integer ltUuid;
    private String name;
    private String type;
    private Date fromDate;
    private Date toDate;
    private Integer totalDays;
    private Timestamp createTimeStamp;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "UUID")
    public Integer getLtUuid() {
        return ltUuid;
    }

    @Column(name = "USER_NAME")
    public String getName() {
        return name;
    }

    @Column(name = "VACATION_TYPE")
    public String getType() {
        return type;
    }

    @Column(name = "FROM_DATE")
    public Date getFromDate() {
        return fromDate;
    }

    @Column(name="TO_DATE")
    public Date getToDate() {
        return toDate;
    }

    @Column(name="TOTAL_DAYS")
    public Integer getTotalDays() {
        return totalDays;
    }

    @Column(name="CREATE_TIMESTAMP")
    public Timestamp getCreateTimeStamp() {
        return createTimeStamp;
    }

    public void setLtUuid(Integer ltUuid) {
        this.ltUuid = ltUuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public void setTotalDays(Integer totalDays) {
        this.totalDays = totalDays;
    }

    public void setCreateTimeStamp(Timestamp createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
    }
}
