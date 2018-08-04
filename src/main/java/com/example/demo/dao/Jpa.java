package com.example.demo.dao;

import com.example.demo.entity.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Jpa extends JpaRepository<Area,String> {
}
