package com.mahendra.spring.cassandra.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mahendra.spring.cassandra.etities.UserJob;
import com.mahendra.spring.cassandra.repos.UserJobRepository;

@RestController
@RequestMapping("/api/v1")
public class UserJobController {

	@Autowired
	UserJobRepository userJobRepository;


	/* Endpoint for getting all user jobb applications API */
	/* localhost:8082/api/vi/user-job-applications */
	@GetMapping("/user-job-applications")
	@ResponseBody
	public List<UserJob> getAllUserJobApplications() {
		Iterable<UserJob> result = userJobRepository.findAll();
		List<UserJob> userJobAppList = new ArrayList<UserJob>();
		result.forEach(userJobAppList::add);
		return userJobAppList;
	}

	/* Endpoint for creatign user job application */
	/* localhost:8082/api/vi/user-job-application */
	@PostMapping("/add-user-job-application")
	public UserJob addUserJobApplication(@RequestBody UserJob newUserJob) {

		UserJob userJob = new UserJob(UUID.randomUUID(), newUserJob.getUserid(), newUserJob.getCompleted(),
				newUserJob.getCreated_time(), newUserJob.getFinished(), newUserJob.getIncompleted(),
				newUserJob.getQuestionnaire());
		userJobRepository.save(userJob);

		return userJob;
	}
}
