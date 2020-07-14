package com.mahendra.spring.cassandra.etities;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("userjobapplication")
public class UserJob {

	@PrimaryKey
	private UUID jobid;
	
	private String userid;
	
	private String completed;
	
	
	private Date created_time ;

	private String finished ;
	
	private String incompleted;
	
	private Map<String , String> questionnaire;
	
	public UserJob() {
		
	}
	

	public UserJob(UUID jobid, String userid, String completed, Date created_time, String finished, String incompleted,
			Map<String, String> questionnaire) {
		super();
		this.jobid = jobid;
		this.userid = userid;
		this.completed = completed;
		this.created_time = created_time;
		this.finished = finished;
		this.incompleted = incompleted;
		this.questionnaire = questionnaire;
	}

	public UUID getJobid() {
		return jobid;
	}

	public void setJobid(UUID jobid) {
		this.jobid = jobid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getCompleted() {
		return completed;
	}

	public void setCompleted(String completed) {
		this.completed = completed;
	}

	public Date getCreated_time() {
		return created_time;
	}

	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}

	public String getFinished() {
		return finished;
	}

	public void setFinished(String finished) {
		this.finished = finished;
	}

	public String getIncompleted() {
		return incompleted;
	}

	public void setIncompleted(String incompleted) {
		this.incompleted = incompleted;
	}

	public Map<String, String> getQuestionnaire() {
		return questionnaire;
	}

	public void setQuestionnaire(Map<String, String> questionnaire) {
		this.questionnaire = questionnaire;
	}

	@Override
	public String toString() {
		return "UserJob [jobid=" + jobid + ", userid=" + userid + ", completed=" + completed + ", created_time="
				+ created_time + ", finished=" + finished + ", incompleted=" + incompleted + ", questionnaire="
				+ questionnaire + "]";
	}
	
	
	
	
	
	
	
	
}
