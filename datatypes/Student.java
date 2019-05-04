package datatypes;

import java.util.ArrayList;

public class Student
{
	private final int id;
	private String firstname;
	private char middleInitial;
	private String lastname;
	private String major;
	private String tuitionStatus;
	private ArrayList<Integer> sessionsEnrolled;
	public Student(final int id, String firstname, char middleInitial, String lastname, String major, String tuitionStatus, ArrayList<Integer> sessionsEnrolled)
	{
		this.id = id;
		this.firstname = firstname;
		this.middleInitial = middleInitial;
		this.lastname = lastname;
		this.major = major;
		this.tuitionStatus = tuitionStatus;
		this.sessionsEnrolled = sessionsEnrolled;
	}
	public void setFirstname(String firstname) { this.firstname = firstname; }
	public void setMiddleInitial(char middleInitial) { this.middleInitial = middleInitial; }
	public void setLastname(String lastname) { this.lastname = lastname; }
	public void setMajor(String major) { this.major = major; }
	public void setTuitionStatus(String tuitionStatus) { this.tuitionStatus = tuitionStatus; }
	public void setSessionsEnrolled(ArrayList<Integer> sessionsEnrolled) { this.sessionsEnrolled = sessionsEnrolled; }
	public final int id() { return id; }
	public String firstname() { return firstname; }
	public char middleInitial() { return middleInitial; }
	public String lastname() { return lastname; }
	public String major() { return major; }
	public String tuitionStatus() { return tuitionStatus; }
	public ArrayList<Integer> sessionsEnrolled() { return sessionsEnrolled; }
}
