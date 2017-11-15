package com.jboard.services.response;

import java.util.List;

/**
 * Created by Dash on 11/15/2017.
 */
public class LocationWrapperDetails {

    String systemDate;

    List<LocationDetailsResponse> locationDetailsResponseList;

    public String getSystemDate() {
        return systemDate;
    }

    public void setSystemDate(String systemDate) {
        this.systemDate = systemDate;
    }

    public List<LocationDetailsResponse> getLocationDetailsResponseList() {
        return locationDetailsResponseList;
    }

    public void setLocationDetailsResponseList(List<LocationDetailsResponse> locationDetailsResponseList) {
        this.locationDetailsResponseList = locationDetailsResponseList;
    }
}
