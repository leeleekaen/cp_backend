package com.cp_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cp_backend.entity.Fc3Award;

@Repository
public interface Fc3AwardDao extends JpaRepository<Fc3Award,Integer>{

}
