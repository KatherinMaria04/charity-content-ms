package com.revature.charityappcontentms.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "requestor_video")

public class RequestorVideo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "requested_id")
	private Integer requestedId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "video_id")
	private VideoContent video;
	
	@Column(name = "active")
	private boolean active;
	
	@Column(name = "created_date")
	private LocalDateTime createdDate;
	
	@Column(name = "modified_date")
	private LocalDateTime modifiedDate;



	
}
