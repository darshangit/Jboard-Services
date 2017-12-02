package com.jboard.services.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Dash on 9/9/2017.
 */
@Entity
@Table(name="RETRO")
public class RetroEntity {

    private Integer sprintUUID;
    private Integer sprintNo;
    private Timestamp startDate;
    private Timestamp endDate;
    private String startComment;
    private String stopComment;
    private String continueComment;
    private String moreComment;
    private String lessComment;
    private String actionItemsComment;
    private Timestamp createTimeStamp;
    private String loginName;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="SPRINT_UUID")
    public Integer getSprintUUID() {
        return sprintUUID;
    }

    @Column(name="SPRINT_NO")
    public Integer getSprintNo() {
        return sprintNo;
    }

    @Column(name="SPRINT_START_DATE")
    public Timestamp getStartDate() {
        return startDate;
    }

    @Column(name="SPRINT_END_DATE")
    public Timestamp getEndDate() {
        return endDate;
    }

    @Column(name="START_COMMENTS")
    public String getStartComment() {
        return startComment;
    }

    @Column(name="STOP_COMMENTS")
    public String getStopComment() {
        return stopComment;
    }

    @Column(name="CONTINUE_COMMENTS")
    public String getContinueComment() {
        return continueComment;
    }

    @Column(name="MORE_COMMENTS")
    public String getMoreComment() {
        return moreComment;
    }

    @Column(name="LESS_COMMENTS")
    public String getLessComment() {
        return lessComment;
    }

    @Column(name="ACTION_COMMENTS")
    public String getActionItemsComment() {
        return actionItemsComment;
    }

    @Column(name="CREATE_TIMESTAMP")
    public Timestamp getCreateTimeStamp() {
        return createTimeStamp;
    }

    @Column(name="LOGIN_USER")
    public String getLoginName() {
        return loginName;
    }

    public void setSprintNo(Integer sprintNo) {
        this.sprintNo = sprintNo;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public void setStartComment(String startComment) {
        this.startComment = startComment;
    }

    public void setStopComment(String stopComment) {
        this.stopComment = stopComment;
    }

    public void setContinueComment(String continueComment) {
        this.continueComment = continueComment;
    }

    public void setMoreComment(String moreComment) {
        this.moreComment = moreComment;
    }

    public void setLessComment(String lessComment) {
        this.lessComment = lessComment;
    }

    public void setActionItemsComment(String actionItemsComment) {
        this.actionItemsComment = actionItemsComment;
    }

    public void setCreateTimeStamp(Timestamp createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public void setSprintUUID(Integer sprintUUID) {
        this.sprintUUID = sprintUUID;
    }
}
