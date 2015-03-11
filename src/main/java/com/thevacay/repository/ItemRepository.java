package com.thevacay.repository;

import com.thevacay.entity.item.Item;
import com.thevacay.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by uskay on 2/16/15.
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

    void delete(Item deleted);

    List<Item> findAll();

    Item save(Item persisted);

}
