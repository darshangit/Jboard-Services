package com.jboard.services.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Dash on 11/30/2017.
 */
@Entity
@Table(name="SPRINT_DETAILS")
public class SprintDetailsEntity {

    private Integer sprintNumber;
    private String sprintStatus;

    @Id
    @Column(name="SPRINT_NUMBER")
    public Integer getSprintNumber() {
        return sprintNumber;
    }

    @Column(name="SPRINT_STATUS")
    public String getSprintStatus() {
        return sprintStatus;
    }

    public void setSprintNumber(Integer sprintNumber) {
        this.sprintNumber = sprintNumber;
    }

    public void setSprintStatus(String sprintStatus) {
        this.sprintStatus = sprintStatus;
    }
}
