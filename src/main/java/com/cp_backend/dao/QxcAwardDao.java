package com.cp_backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cp_backend.entity.QxcAward;

@Repository
public interface QxcAwardDao extends JpaRepository<QxcAward,Integer> {

}
