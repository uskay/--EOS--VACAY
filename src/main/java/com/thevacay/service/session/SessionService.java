package com.thevacay.service.session;

import com.thevacay.model.requestparameters.session.SessionLogRequest;
import com.thevacay.model.requestparameters.session.SessionTokenRequest;
import com.thevacay.model.responseparameters.session.SessionLogResponse;
import com.thevacay.model.responseparameters.session.SessionTokenResponse;
import com.thevacay.service.interfaces.ISessionService;
import org.springframework.stereotype.Service;

/**
 * Created by uskay on 1/29/15.
 */
@Service
public class SessionService implements ISessionService {

    @Override
    public SessionTokenResponse getToken(SessionTokenRequest request) {
        System.out.println("kitayo!");
        return null;
    }

    @Override
    public SessionLogResponse writeLog(SessionLogRequest request) {
        return null;
    }


}
