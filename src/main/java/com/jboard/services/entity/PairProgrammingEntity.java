package com.jboard.services.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Dash on 1/1/2018.
 */
@Entity
@Table(name="PAIR_PROGRAM")
public class PairProgrammingEntity {

    private String memberName;

    @Id
    @Column(name="MEMBER_NAME")
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
}
