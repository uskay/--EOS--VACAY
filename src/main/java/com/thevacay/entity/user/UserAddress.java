package com.thevacay.entity.user;

import com.thevacay.entity.vo.CountryCode;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by uskay on 2/15/15.
 */
@Entity
@Table(name = "USER_ADDRESS")
public @Data class UserAddress {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private long addressID;
    private long userID;
    private String firstNameKanji;
    private String lastNameKanji;
    private String firstNameKana;
    private String lastNameKana;
    private String firstNameEng;
    private String lastnameEng;
    @Enumerated(EnumType.ORDINAL)
    private CountryCode countryCode;
    private String postNo;
    private String address1;
    private String address2;
    private String address3;

}
