package boundary_Class;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class admin_mainUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application for testing, have to remove later and run in main
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_mainUI frame = new admin_mainUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * After log in, first page for super admin
	 * 
	 * Need to improve with 9 button respond 
	 * Notice: when click return button, have to perform log out!!!!!!!!!!
	 */
	public admin_mainUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(68, 36, 97, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblManageAdminAccount = new JLabel("5. Manage Admin Account");
		lblManageAdminAccount.setBounds(274, 207, 208, 25);
		contentPane.add(lblManageAdminAccount);
		
		JButton button = new JButton("2");
		button.setBounds(68, 74, 97, 25);
		contentPane.add(button);
		
		JLabel lblManageCollege = new JLabel("2. Manage college information");
		lblManageCollege.setBounds(274, 147, 208, 25);
		contentPane.add(lblManageCollege);
		
		JLabel lblChangeSchool = new JLabel("1. Change school information");
		lblChangeSchool.setBounds(274, 127, 208, 25);
		contentPane.add(lblChangeSchool);
		
		JButton button_1 = new JButton("3");
		button_1.setBounds(68, 112, 97, 25);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.setBounds(68, 150, 97, 25);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.setBounds(68, 188, 97, 25);
		contentPane.add(button_3);
		
		JLabel lblManageDepartment = new JLabel("3. Manage department information");
		lblManageDepartment.setBounds(274, 167, 208, 25);
		contentPane.add(lblManageDepartment);
		
		JLabel lblManageEmployee = new JLabel("6. Manage employee information");
		lblManageEmployee.setBounds(274, 227, 208, 25);
		contentPane.add(lblManageEmployee);
		
		JLabel lblManageA = new JLabel("4. Manage major information");
		lblManageA.setBounds(274, 187, 208, 25);
		contentPane.add(lblManageA);
		
		JLabel lblManageClass = new JLabel("8. Manage class information");
		lblManageClass.setBounds(274, 267, 208, 25);
		contentPane.add(lblManageClass);
		
		JLabel lblManageSession = new JLabel("7. Manage session information");
		lblManageSession.setBounds(274, 247, 208, 25);
		contentPane.add(lblManageSession);
		
		JLabel lblContent = new JLabel("Content :");
		lblContent.setBounds(274, 112, 56, 16);
		contentPane.add(lblContent);
		
		JButton button_4 = new JButton("6");
		button_4.setBounds(68, 220, 97, 25);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.setBounds(68, 258, 97, 25);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.setBounds(68, 296, 97, 25);
		contentPane.add(button_6);
		
		JLabel lblAdminManagePage = new JLabel("Admin manage page");
		lblAdminManagePage.setBounds(274, 86, 192, 16);
		contentPane.add(lblAdminManagePage);
		
		JButton btnNewButton_1 = new JButton("Return");
		btnNewButton_1.setBounds(466, 360, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton button_7 = new JButton("9");
		button_7.setBounds(68, 334, 97, 25);
		contentPane.add(button_7);
		
		JLabel lblManageStudent = new JLabel("9. Manage student information");
		lblManageStudent.setBounds(274, 290, 208, 25);
		contentPane.add(lblManageStudent);
	}

}
