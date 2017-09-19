package com.jboard.services.dao;

import com.jboard.services.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Dash on 9/19/2017.
 */
@Repository
public interface MemberDao extends JpaRepository<MemberEntity, Integer> {
}
