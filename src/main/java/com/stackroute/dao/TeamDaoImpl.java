package com.stackroute.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.stackroute.model.Team;
@Repository // Class to interact with Database
@Transactional
public class TeamDaoImpl implements TeamDao {
  @Autowired
  private SessionFactory sessionFactory;
  private List<Team> teamList;
  boolean flag;

	public boolean addTeam(Team team) {
		try {
	Session session = sessionFactory.getCurrentSession();
	session.save(team); // insert query
	flag=true;
		}
		catch(Exception e) {
			flag=false;
		}
		return flag;
	}

	public List<Team> getAllTeams() {
		Query query=sessionFactory.getCurrentSession().createQuery("from Team");
		return query.list();
	}
	
	public String deleteTeam(int id) {
		String hql="from Team where teamId= "+id;
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		Team team=(Team) query.list().get(0);
		if(team!=null) {
			sessionFactory.getCurrentSession().delete(team);
		}
	//	query.setParameter("tid", id);
		return null;
		
	}

}
