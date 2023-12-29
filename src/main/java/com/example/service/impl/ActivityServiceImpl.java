package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Activity;
import com.example.repository.ActivityRepo;
import com.example.service.ActivityService;

@Service
public class ActivityServiceImpl implements ActivityService {
	
	@Autowired
	ActivityRepo activityRepo;

	@Override
	public List<Activity> getAvailableActivities() {

		return activityRepo.findAll();
	}

	@Override
	public Activity addActivity(Activity activity) {
		return activityRepo.save(activity);
	}

	@Override
	public Activity getByActivityId(int activityId) {
		 return activityRepo.findById(activityId).get();
		
	}

	

}
