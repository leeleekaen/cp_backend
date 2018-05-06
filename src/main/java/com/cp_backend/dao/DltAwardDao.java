package com.cp_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cp_backend.entity.DltAward;

@Repository
public interface DltAwardDao extends JpaRepository<DltAward,Integer> {

}
