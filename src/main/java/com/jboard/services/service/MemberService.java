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

    public List<MemberEntity> addMember(String name, String user){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setMemberName(name);
        memberEntity.setLoginName(user);
        memberDao.save(memberEntity);

        return memberDao.findAllByLoginNameOrderByMemberNameAsc(user);
    }

    public List<MemberEntity> deleteMember(Integer id, String user) {
        memberDao.delete(id);
        return  memberDao.findAllByLoginNameOrderByMemberNameAsc(user);
    }

    public List<MemberEntity> getAllMembers(String user) {
        return  memberDao.findAllByLoginNameOrderByMemberNameAsc(user);
    }


}
