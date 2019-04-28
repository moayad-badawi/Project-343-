package model;

import datatypes.Employee;
import datatypes.Session;
import database.EmployeesTable;
import database.SessionsTable;
import java.util.ArrayList;
import java.util.TreeMap;

public class EmployeeModel
{
	public EmployeeModel() {}
	public Employee getEmployeeInformation(int id)
	{
		return EmployeesTable.getInstance().getData().get(id);
	}
	public TreeMap<String, ArrayList<Session>> getEmployeeScheduleByTerm(int id)
	{
		TreeMap<String, ArrayList<Session>> scheduleByTerm = new TreeMap<>();
		ArrayList<String> terms = new ArrayList<>();					// all terms
		for(int i = 0; i < SessionsTable.getInstance().getID(); i++)	// find all terms
		{
			Session session = SessionsTable.getInstance().getData().get(i);
			String term = session.semester() + ' ' + Integer.toString(session.year());
			if(!terms.contains(term))
				terms.add(term);
		}
		ArrayList<Integer> sessionIDs = EmployeesTable.getInstance().getData().get(id).sessionsTeaching();	// all sessions of a student
		for(String term : terms)						// get sessions by terms
		{
			ArrayList<Session> sessionsByTerm = new ArrayList<>();
			for(int sID : sessionIDs)	// check if a session is in a term
			{
				Session session = SessionsTable.getInstance().getData().get(sID);
				String sTerm = session.semester() + ' ' + Integer.toString(session.year());
				if(term.equals(sTerm))
					sessionsByTerm.add(session);
			}
			scheduleByTerm.put(term, sessionsByTerm);
		}
		return scheduleByTerm;
	}
}
