package com.thevacay.service.interfaces.session;

import lombok.Data;

/**
 * Created by uskay on 2/3/15.
 */
@Data
public class SessionRequestBean {

    private String userID;
    private String password;
    private String operationID;

}
