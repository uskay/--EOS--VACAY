package com.thevacay.repository;

import com.thevacay.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by uskay on 2/16/15.
 */
@Repository
public interface TestRepository extends JpaRepository<User, Long>{

    void delete(User deleted);

    List<User> findAll();

    User save(User persisted);

}
