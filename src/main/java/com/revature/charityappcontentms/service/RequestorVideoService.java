package com.revature.charityappcontentms.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.charityappcontentms.dto.RequestorVideoDTO;
import com.revature.charityappcontentms.exception.ServiceException;
import com.revature.charityappcontentms.model.RequestorVideo;
import com.revature.charityappcontentms.model.VideoContent;
import com.revature.charityappcontentms.repository.RequestorVideoRepository;

@Service
public class RequestorVideoService {
	@Autowired
	RequestorVideoRepository requestorVideoRepository;

	// @Transactional
	public void requestorVideo(RequestorVideoDTO requestorVideoDTO) throws ServiceException {
		RequestorVideo requestorVideo = new RequestorVideo();
		requestorVideo.setRequestedId(requestorVideoDTO.getRequestedId());
		VideoContent videoContent = new VideoContent();
		videoContent.setId(requestorVideoDTO.getVideoId());
		requestorVideo.setVideo(videoContent);
		try {

			requestorVideo.setCreatedDate(LocalDateTime.now());
			requestorVideo.setModifiedDate(LocalDateTime.now());
			requestorVideoRepository.save(requestorVideo);

		} catch (Exception e) {

			e.printStackTrace();

			throw new ServiceException("UNABLE TO ADD CONTENT");
		}

	}

	 public List<RequestorVideo> videoList(int requestedId) throws ServiceException {
	        List<RequestorVideo> list = null;
	        list = requestorVideoRepository.findByRequestedId(requestedId);
	        if (list.isEmpty()) {
	            throw new ServiceException("UNABLE_TO_LIST");
	        }
	        return list;
	    }
	}
