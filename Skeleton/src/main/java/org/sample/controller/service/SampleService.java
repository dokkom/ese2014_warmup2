package org.sample.controller.service;

import org.sample.controller.exceptions.InvalidTeamException;
import org.sample.controller.exceptions.InvalidUserException;
import org.sample.controller.pojos.SignupForm;
import org.sample.controller.pojos.TeamForm;
import org.sample.model.Team;
import org.sample.model.User;

public interface SampleService {

	public Iterable<Team>  getTeamList();
	public SignupForm saveFrom(SignupForm signupForm) throws InvalidUserException;
    public TeamForm saveFrom(TeamForm teamForm) throws InvalidTeamException;
	public User getUser(long id);

}
