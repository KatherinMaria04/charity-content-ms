package com.revature.charityappcontentms.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "video_content")
public class VideoContent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "title")
	private String title;

	@Column(name = "url")
	private String url;

	@Column(name = "active")
	private boolean active;
	
	@Column(name = "created_date")
	private LocalDateTime createdDate;
	
	@Column(name = "modified_date")
	private LocalDateTime modifiedDate;



}
