package database;

import datatypes.University;

public class UniversityInformationTable
{
	private static UniversityInformationTable uniqueInstance;
	private University univ;
	// implement current semester and year with java.util.Date
	private UniversityInformationTable()
	{
		univ = new University();
	}
	public static UniversityInformationTable getInstance()
	{
		if(uniqueInstance == null)
		{
			synchronized(UniversityInformationTable.class)
			{
				if(uniqueInstance == null)
					uniqueInstance = new UniversityInformationTable();
			}
		}
		return uniqueInstance;
	}
	public University getData()
	{
		return univ;
	}
}