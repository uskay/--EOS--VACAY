package com.thevacay.model.requestparameters.session;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Created by uskay on 1/29/15.
 */
@Data
public class SessionTokenRequest {

    @NotNull
    private String sessionToken;
}
