package com.thevacay.service.session;

import com.thevacay.core.IRequest;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by uskay on 1/25/15.
 */
@Data @XmlRootElement
public class RequestSessionBean implements IRequest {
    private String sessionID;
}
