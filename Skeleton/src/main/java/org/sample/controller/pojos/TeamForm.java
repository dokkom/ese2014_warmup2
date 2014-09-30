package org.sample.controller.pojos;

import java.util.Date;

public class TeamForm {

	private String teamName;
	private Date timeStamp;
	
	
	 public String getTeamName() {
	        return teamName;
	    }

	    public void setTeamName(String teamName) {
	        this.teamName = teamName;
	    }

		public Date getTimeStamp() {
			return timeStamp;
		}

		public void setTimeStamp(Date timeStamp) {
			this.timeStamp = timeStamp;
		}
}
