package org.sample.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Team {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String teamName;
	private Date timeStamp;
	
	public void setId(long id){this.id = id;}
	public long getId(){return id;}
	
	public String getTeamName(){return teamName;}
	public void setTeamName(String teamName){this.teamName = teamName;}
	
	public Date getTimeStamp(){return timeStamp;}
	public void setTimeStamp(){timeStamp = new Date();}
	

}
