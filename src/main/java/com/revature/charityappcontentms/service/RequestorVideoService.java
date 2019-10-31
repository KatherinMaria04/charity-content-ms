package com.revature.charityappcontentms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.charityappcontentms.dto.RequestorVideoDTO;
import com.revature.charityappcontentms.exception.ServiceException;
import com.revature.charityappcontentms.model.RequestorVideo;

import com.revature.charityappcontentms.repository.RequestorVideoRepository;

@Service
public class RequestorVideoService {
	@Autowired
	RequestorVideoRepository requestorVideoRepository;

	// @Transactional
	public void requestorVideo(RequestorVideoDTO requestorVideoDTO) throws ServiceException {
		RequestorVideo requestorVideo = new RequestorVideo();
		requestorVideo.setRequestorId(requestorVideoDTO.getRequestorId());
		requestorVideo.setVideoId(requestorVideoDTO.getVideoId());
		try {

			requestorVideoRepository.save(requestorVideo);

		} catch (Exception e) {

			e.printStackTrace();

			throw new ServiceException("UNABLE TO ADD CONTENT");
		}

	}

	public List<RequestorVideo> requestorVideoList() throws ServiceException {
		List<RequestorVideo> requestorVideo = null;
		requestorVideo = requestorVideoRepository.findAll();

		return requestorVideo;
	}
}
