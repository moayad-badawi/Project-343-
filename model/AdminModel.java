package model;

import datatypes.*;
import database.*;
import java.util.TreeMap;

public class AdminModel
{
	public AdminModel() {}
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
		removeBuilding(name);
		addBuilding(building);
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
		removeCollege(name);
		addCollege(college);
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
		removeDepartment(name);
		addDepartment(dept);
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
		removeMajor(name);
		addMajor(major);
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
	/*public void updateStudentAccount(int id, Student student)
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
		return StudentsTable.getInstance().getData();;
	}*/
	//public TreeMap
}