package com.jboard.services.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Dash on 11/20/2017.
 */
@Entity
@Table(name="SPRINT_PLANNING")
public class SprintPlanningEntity {

    private Integer planningUuid;
    private String itemName;
    private String itemDescription;
    private String issueType;
    private Date startDate;
    private Date endDate;
    private String assignee;
    private String currentStatus;
    private Integer sprintNo;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="PLANNING_UUID")
    public Integer getPlanningUuid() {
        return planningUuid;
    }

    @Column(name="ITEM_NAME")
    public String getItemName() {
        return itemName;
    }

    @Column(name="ITEM_DESCRIPTION")
    public String getItemDescription() {
        return itemDescription;
    }

    @Column(name="ISSUE_TYPE")
    public String getIssueType() {
        return issueType;
    }

    @Column(name="ITEM_START_DATE")
    public Date getStartDate() {
        return startDate;
    }

    @Column(name="ITEM_END_DATE")
    public Date getEndDate() {
        return endDate;
    }

    @Column(name="ITEM_ASSIGNEE")
    public String getAssignee() {
        return assignee;
    }

    @Column(name="ITEM_STATUS")
    public String getCurrentStatus() {
        return currentStatus;
    }

    @Column(name="SPRINT_NO")
    public Integer getSprintNo() {
        return sprintNo;
    }

    public void setPlanningUuid(Integer planningUuid) {
        this.planningUuid = planningUuid;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public void setSprintNo(Integer sprintNo) {
        this.sprintNo = sprintNo;
    }
}
