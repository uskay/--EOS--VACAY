package com.thevacay.service.session;

import com.thevacay.core.IRequest;
import com.thevacay.core.IResponse;
import com.thevacay.core.ServiceAnnotation;

/**
 * Created by uskay on 1/25/15.
 */
public class SessionService {

    @ServiceAnnotation(resource = "token", httpMethod = "GET")
    public IResponse getSessionToken(IRequest req) {
        RequestSessionBean bean = (RequestSessionBean) req;
        System.out.println(bean.getSessionID());
        ResponseSessionBean res = new ResponseSessionBean();
        res.setReturnCode("aaa");
        return res;
    }

    @ServiceAnnotation(resource = "operation", httpMethod = "POST")
    public IResponse logOperation(IRequest req) {
        return null;
    }

}
