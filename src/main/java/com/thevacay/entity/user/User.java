package com.thevacay.entity.user;

import com.thevacay.entity.item.Item;
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

    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="userID")
    private List<UserAddress> userAddressList;

    @OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="userID")
    private WebPay creditCardList;

    @OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="userID")
    private UserCredential UserCredential;

    @ManyToMany(
            targetEntity=Item.class,
            cascade={CascadeType.ALL}
    )
    @JoinTable(
            name="USER_likes_ITEM",
            joinColumns={@JoinColumn(name="userID")},
            inverseJoinColumns={@JoinColumn(name="itemID")}
    )
    private List<Item> itemList;


}
