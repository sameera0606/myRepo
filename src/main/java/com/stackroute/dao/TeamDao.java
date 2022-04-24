package com.stackroute.dao;

import java.util.List;

import com.stackroute.model.Team;

public interface TeamDao {
	public boolean addTeam(Team team);
	public List<Team> getAllTeams();
	public String deleteTeam(int id);

}
