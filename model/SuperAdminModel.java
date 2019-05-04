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
	public int addAdminAccount(Admin admin, String password)
	{
		int id = generateUserID();
		User user = new User(id, password, "Admin");
		admin.setID(id);
		UsersTable.getInstance().getData().put(id, user);
		AdminsTable.getInstance().getData().put(id, admin);
		return id;
	}
	public void removeAdminAccount(int id)
	{
		AdminsTable.getInstance().getData().remove(id);
	}
	public void setAdminAccount(Admin admin)
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
		//System.out.println(admins.size());
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
