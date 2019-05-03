package database;

import java.util.TreeMap;

import datatypes.Room;

public class RoomsTable
{
	private static RoomsTable uniqueInstance;
	private TreeMap<Integer, Room> rooms;
	private RoomsTable()
	{
		rooms = new TreeMap<>();
	}
	public static RoomsTable getInstance()
	{
		if(uniqueInstance == null)
		{
			synchronized(RoomsTable.class)
			{
				if(uniqueInstance == null)
					uniqueInstance = new RoomsTable();
			}
		}
		return uniqueInstance;
	}
	public TreeMap<Integer, Room> getData()
	{
		return rooms;
	}
}