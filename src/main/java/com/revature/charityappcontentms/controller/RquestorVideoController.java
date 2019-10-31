package com.revature.charityappcontentms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.charityappcontentms.dto.Message;
import com.revature.charityappcontentms.dto.RequestorVideoDTO;

import com.revature.charityappcontentms.exception.ServiceException;
import com.revature.charityappcontentms.model.RequestorVideo;
import com.revature.charityappcontentms.model.VideoContent;
import com.revature.charityappcontentms.service.RequestorVideoService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("RequestorVideo")
public class RquestorVideoController {
	@Autowired
	RequestorVideoService requestorVideoService;
	@PostMapping
	@ApiOperation(value = "  Requestor Video API")
	 @ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = String.class),
	            @ApiResponse(code = 400, message = "Invalid Credentials", response = Message.class) })
	public ResponseEntity<?> requestorVideo(@RequestBody RequestorVideoDTO requestorVideoDTO)
	  {
	
		String errorMessage = null;
		try {
			requestorVideoService. requestorVideo(requestorVideoDTO);
			 return new ResponseEntity<>( HttpStatus.OK);
		}
			
			 catch (ServiceException e) {
				 errorMessage = e.getMessage();
		           Message message = new Message(errorMessage);
		            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
		        }
	}
	@GetMapping("")
	@ApiOperation(value = "  Requestor video list API")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = VideoContent.class),
            @ApiResponse(code = 400, message = "Invalid Credentials", response = Message.class) })
	public ResponseEntity<?>requestorVideoList(){
		
		
		List<RequestorVideo> requestorVideo = null;
		String errorMessage = null;
		try {
			 requestorVideo = requestorVideoService.requestorVideoList();
		} catch (ServiceException e) {
			errorMessage = e.getMessage();
		}
		
		Message message = null;
        if (  requestorVideo != null) {
            return new ResponseEntity<>(  requestorVideo, HttpStatus.OK);
        } else {
            message = new Message(errorMessage);
            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
        }
    }

}
