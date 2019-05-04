package datatypes;

import java.util.ArrayList;

public class Employee
{
	private final int id;
	private String firstname;
	private char middleInitial;
	private String lastname;
	private String title;
	private float salary;
	private ArrayList<Integer> sessionsTeaching;
	public Employee(final int id, String firstname, char middleInitial, String lastname, String title, float salary, ArrayList<Integer> sessionsTeaching)
	{
		this.id = id;
		this.firstname = firstname;
		this.middleInitial = middleInitial;
		this.lastname = lastname;
		this.title = title;
		this.salary = salary;
		this.sessionsTeaching = sessionsTeaching;
	}
	public void setFirstname(String firstname) { this.firstname = firstname; }
	public void setMiddleInitial(char middleInitial) { this.middleInitial = middleInitial; }
	public void setLastname(String lastname) { this.lastname = lastname; }
	public void setTitle(String title) { this.title = title; }
	public void setSalary(float salary) { this.salary = salary; }
	public void setSessionsTeaching(ArrayList<Integer> sessionsTeaching) { this.sessionsTeaching = sessionsTeaching; }
	public final int id() { return id; }
	public String firstname() { return firstname; }
	public char middleInitial() { return middleInitial; }
	public String lastname() { return lastname; }
	public String title() { return title; }
	public float salary() { return salary; }
	public ArrayList<Integer> sessionsTeaching() { return sessionsTeaching; }
}
