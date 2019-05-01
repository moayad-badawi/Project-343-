package controller;

import controller.admin.AdminViewController;
import datatypes.Admin;
import view.AdminView;
import view.StudentView;

public class AdminController {
	private AdminView 	view;
	private Admin 		admin;
	
	public AdminController(Admin admin){
		this.view 	= new AdminView();
		this.admin  = admin;
	}
	public void init() {
	// Special Controller:
		AdminViewController adViewController	= new AdminViewController(view, admin);
		adViewController.init();
 
	// Controllers:

	}
}
