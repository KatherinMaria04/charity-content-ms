package com.revature.charityappcontentms.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data


public class RequestorVideoDTO {
	
	
		private Integer id;
		private Integer requestedId;
		private Integer videoId;
		private LocalDateTime createdDate;
		private LocalDateTime modifiedDate;

}
