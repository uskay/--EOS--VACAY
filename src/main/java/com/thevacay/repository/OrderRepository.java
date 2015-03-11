package com.thevacay.repository;

import com.thevacay.entity.item.Item;
import com.thevacay.entity.order.Order;
import com.thevacay.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by uskay on 2/16/15.
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

    void delete(Order deleted);

    List<Order> findAll();

    Order save(Order persisted);

}
