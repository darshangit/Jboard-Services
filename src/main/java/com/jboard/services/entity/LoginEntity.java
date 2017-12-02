package com.jboard.services.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOGIN")
public class LoginEntity {

    private String userName;
    private String password;

    @Id
    @Column(name="LOGIN_USER_NAME")
    public String getUserName() {
        return userName;
    }

    @Column(name="LOGIN_PASSWORD")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
