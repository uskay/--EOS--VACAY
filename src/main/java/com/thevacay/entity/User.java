package com.thevacay.entity;

import com.thevacay.entity.vo.PaymentMethod;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
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

    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="userID")
    private List<UserAddress> userAddressList;

    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="userID")
    private List<CreditCard> creditCardList;

    @OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="userID")
    private UserCredential UserCredential;

    @ManyToMany
    @JoinTable(
            name="USER_likes_ITEM",
            joinColumns={@JoinColumn(name="userID", referencedColumnName="userID")},
            inverseJoinColumns={@JoinColumn(name="itemID", referencedColumnName="itemID")}
    )
    private List<User> userList;


}
