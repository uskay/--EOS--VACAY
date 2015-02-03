package com.thevacay.service.interfaces.session;

import com.thevacay.core.SessionData;

/**
 * Created by uskay on 2/3/15.
 */
public interface ISessionService {

    public SessionResponseBean logon(SessionRequestBean bean);
    public SessionResponseBean logoff(SessionRequestBean bean);
    public SessionResponseBean traceOperation(SessionRequestBean bean);

}
