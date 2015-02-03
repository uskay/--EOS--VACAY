package com.thevacay.service.interfaces.item;

/**
 * Created by uskay on 2/3/15.
 */
public interface IItemService {

    public ItemResponseBean getItems(ItemRequestBean bean);
    public ItemResponseBean getSingleItem(ItemRequestBean bean);

}
