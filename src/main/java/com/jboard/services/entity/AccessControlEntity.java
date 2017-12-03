package com.jboard.services.entity;

import javax.persistence.*;

/**
 * Created by Dash on 12/3/2017.
 */
@Entity
@Table(name="ACCESS_CONTROL")
public class AccessControlEntity {

    private Integer uuid;
    private String user;
    private String routeName;
    private String status;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ACCESS_UUID")
    public Integer getUuid() {
        return uuid;
    }

    @Column(name="LOGIN_USER_NAME")
    public String getUser() {
        return user;
    }

    @Column(name="ROUTE_NAME")
    public String getRouteName() {
        return routeName;
    }

    @Column(name="ROUTE_STATUS")
    public String getStatus() {
        return status;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
