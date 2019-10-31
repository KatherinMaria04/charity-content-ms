package com.revature.charityappcontentms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	@Column(name = "requestor_id")
	private Integer requestedId;

	//@OneToMany(fetch = FetchType.EAGER)
	@Column(name = "video_id")
	private Integer video;

	

	

}
