package com.jboard.services.service;

import com.jboard.services.dao.MemberDao;
import com.jboard.services.entity.MemberEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dash on 9/19/2017.
 */
@Service
public class MemberService {

    @Autowired
    private MemberDao memberDao;

    public List<MemberEntity> addMember(String name){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setMemberName(name);
        memberDao.save(memberEntity);

        return memberDao.findAll();
    }

    public List<MemberEntity> deleteMember(Integer id) {
        memberDao.delete(id);
        return  memberDao.findAll();
    }

    public List<MemberEntity> getAllMembers() {
        return  memberDao.findAll();
    }


}
