package controller;

import controller.admin.AdminViewController;
import controller.admin.school.SuperAdminSetSchoolInfoController;
import datatypes.Admin;
import model.AdminModel;
import model.EmployeeModel;
import model.SchoolModel;
import model.StudentModel;
import model.SuperAdminModel;
import model.UserModel;
import view.AdminView;
import view.StudentView;

public class AdminController {
	private AdminView 	view;
	private Admin 		admin;
	
	private SchoolModel 	schlModel;
	private StudentModel 	stdModel;
	private AdminModel 		adModel;
	private EmployeeModel 	empModel;
	private SuperAdminModel sAdModel;
	private UserModel 		userModel;

	
	public AdminController(Admin admin){
		this.admin  	= admin;

		this.view 		= new AdminView();
		
		this.schlModel  = new SchoolModel();
		this.stdModel 	= new StudentModel();
		this.adModel	= new AdminModel();
		this.empModel	= new EmployeeModel();
		this.stdModel	= new StudentModel();
		this.sAdModel	= new SuperAdminModel();
		this.userModel	= new UserModel();
	}
	public void init() {
	// Special Controller:
		AdminViewController adViewController	= new AdminViewController(view, admin);
		adViewController.init();
 
	// Controllers:
		SuperAdminSetSchoolInfoController adminSetSchoolInfoController = new SuperAdminSetSchoolInfoController(view, schlModel);
		//view.set
		
		
	
	}
}
