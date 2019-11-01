package com.revature.charityappcontentms.dto;



import java.time.LocalDateTime;

import lombok.Data;

@Data
public class VideoContentDTO {
	private Integer id;
	private String title;
	private String url;
	private boolean active;
	private LocalDateTime createdDate;
	private LocalDateTime modifiedDate;

}
