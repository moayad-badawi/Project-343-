package model;

import datatypes.*;
import database.*;
import java.util.TreeMap;

public class SuperAdminModel extends AdminModel
{
	public SuperAdminModel()
	{
		super();
	}
	public void updateUniversityName(String name)
	{
		UniversityInformationTable.getInstance().getData().setName(name);
	}
	public void addAdmin(Admin admin)
	{
		AdminsTable.getInstance().getData().put(admin.id(), admin);
	}
	public void removeAdmin(int id)
	{
		AdminsTable.getInstance().getData().remove(id);
	}
	public void updateAdmin(int id, Admin admin)
	{
		AdminsTable.getInstance().getData().replace(id, admin);
	}
	public TreeMap<Integer, Admin> getAllAdmins()
	{
		return AdminsTable.getInstance().getData();
	}
}
