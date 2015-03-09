package com.thevacay.entity;

import com.thevacay.entity.vo.PaymentMethod;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by uskay on 2/4/15.
 */
@Entity
@Table(name = "ORDER")
public @Data class Order {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private long orderID;
    private long userID;
    private long addressID;
    private String creditCardToken;

    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="userID")
    private List<User> userList;

    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="addressID")
    private List<UserAddress> userAddressList;

    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="creditCardToken")
    private List<CreditCard> creditCardList;

    @ManyToMany
    @JoinTable(
            name="ORDER_has_PROJECT",
            joinColumns={@JoinColumn(name="orderID", referencedColumnName="orderID")},
            inverseJoinColumns={@JoinColumn(name="itemID", referencedColumnName="itemID")}
    )
    private List<Product> productList;


}
