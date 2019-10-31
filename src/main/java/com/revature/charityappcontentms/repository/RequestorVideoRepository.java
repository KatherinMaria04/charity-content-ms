package com.revature.charityappcontentms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.revature.charityappcontentms.model.RequestorVideo;



public interface RequestorVideoRepository  extends JpaRepository<RequestorVideo,Integer> {
@Modifying
@Query(" from RequestorVideo where requestedId=?1")
List<RequestorVideo> findByRequestedId(int requestedId);
}
