package com.stackroute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.stackroute.dao.TeamDao;
import com.stackroute.model.Team;
@Controller
public class TeamController {
	@Autowired
	private TeamDao dao;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String homePage(ModelMap map) {
		map.addAttribute("teams", dao.getAllTeams());
		return "index";
		}
	
	@RequestMapping(value="/addTeam", method=RequestMethod.POST)
	public String addTeam(@ModelAttribute("team") Team teamObj, ModelMap map) {
		boolean result=dao.addTeam(teamObj);
		if(result) {
			map.addAttribute("msg", "Team Object added");
			return "redirect:/";
		}
		else {
			map.addAttribute("msg", "failure");
			return "index";
		}
	}
	@RequestMapping(value="/deleteTeam", method=RequestMethod.GET)
	public String deleteTeam(@RequestParam("id") int pId, ModelMap map) {
		String result=dao.deleteTeam(pId);
		if(result !=null) {
			map.addAttribute("msg",result);
			return "redirect:/";
		}
		else {
			map.addAttribute("msg", "failure");
			return "index";
		}
	}
	
}
