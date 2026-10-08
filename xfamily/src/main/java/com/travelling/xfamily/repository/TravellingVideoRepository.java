package com.travelling.xfamily.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travelling.xfamily.domain.*;

@Repository
public interface TravellingVideoRepository extends JpaRepository<TravellingVideo, Long> {

	List<TravellingVideo> findByTravellingType_NameAndRegion_Id(String travellingType, Long cityId);
	
	List<TravellingVideo> findByVideoCategory_Name(String videoCategory);
	
	
}
