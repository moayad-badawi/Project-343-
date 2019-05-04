package datatypes;

public class Admin
{
	private final int id;
	private String firstname;
	private char middleInitial;
	private String lastname;
	public Admin(final int id, String firstname, char middleInitial, String lastname)
	{
		this.id = id;
		this.firstname = firstname;
		this.middleInitial = middleInitial;
		this.lastname = lastname;
	}
	public void setFirstname(String firstname) { this.firstname = firstname; }
	public void setMiddleInitial(char middleInitial) { this.middleInitial = middleInitial; }
	public void setLastname(String lastname) { this.lastname = lastname; }
	public final int id() { return id; }
	public String firstname() { return firstname; }
	public char middleInitial() { return middleInitial; }
	public String lastname() { return lastname; }
}