package com.thevacay.service.interfaces;

import com.thevacay.model.requestparameters.session.SessionLogRequest;
import com.thevacay.model.requestparameters.session.SessionTokenRequest;
import com.thevacay.model.responseparameters.session.SessionLogResponse;
import com.thevacay.model.responseparameters.session.SessionTokenResponse;

/**
 * Created by uskay on 1/29/15.
 */
public interface ISessionService {

    public SessionTokenResponse getToken(SessionTokenRequest request);
    public SessionLogResponse writeLog(SessionLogRequest request);
}
