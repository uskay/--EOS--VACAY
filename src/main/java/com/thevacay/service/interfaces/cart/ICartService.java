package com.thevacay.service.interfaces.cart;

/**
 * Created by uskay on 2/3/15.
 */
public interface ICartService {

    public CartResponseBean addItem(CartRequestBean bean);
    public CartResponseBean updateCart(CartRequestBean bean);
    public CartResponseBean removeItems(CartRequestBean bean);
    public CartResponseBean getCart();

}
