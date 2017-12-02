package com.jboard.services.entity;

import javax.persistence.*;

/**
 * Created by Dash on 11/30/2017.
 */
@Entity
@Table(name="SPRINT_DETAILS")
public class SprintDetailsEntity {

    private Integer sprintUUID;
    private Integer sprintNumber;
    private String sprintStatus;
    private String loginName;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="SPRINT_UUID")
    public Integer getSprintUUID() {
        return sprintUUID;
    }

    @Column(name="SPRINT_NUMBER")
    public Integer getSprintNumber() {
        return sprintNumber;
    }

    @Column(name="SPRINT_STATUS")
    public String getSprintStatus() {
        return sprintStatus;
    }

    @Column(name="LOGIN_USER")
    public String getLoginName() {
        return loginName;
    }

    public void setSprintNumber(Integer sprintNumber) {
        this.sprintNumber = sprintNumber;
    }

    public void setSprintStatus(String sprintStatus) {
        this.sprintStatus = sprintStatus;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public void setSprintUUID(Integer sprintUUID) {
        this.sprintUUID = sprintUUID;
    }
}
