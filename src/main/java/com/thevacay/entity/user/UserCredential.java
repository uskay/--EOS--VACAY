package com.thevacay.entity.user;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by uskay on 2/15/15.
 */
@Entity
@Table(name = "USER_CREDENTIAL")
public @Data
class UserCredential {

    @Id
    private long userID;
    private String loginID;
    private String password;
}
