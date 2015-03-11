package com.thevacay.entity.user;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by uskay on 2/15/15.
 */
@Entity
@Table(name = "CREDIT_CARD")
public @Data
class WebPay {

    @Id
    private long userID;
    @Column(name = "creditCardToken")
    private String customer;

}
