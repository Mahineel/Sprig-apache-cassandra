package com.mahendra.spring.cassandra.repos;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.mahendra.spring.cassandra.etities.UserJob;

public interface UserJobRepository extends CrudRepository<UserJob, UUID> {
	/*
	 * @Query("SELECT * FROM beovolytics.userjobapplication ") UserJob findByJobid(
	 * UUID jobid);
	 */
}