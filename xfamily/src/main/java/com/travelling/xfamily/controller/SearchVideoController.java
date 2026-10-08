package com.travelling.xfamily.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.travelling.xfamily.domain.Level;
import com.travelling.xfamily.domain.Region;
import com.travelling.xfamily.domain.TravellingType;
import com.travelling.xfamily.domain.TravellingVideo;
import com.travelling.xfamily.domain.VideoCategory;
import com.travelling.xfamily.repository.*;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class SearchVideoController{
	private final LevelRepository levelRepository;
	private final RegionRepository regionRepository;
	private final TravellingTypeRepository travellingTypeRepository;
	private final TravellingVideoRepository travellingVideoRepository;
	private final VideoCategoryRepository videoCategoryRepository;
	
	@GetMapping("/hello")
    public String hello() {
        // return "Hello from HelloController";
    	System.out.println("Hello🍍");
    	return "Hello world🍅";
    }
	
	@GetMapping("/levels")
    public List<Level> getLevel() {
		System.out.println("levels🥒");
    	System.out.println(levelRepository.findAll());
    	return levelRepository.findAll();
    }
	
	@GetMapping("/levels/{id}")
    public Level getLevel(@PathVariable Long id) {
		System.out.println("levels🥒byid");
    	System.out.println(levelRepository.findById(id).orElse(null));
    	return levelRepository.findById(id).orElse(null);
    }
	
	@GetMapping("/home")
    public String home() {
        System.out.println("Home🍎");
    	return "华为home🥥";
    }
	
	@GetMapping("/region")
    public List<Region> getRegion() {
        System.out.println("Regions🍓");
        System.out.println(regionRepository.findAll());
        return regionRepository.findAll();
    }
	
	@GetMapping("/region/{id}")
    public Region getRegion(@PathVariable Long id) {
        System.out.println("Regions🍓byid");
        System.out.println(regionRepository.findById(id).orElse(null));
        return regionRepository.findById(id).orElse(null);
    }
	
	@GetMapping("/travellingType")
    public List<TravellingType> getTravellingType() {
        System.out.println("TravellingType🍊");
        System.out.println(travellingTypeRepository.findAll());
        return travellingTypeRepository.findAll();
    }
	
	@GetMapping("/travellingType/{id}")
    public TravellingType getTravellingType(@PathVariable Long id) {
        System.out.println("TravellingType🍊byid");
        System.out.println(travellingTypeRepository.findById(id).orElse(null));
        return travellingTypeRepository.findById(id).orElse(null);
    }	
	
	@GetMapping("/videoCategory")
    public List<VideoCategory> getVideoCategory() {
        System.out.println("VideoCategory🍇");
        System.out.println(videoCategoryRepository.findAll());
        return videoCategoryRepository.findAll();
    }
	@GetMapping("/videoCategory/{id}")
    public VideoCategory getVideoCategory(@PathVariable Long id) {
        System.out.println("VideoCategory🍇");
        System.out.println(videoCategoryRepository.findById(id).orElse(null));
        return videoCategoryRepository.findById(id).orElse(null);
    }
	
	@GetMapping("/travellingVideo")
    public List<TravellingVideo> getTravellingVideos() {
		System.out.println("TravellingVideo🍒");
		System.out.println(travellingVideoRepository.findAll());
        return travellingVideoRepository.findAll();
    }
	
	@GetMapping("/travellingVideo/{id}")
    public TravellingVideo getTravellingVideos(@PathVariable Long id) {
		System.out.println("TravellingVideo🍒");
		System.out.println(travellingVideoRepository.findById(id).orElse(null));
        return travellingVideoRepository.findById(id).orElse(null);
    }
	
	@GetMapping("/travellingVideo/travellingType/{travellingType}/region/{regionId}")
	public List<TravellingVideo> searchVideoByTravellingTypeAndCity(
	        @PathVariable("travellingType") String travellingType,
	        @PathVariable("regionId") Long regionId) {

	    System.out.println("TravellingVideo🍒");

	    return travellingVideoRepository.findByTravellingType_NameAndRegion_Id(travellingType, regionId);
	}
	
	@GetMapping("/travellingVideo/videoCategory/{videoCategory}")
    public List<TravellingVideo> searchVideoByVideoCategory(@PathVariable String videoCategory) {
		System.out.println("TravellingVideo🍒");
		System.out.println(travellingVideoRepository.findByVideoCategory_Name(videoCategory));
        return travellingVideoRepository.findByVideoCategory_Name(videoCategory);
    }
}