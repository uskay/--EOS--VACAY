package com.thevacay.entity.item;

import com.thevacay.entity.vo.Currency;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by uskay on 2/15/15.
 */
@Entity
@Table(name = "PRODUCT_PRICE")
public @Data
class ProductPrice {

    @Id
    private long itemID;
    private Currency curency;
    private int price;

}
