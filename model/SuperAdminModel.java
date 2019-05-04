package model;

import datatypes.*;
import database.*;

import java.util.ArrayList;
import java.util.TreeMap;

public class SuperAdminModel extends AdminModel
{
	public SuperAdminModel()
	{
		super();
	}
	public void addAdmin(Admin admin)
	{
		AdminsTable.getInstance().getData().put(admin.id(), admin);
	}
	public void removeAdmin(int id)
	{
		AdminsTable.getInstance().getData().remove(id);
	}
	public void updateAdmin(Admin admin)
	{
		AdminsTable.getInstance().getData().replace(admin.id(), admin);
	}
	public TreeMap<Integer, Admin> getAllAdmins()
	{
		return AdminsTable.getInstance().getData();
	}
	public Object[][] getAllAdminsConverted()
	{
		TreeMap<Integer, Admin> admins = getAllAdmins();
		Object[][] tableData = new Object[admins.size() - 1][4];
		for(int i = 1; i < admins.size(); i++)
		{
			tableData[i-1][0] = admins.get(i).id();
			tableData[i-1][1] = admins.get(i).firstname();
			tableData[i-1][2] = admins.get(i).middlename().substring(0, 1);
			tableData[i-1][3] = admins.get(i).lastname();
		}
		return tableData;
	}
}
