package com.thevacay.entity;

import com.thevacay.entity.vo.PaymentMethod;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by uskay on 2/4/15.
 */
@Entity
@Table(name = "USER")
public @Data class User {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private long userID;
    private String userName;
    private String email;
    private boolean isAnonymous;
    @Enumerated(EnumType.ORDINAL)
    private PaymentMethod lastUsedPaymentMethod;

//    @OneToMany
//    private List<UserAddress> userAddressList;
//
//    @OneToOne(targetEntity = UserCredential.class)
//    private UserCredential UserCredential;



}
