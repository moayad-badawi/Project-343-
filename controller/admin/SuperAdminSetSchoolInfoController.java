package controller.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.SchoolModel;
import view.AdminView;

public class SuperAdminSetSchoolInfoController implements ActionListener  {
	private AdminView view;
	private SchoolModel schlModel;
	public SuperAdminSetSchoolInfoController(AdminView view, SchoolModel schlModel) {
		this.view = view;
		this.schlModel = schlModel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
