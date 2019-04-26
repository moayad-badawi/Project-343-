package controller;

public class StudentController {
	Login loginView;
	// Model here!
	LoginController(Login loginView){
		this.loginView = loginView;
		
		loginView.setVisible(true);
	}
}
