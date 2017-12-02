package com.jboard.services.service;

import com.jboard.services.dao.LoginDao;
import com.jboard.services.entity.LoginEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Dash on 12/2/2017.
 */
@Service
public class LoginService {

    @Autowired
    private LoginDao loginDao;

    public boolean authenticateUser(LoginEntity loginEntity){

        boolean isValidUser = false;
        LoginEntity response = loginDao.findByUserNameEqualsAndPasswordEquals(loginEntity.getUserName(), loginEntity.getPassword());

        if(response != null){
            isValidUser = true;
        }
        return isValidUser;
    }
}
