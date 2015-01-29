package com.thevacay.model.requestparameters.session;

import javax.validation.constraints.NotNull;

/**
 * Created by uskay on 1/29/15.
 */
public class SessionLogRequest {

    @NotNull
    private String sessionToken;
}
