package com.thevacay.entity;

import com.thevacay.entity.vo.CountryCode;

import javax.persistence.*;

/**
 * Created by uskay on 2/15/15.
 */
public class UserAddress {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private long addressID;
    private long userID;
    private String firstNameKanji;
    private String lastNameKanji;
    private String fistNameKana;
    private String lastNameKana;
    private String firstNameEng;
    private String lastnameEng;
    @Enumerated(EnumType.ORDINAL)
    private CountryCode countryCode;
    private String postNum;
    private String address1;
    private String address2;
    private String address3;

}
