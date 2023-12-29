package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Activity;
import com.example.service.ActivityService;

@RestController
@RequestMapping("/api/v1/Activity")
public class ActivityController {
	
	@Autowired
	ActivityService activityService;
	
	@PostMapping("/add")
	public Activity addActivity(@RequestBody Activity activity) {
		return activityService.addActivity(activity);
	}
	
//	@GetMapping("/getActivities")
//	public ResponseEntity<List<Activity>> getAllActivity(){
//    	return new ResponseEntity<List<Activity>>(ActivityService.get, HttpStatus.OK);
//		
//	}
	
//	@GetMapping("/getActivities")
//	public ResponseEntity<List<Activity>> adminGetAllActivity(){
//    	return new ResponseEntity<List<Activity>>(ActivityService.getActivity(), HttpStatus.OK);
//		
//	}
//	
//	@PutMapping("/editActivities")	
//	public ResponseEntity<Activity> editActivity(@RequestBody Activity activity) {
//		return new ResponseEntity<Activity>(ActivityService.editActivity(activity), HttpStatus.CREATED);
//	}
	
	
}
