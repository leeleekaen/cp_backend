package com.cp_backend.dao;

import com.cp_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ltb
 * @createTime 2018-04-09
 **/
@Repository
public interface UserDao extends JpaRepository<User, Integer> {
}
