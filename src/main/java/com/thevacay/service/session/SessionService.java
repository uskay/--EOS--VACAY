package com.thevacay.service.session;

import com.thevacay.core.IRequest;
import com.thevacay.core.IResponse;
import com.thevacay.core.ServiceAPI;

/**
 * Created by uskay on 1/25/15.
 */
public class SessionService {

    @ServiceAPI(path = "session/token", httpMethod = "GET")
    public IResponse getSessionToken(IRequest req) {
        SessionBean bean = (SessionBean) req;


        return null;
    }

    @ServiceAPI(path = "session/operation", httpMethod = "POST")
    public IResponse logOperation(IRequest req) {
        return null;
    }

}
