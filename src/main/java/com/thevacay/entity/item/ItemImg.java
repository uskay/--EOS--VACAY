package com.thevacay.entity.item;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by uskay on 2/15/15.
 */
@Entity
@Table(name = "ITEM_IMG")
public @Data
class ItemImg {

    @Id
    private long itemID;
    private int imgIndex;
}
