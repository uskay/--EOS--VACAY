package com.thevacay.entity.item;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by uskay on 2/15/15.
 */
@Entity
@Table(name = "PRODUCT")
public @Data
class Product {

    @Id
    private long itemID;
    private int stockNumber;

    @OneToMany(fetch= FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="itemID")
    private List<ProductPrice> productPriceList;

}
