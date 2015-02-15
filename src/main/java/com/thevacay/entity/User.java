package com.thevacay.entity;

import com.thevacay.entity.vo.PaymentMethod;

import javax.persistence.*;
import java.util.List;

/**
 * Created by uskay on 2/4/15.
 */
@Entity
public class User {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private long userID;
    private String userName;
    private String email;
    private boolean isAnonymous;
    @Enumerated(EnumType.ORDINAL)
    private PaymentMethod lastUsedPaymentMethod;

    @OneToMany
    private List<UserAddress> userAddressList;

    @OneToOne
    private UserCredential userCredential;



}
