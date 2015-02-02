package com.thevacay.service.interfaces.session;

import com.thevacay.entity.SessionEntity;
import org.apache.catalina.Session;

/**
 * Created by uskay on 2/3/15.
 */
public interface ISessionService {

    public SessionResponseBean logon(SessionRequestBean bean, SessionEntity entity);

}
