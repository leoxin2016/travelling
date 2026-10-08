package com.travelling.xfamily.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travelling.xfamily.domain.*;

@Repository
public interface TravellingTypeRepository extends JpaRepository<TravellingType, Long> {
	// find by ID
	
	
}
