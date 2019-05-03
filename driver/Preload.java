package driver;
// add roomsTable
import database.*;
import datatypes.*;
import java.util.ArrayList;
import java.time.LocalTime;

public class Preload
{
	public Preload() {}
	public void load()
	{
		// University
		UniversityInformationTable.getInstance().getData().setName("CSULB");
		// College of Engineering, college 0 in university
		ArrayList<String> departments = new ArrayList<>();
		departments.add("CECS");
		College college = new College("College of Engineering", 2, departments); // userID = 2 = college dean
		CollegesTable.getInstance().getData().put(college.name(), college);
		// CECS, department 0 in college 0 in university
		ArrayList<String> majors = new ArrayList<>();
		majors.add("Computer Science");
		Department department = new Department("CECS", 3, majors);	// userID = 3 = department chair
		DepartmentsTable.getInstance().getData().put(department.name(), department);
		// Computer Science, major 0 in department 0 in college 0 in university
		ArrayList<Integer> courses = new ArrayList<>();
		courses.add(0);		// course 0 in major 0 in department 0 in college 0 in university
		Major major = new Major("Computer Science", courses);
		MajorsTable.getInstance().getData().put(major.name(), major);
		// CECS 225, course 0 in major 0 in department 0 in college 0 in university, no prereq
		int cid = CoursesTable.getInstance().getID();
		ArrayList<Integer> prereqs = new ArrayList<>();
		ArrayList<Integer> sessions = new ArrayList<>();
		sessions.add(0);			// session 0 belongs to CECS 225
		Course course = new Course(cid, "CECS 225", prereqs, sessions);
		CoursesTable.getInstance().getData().put(course.id(), course);
		// CECS 341, course 1 in major 0 in department 0 in college 0 in university, prereq = CECS 225(cid = 0)
		cid = CoursesTable.getInstance().getID();
		prereqs = new ArrayList<>();
		prereqs.add(0);
		sessions = new ArrayList<>();
		sessions.add(1);			// session 1 belongs to CECS 341
		course = new Course(cid, "CECS 341", prereqs, sessions);
		CoursesTable.getInstance().getData().put(course.id(), course);
		// superadmin, user 0
		int uid = UsersTable.getInstance().getID();
		User user = new User(uid, "superadmin", "superadmin");
		UsersTable.getInstance().getData().put(user.id(), user);
		Admin admin = new Admin(uid, "Trung", "Ba", "Ngyuen");
		AdminsTable.getInstance().getData().put(admin.id(), admin);
		// admin, user 1
		uid = UsersTable.getInstance().getID();
		user = new User(uid, "admin", "admin");
		UsersTable.getInstance().getData().put(user.id(), user);
		admin = new Admin(uid, "Ping", "Ping", "Ping");
		AdminsTable.getInstance().getData().put(admin.id(), admin);
		// employee, user 2, dean
		uid = UsersTable.getInstance().getID();
		user = new User(uid, "employee", "employee");
		UsersTable.getInstance().getData().put(user.id(), user);
		sessions = new ArrayList<>();
		Employee employee = new Employee(uid, "Mo", "Mo", "Mo", "dean", 1000, sessions);
		EmployeesTable.getInstance().getData().put(employee.id(), employee);
		// employee, user 3, chair
		uid = UsersTable.getInstance().getID();
		user = new User(uid, "employee", "employee");
		UsersTable.getInstance().getData().put(user.id(), user);
		sessions = new ArrayList<>();
		employee = new Employee(uid, "Jianqiang", "Du", "Du", "chair", 500, sessions);
		EmployeesTable.getInstance().getData().put(employee.id(), employee);
		// employee, user 4, professor
		uid = UsersTable.getInstance().getID();
		user = new User(uid, "employee", "employee");
		UsersTable.getInstance().getData().put(user.id(), user);
		sessions = new ArrayList<>();
		sessions.add(0);		// CECS 225
		sessions.add(1);		// CECS 341
		employee = new Employee(uid, "Xiaolong", "Wu", "Wu", "professor", 1, sessions);
		EmployeesTable.getInstance().getData().put(employee.id(), employee);
		// student, user 5
		uid = UsersTable.getInstance().getID();
		user = new User(uid, "student", "student");
		UsersTable.getInstance().getData().put(user.id(), user);
		sessions = new ArrayList<>();
		sessions.add(0);		// CECS 225
		sessions.add(1);		// CECS 341
		Student student = new Student(uid, "O", "M", "G", "Computer Science", "Paid", sessions);
		StudentsTable.getInstance().getData().put(student.id(), student);
		// building
		Room room = new Room(0, 30, "VEC");			// room 0
		RoomsTable.getInstance().getData().put(room.id(), room);
		//ArrayList<Room> rooms = new ArrayList<>();
		//rooms.add(room);
		//Building building = new Building("VEC", rooms);
		//BuildingsTable.getInstance().getData().put(building.name(), building);
		// session 0, of CECS 225 (cid = 0), instructorID = 4, 
		int sid = SessionsTable.getInstance().getID();
		LocalTime startTime = LocalTime.of(11, 00);
		LocalTime endTime = LocalTime.of(12, 50);
		ArrayList<Integer> roster = new ArrayList<>();
		roster.add(5);
		Session session = new Session(sid, 0, 4, startTime, endTime, "Fall", 2018, "MW", "VEC", 0, 30, roster);
		SessionsTable.getInstance().getData().put(session.id(), session);
		// session 1, of CECS 341 (cid = 1), instructorID = 4,
		sid = SessionsTable.getInstance().getID();
		startTime = LocalTime.of(14, 00);
		endTime = LocalTime.of(16, 30);
		roster = new ArrayList<>();
		roster.add(5);
		session = new Session(sid, 1, 4, startTime, endTime, "Fall", 2018, "TTh", "VEC", 0, 30, roster);
		SessionsTable.getInstance().getData().put(session.id(), session);
	}
	/*public static void main(String[] args)
	{
		TreeMap<Integer, ArrayList<String>> a = new TreeMap<>();
		ArrayList<String> S = new ArrayList<>();
		S.add("zero");
		a.put(0, S);
		ArrayList<String> S1 = new ArrayList<>();
		S1.add("one");
		a.put(1, S1);
		S1.add("two");
		a.put(1, S1);
		// S = [ <0,S>, <1,S1> ]
		for(int i : a.navigableKeySet())
			System.out.println(i + " " + a.get(i));
		LocalTime t = LocalTime.of(17, 00);
		LocalTime v = LocalTime.of(18, 00);
		System.out.println(t.isBefore(v));
	}*/
}
