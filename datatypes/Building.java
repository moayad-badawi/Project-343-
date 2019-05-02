package datatypes;

import java.util.ArrayList;

public class Building
{
	private String name;
	private ArrayList<Room> rooms;
	public Building(String name, ArrayList<Room> rooms)
	{
		this.name = name;
		this.rooms = rooms;
	}
	public void setName(String name) { this.name = name; }
	public void setRooms(ArrayList<Room> rooms) { this.rooms = rooms; }
	public String name() { return name; }
	public ArrayList<Room> rooms() { return rooms; }
}
