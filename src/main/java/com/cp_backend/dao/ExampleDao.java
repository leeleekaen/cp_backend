package com.cp_backend.dao;

import com.cp_backend.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ljl
 * @createTime 2018-04-01-14:22
 **/
@Repository
public interface ExampleDao extends JpaRepository<Test, Integer> {
}
