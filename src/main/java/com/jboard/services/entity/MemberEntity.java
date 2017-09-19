package com.jboard.services.entity;

import javax.persistence.*;

/**
 * Created by Dash on 9/19/2017.
 */
@Entity
@Table(name="MEMBER")
public class MemberEntity {

    private Integer memberUuid;
    private String memberName;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MEMBER_UUID")
    public Integer getMemberUuid() {
        return memberUuid;
    }

    @Column(name = "MEMBER_NAME")
    public String getMemberName() {
        return memberName;
    }

    public void setMemberUuid(Integer memberUuid) {
        this.memberUuid = memberUuid;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
}
