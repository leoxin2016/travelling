package com.travelling.xfamily.repository;

import com.travelling.xfamily.domain.Level; 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelRepository extends JpaRepository<Level, Long> { 
    // find by ID
}