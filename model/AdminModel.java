package model;

import datatypes.*;
import database.*;
import java.util.TreeMap;
import java.util.ArrayList;

public class AdminModel
{
	public AdminModel() {}
	public int generateUserID()
	{
		return UsersTable.getInstance().getID();
	}
	public int generateCourseID()
	{
		return CoursesTable.getInstance().getID();
	}
	public int generateSessionID()
	{
		return SessionsTable.getInstance().getID();
	}
	public int generateRoomID()
	{
		return RoomsTable.getInstance().getID();
	}
	public String getUniversityName()
	{
		return UniversityInformationTable.getInstance().getData().name();
	}
	public void addBuilding(Building building)
	{
		BuildingsTable.getInstance().getData().put(building.name(), building);
	}
	public void removeBuilding(String name)
	{
		BuildingsTable.getInstance().getData().remove(name);
	}
	public void updateBuilding(String name, Building building)
	{
		BuildingsTable.getInstance().getData().replace(name, building);
	}
	public void addRoom(Room room)
	{
		RoomsTable.getInstance().getData().put(room.id(), room);
	}
	public void removeRoom(int id)
	{
		RoomsTable.getInstance().getData().remove(id);
	}
	public void updateRoom(int id, Room room)
	{
		RoomsTable.getInstance().getData().replace(id, room);
	}
	public void addCollege(College college)
	{
		CollegesTable.getInstance().getData().put(college.name(), college);
	}
	public void removeCollege(String name)
	{
		CollegesTable.getInstance().getData().remove(name);
	}
	public void updateCollege(String name, College college)
	{
		CollegesTable.getInstance().getData().replace(name, college);
	}
	public void addDepartment(Department dept)
	{
		DepartmentsTable.getInstance().getData().put(dept.name(), dept);
	}
	public void removeDepartment(String name)
	{
		DepartmentsTable.getInstance().getData().remove(name);
	}
	public void updateDepartment(String name, Department dept)
	{
		DepartmentsTable.getInstance().getData().replace(name, dept);
	}
	public void addMajor(Major major)
	{
		MajorsTable.getInstance().getData().put(major.name(), major);
	}
	public void removeMajor(String name)
	{
		MajorsTable.getInstance().getData().remove(name);
	}
	public void updateMajor(String name, Major major)
	{
		MajorsTable.getInstance().getData().replace(name, major);
	}
	public void addCourse(Course course)
	{
		CoursesTable.getInstance().getData().put(course.id(), course);
	}
	public void removeCourse(int id)
	{
		CoursesTable.getInstance().getData().remove(id);
	}
	public void updateCourse(int id, Course course)
	{
		CoursesTable.getInstance().getData().replace(id, course);
	}
	public void addSession(Session session)
	{
		SessionsTable.getInstance().getData().put(session.id(), session);
	}
	public void removeSession(int id)
	{
		SessionsTable.getInstance().getData().remove(id);
	}
	public void updateSession(int id, Session session)
	{
		SessionsTable.getInstance().getData().replace(id, session);
	}
	public void addUserAccount(User user)
	{
		UsersTable.getInstance().getData().put(user.id(), user);
	}
	public void removeUserAccount(int id)
	{
		UsersTable.getInstance().getData().remove(id);
	}
	public void updateUserAccount(int id, User user)
	{
		UsersTable.getInstance().getData().replace(id, user);
	}
	public void addEmployeeAccount(Employee employee)
	{
		EmployeesTable.getInstance().getData().put(employee.id(), employee);
	}
	public void removeEmployeeAccount(int id)
	{
		EmployeesTable.getInstance().getData().remove(id);
	}
	public void updateEmployeeAccount(int id, Employee employee)
	{
		EmployeesTable.getInstance().getData().replace(id, employee);
	}
	public void addStudentAccount(Student student)
	{
		StudentsTable.getInstance().getData().put(student.id(), student);
	}
	public void removeStudentAccount(int id)
	{
		StudentsTable.getInstance().getData().remove(id);
	}
	public void updateStudentAccount(int id, Student student)
	{
		StudentsTable.getInstance().getData().replace(id, student);
	}
	public TreeMap<Integer, User> getUserAccounts()
	{
		return UsersTable.getInstance().getData();
	}
	public TreeMap<Integer, Employee> getEmployeeAccounts()
	{
		return EmployeesTable.getInstance().getData();
	}
	public TreeMap<Integer, Student> getStudentAccounts()
	{
		return StudentsTable.getInstance().getData();
	}
	public void resetStudentSemesterUnits()
	{
		TreeMap<Integer, Student> allStudents = StudentsTable.getInstance().getData();
		for(int i = 0; i < allStudents.size(); i++)
			allStudents.get(i).setCurrentUnit(0);
	}
	public void assignStudentGrade(final int studentID, final int courseID, final char grade)
	{
		int[] key = {studentID, courseID};
		GradesTable.getInstance().getData().put(key, grade);
	}
	/*public String addSessionCheck(Session session)
	{
		ArrayList<Session> termSessions = new ArrayList<>();
		TreeMap<Integer, Session> st = SessionsTable.getInstance().getData();
		for(int i = 0; i < st.size(); i++)		// all sessions in that term
		{
			Session s = st.get(i);
			String term = s.semester() + " " + Integer.toString(s.year());
			if(term.equals(session.semester() + " " + Integer.toString(session.year())))
					termSessions.add(s);
		}
		for(Session s : termSessions)	// check session info conflict against sessions in the same term
		{
			if(session.day().equals(s.day()))	// same day, check time, room, instructor conflict
			{
				if(session.startTime().isBefore(s.endTime()) || session.endTime().isAfter(s.startTime())) // time conflict
					return "Time conflict";
				else	// no time conflict, check room
				{
					
				}
			}
		}
	}*/
	
}