package com.jboard.services.response;

/**
 * Created by Dash on 11/15/2017.
 */
public class LocationDetailsResponse {

    private String projectName;
    private String createDate;
    private Long daysDifference;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Long getDaysDifference() {
        return daysDifference;
    }

    public void setDaysDifference(Long daysDifference) {
        this.daysDifference = daysDifference;
    }
}
