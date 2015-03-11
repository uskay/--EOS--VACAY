package com.thevacay.entity.item;

import com.thevacay.entity.user.User;
import com.thevacay.entity.vo.ItemType;
import com.thevacay.entity.vo.ProductCategory;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by uskay on 2/4/15.
 */
@Entity
@Table(name = "ITEM")
public @Data class Item {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private long itemID;
    @Enumerated(EnumType.ORDINAL)
    private ItemType itemType;
    @Enumerated(EnumType.ORDINAL)
    private ProductCategory productCategory;
    private long brandID;
    private String itemNameJp;
    private String itemNameEn;
    private String itemDescriptionJp;
    private String itemDescriptionEn;

    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="itemID")
    private List<ItemImg> userAddressList;

    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="itemID")
    private List<Product> productList;

    @ManyToMany(
            targetEntity=User.class,
            cascade={CascadeType.ALL}
    )
    @JoinTable(
            name="USER_likes_ITEM",
            joinColumns={@JoinColumn(name="itemID")},
            inverseJoinColumns={@JoinColumn(name="userID")}
    )
    private List<User> userList;

}
