package model;

import datatypes.User;
import datatypes.Session;
import database.UsersTable;
import database.AdminsTable;
import database.EmployeesTable;
import database.SessionsTable;
import database.StudentsTable;

import java.util.ArrayList;
import java.util.TreeMap;

public class UserModel
{
	public UserModel() {}
	public Object login(int id, String password)
	{
		if(UsersTable.getInstance().getData().containsKey(id))
		{
			User user = UsersTable.getInstance().getData().get(id);
			if(password.equals(user.password()))
			{
				if(user.status().equalsIgnoreCase("student"))
					return StudentsTable.getInstance().getData().get(id);
				if(user.status().equalsIgnoreCase("admin") || user.status().equalsIgnoreCase("superadmin"))
					return AdminsTable.getInstance().getData().get(id);
				if(user.status().equalsIgnoreCase("employee"))
					return EmployeesTable.getInstance().getData().get(id);
			}
		}
		return null;
	}
	public String getStatus(int id)
	{
		return UsersTable.getInstance().getData().get(id).status();
	}
	public TreeMap<String, ArrayList<Session>> getSessionsByTerm()
	{
		TreeMap<String, ArrayList<Session>> sessionsByTerm = new TreeMap<>();
		ArrayList<String> terms = new ArrayList<>();					// all terms
		for(int i = 0; i < SessionsTable.getInstance().getID(); i++)	// find all terms
		{
			Session session = SessionsTable.getInstance().getData().get(i);
			String term = session.semester() + ' ' + Integer.toString(session.year());
			if(!terms.contains(term))
				terms.add(term);
		}
		for(String term : terms)				// find sessions by term
		{
			ArrayList<Session> sessions = new ArrayList<>();
			for(int i = 0; i < SessionsTable.getInstance().getID(); i++)		// loop through all sessions
			{
				Session session = SessionsTable.getInstance().getData().get(i);	// one session
				String semester = session.semester();			// year of session
				int year = session.year();				// semester of session
				String sTerm = semester + ' ' + Integer.toString(year);		// term info
				if(term.equals(sTerm))				// term match
					sessions.add(session);
			}
			sessionsByTerm.put(term, sessions);
		}
		return sessionsByTerm;
	}
}
