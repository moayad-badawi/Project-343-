package controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import view.Login;
import view.Student;

public class LoginController  {
	Login loginView;
	// Model here!
	LoginController(Login loginView){
		this.loginView = loginView;
		
		loginView.setVisible(true);
	}

	public void login(JTextField usernameField, JPasswordField passwordField, JFrame loginFrame) {
		String username = usernameField.getText();
		String password = passwordField.getText();
		
		// Test Value:
		boolean test 	= true;
		int 	userID 	= 1;
		
		if(test) { // if user in db
			loginFrame.dispose();
			// @If student:
			//Student frame = new Student(userID, loginFrame);
				Student studentView = new Student();
				StudentController studentControler = new StudentController(studentView);
				// Tell view about controller
				studentView.setStudentView(studentControler);
				Student frame = new Student();

			frame.setVisible(true);
			
			// @If Employee:
			
			// @If Admin:
			
		} else {
            JOptionPane.showMessageDialog(null, "The username or password is incorrect", "Error",
            		JOptionPane.ERROR_MESSAGE);
        }
	}
}
