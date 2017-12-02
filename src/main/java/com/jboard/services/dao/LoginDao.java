package com.jboard.services.dao;

import com.jboard.services.entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Dash on 12/2/2017.
 */
@Repository
public interface LoginDao extends JpaRepository<LoginEntity, String> {

    LoginEntity findByUserNameEqualsAndPasswordEquals(String userName,String password);
}
