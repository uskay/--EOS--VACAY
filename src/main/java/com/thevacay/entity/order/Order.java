package com.thevacay.entity.order;

import com.thevacay.entity.item.Product;
import com.thevacay.entity.user.WebPay;
import com.thevacay.entity.user.User;
import com.thevacay.entity.user.UserAddress;
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
//    private long userID;
    //private long addressID;

    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="userID")
    private User user;

    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="addressID")
    private UserAddress userAddress;

    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="userID")
    private WebPay webpay;

    @ManyToMany
    @JoinTable(
            name="ORDER_has_PROJECT",
            joinColumns={@JoinColumn(name="orderID", referencedColumnName="orderID")},
            inverseJoinColumns={@JoinColumn(name="itemID", referencedColumnName="itemID")}
    )
    private List<Product> productList;


}
