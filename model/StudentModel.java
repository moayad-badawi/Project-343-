package model;

import datatypes.Student;
import datatypes.Employee;
import datatypes.Session;
import database.StudentsTable;
import database.UniversityInformationTable;
import database.CoursesTable;
import database.EmployeesTable;
import database.SessionsTable;
import java.util.ArrayList;
import java.util.TreeMap;

public class StudentModel
{
	public StudentModel() {}
	public Student getStudentInformation(int id)
	{
		return StudentsTable.getInstance().getData().get(id);
	}
	public void enrollSession(int studentID, int sessionID)
	{
		StudentsTable.getInstance().getData().get(studentID).sessionsEnrolled().add(sessionID);
	}
	public void dropSession(int studentID, int sessionID)
	{
		int index = StudentsTable.getInstance().getData().get(studentID).sessionsEnrolled().indexOf(sessionID);
		StudentsTable.getInstance().getData().get(studentID).sessionsEnrolled().remove(index);
	}
	public TreeMap<String, ArrayList<Session>> getStudentScheduleByTerm(int id)
	{
		TreeMap<String, ArrayList<Session>> scheduleByTerm = new TreeMap<>();
		ArrayList<String> terms = new ArrayList<>();					// all terms
		for(int i = 0; i < SessionsTable.getInstance().getData().size(); i++)	// find all terms
		{
			Session session = SessionsTable.getInstance().getData().get(i);
			String term = session.semester() + ' ' + Integer.toString(session.year());
			if(!terms.contains(term))
				terms.add(term);
		}
		ArrayList<Integer> sessionIDs = StudentsTable.getInstance().getData().get(id).sessionsEnrolled();	// all sessions of a student
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
	public TreeMap<String, Object[][]> getStudentScheduleByTermConverted(int id)
	{
		TreeMap<String, ArrayList<Session>> scheduleByTerm = getStudentScheduleByTerm(id);
		TreeMap<String, Object[][]> scheduleByTermConverted = new TreeMap<>();
		for(String term : scheduleByTerm.keySet())
		{
			ArrayList<Session> sessions = scheduleByTerm.get(term);
			Object[][] tableData = new Object[sessions.size()][5];
			for(int i = 0; i < sessions.size(); i++)
			{
				tableData[i][0] = sessions.get(i).courseID(); // courseID
				tableData[i][1] = CoursesTable.getInstance().getData().get(sessions.get(i).courseID()).name(); // course name
				tableData[i][2] = sessions.get(i).buildingName() + " " + Integer.toString(sessions.get(i).roomID()); // building + room number
				tableData[i][3] = sessions.get(i).day() + " " + sessions.get(i).startTime().toString() + "-" + sessions.get(i).endTime().toString(); // starttime - endtime
				Employee instructor = EmployeesTable.getInstance().getData().get(sessions.get(i).instructorID());
				tableData[i][4] = instructor.firstname() + " " + instructor.middlename() + " " + instructor.lastname(); // instructor full name 
			}
			scheduleByTermConverted.put(term, tableData);
		}
		return scheduleByTermConverted;
	}
	public boolean isSessionConflict(int studentID, int sessionID) // is the student already enrolled in the session
	{
		return StudentsTable.getInstance().getData().get(studentID).sessionsEnrolled().contains(sessionID);
	}
	public boolean isCourseConflict(int studentID, int courseID)	// did the student take this course before
	{
		ArrayList<Integer> sessionsEnrolled = StudentsTable.getInstance().getData().get(studentID).sessionsEnrolled();
		ArrayList<Integer> coursesEnrolled = new ArrayList<>();
		for(int id : sessionsEnrolled)
			coursesEnrolled.add(SessionsTable.getInstance().getData().get(id).courseID());
		return coursesEnrolled.contains(courseID);
	}
	public boolean isPrereqFulfilled(int studentID, int courseID) // did the student fulfill prereq of this course
	{
		ArrayList<Integer> prereqs = CoursesTable.getInstance().getData().get(courseID).prereqs();
		ArrayList<Integer> sessionsEnrolled = StudentsTable.getInstance().getData().get(studentID).sessionsEnrolled();
		ArrayList<Integer> coursesEnrolled = new ArrayList<>();
		for(int id : sessionsEnrolled)
			coursesEnrolled.add(SessionsTable.getInstance().getData().get(id).courseID());
		for(int prereq : prereqs)
			if(!coursesEnrolled.contains(prereq))	// if student doesn't have any one of the prereqs, then not fullfilled
				return false;
		return true;
	}
	public boolean isTermConflict(int sessionID)	// check term against current term
	{
		SchoolModel sm = new SchoolModel();
		int currentYear = sm.getCurrentYear();
		int sessionYear = SessionsTable.getInstance().getData().get(sessionID).year();
		String currentSem = sm.getCurrentSemester();
		String sessionSem = SessionsTable.getInstance().getData().get(sessionID).semester();
		if(sessionYear < currentYear)
			return true;
		else if(sessionYear > currentYear)
			return false;
		else
		{															// case = 0: same semester, can add
			if(sessionSem.compareToIgnoreCase(currentSem) <= 0)		// case < 0: fall(future session) vs spring(current) , can add, no conflict
				return false;
			return true;							// case > 0: spring(previous semester) vs fall(current semester), cannot add, conflict
		}
	}
	public boolean isTimeConflict(int studentID, int sessionID, String term)	// check day time against sessions enrolled by student by term
	{
		
	}
	public boolean isRoomConflict(int studentID, int sessionID, String term)		// check building and room against sessions enrolled by student by term
	{
		
	}
}