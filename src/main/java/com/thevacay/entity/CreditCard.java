package com.thevacay.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by uskay on 2/15/15.
 */
@Entity
@Table(name = "CREDIT_CARD")
public @Data
class CreditCard {

    @Id
    private long userID;
    private String creditCardToken;

}
