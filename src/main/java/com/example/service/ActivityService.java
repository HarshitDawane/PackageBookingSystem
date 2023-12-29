package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Activity;

@Service
public interface ActivityService {
	
	public Activity addActivity(Activity activity);
	public Activity getByActivityId(int activityId);
	public List<Activity> getAvailableActivities();
	
}


