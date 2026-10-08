package com.travelling.xfamily.domain;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TRAVELLING_VIDEO")
public class TravellingVideo{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
	private String videoTitle;
	private String description;
	private LocalDateTime recordingTime;
	private Integer durationSeconds;
	@ManyToOne
    @JoinColumn(name = "videoCategory_id")
	private VideoCategory videoCategory;
	@ManyToOne
    @JoinColumn(name = "travellingType_id")
	private TravellingType travellingType;
	@ManyToOne
    @JoinColumn(name = "region_id")
	private Region region;
	
	public TravellingVideo(Long id, String videoTitle, String description) {
		this.id = id;
		this.videoTitle = videoTitle;
		this.description = description;
	}
}