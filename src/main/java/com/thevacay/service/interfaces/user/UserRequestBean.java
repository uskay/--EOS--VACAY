package com.thevacay.service.interfaces.user;

import lombok.Data;

/**
 * Created by uskay on 2/3/15.
 */
@Data
public class UserRequestBean {

    private String userID;
    private String emailAddress;
    private String loginPassword;

}
