package com.thevacay.entity;

import javax.persistence.Table;

/**
 * Created by uskay on 2/15/15.
 */
@Table(name = "USER_CREDENTIAL")
public class UserCredential {

    private long userID;
    private String loginID;
    private String password;
}
