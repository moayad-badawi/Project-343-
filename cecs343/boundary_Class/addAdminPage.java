package boundary_Class;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class addAdminPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application for testing, have to remove later and run in main
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addAdminPage frame = new addAdminPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Need to write more for two button responds, 
	 * Here I assume admin only have one attribute with username, might need to improve for more base on the primary key
	 * Submit - update new admin to database and go back to manageAdminMainPage
	 * Return - go back to manageAdminMainPage
	 */
	public addAdminPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminName = new JLabel("Admin Name:");
		lblAdminName.setBounds(73, 100, 97, 16);
		contentPane.add(lblAdminName);
		
		textField = new JTextField();
		textField.setBounds(181, 97, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(156, 199, 97, 25);
		contentPane.add(btnSubmit);
		
		JLabel lblCreateNewAdmin = new JLabel("Create new admin account");
		lblCreateNewAdmin.setBounds(124, 27, 186, 26);
		contentPane.add(lblCreateNewAdmin);
		
		JButton button = new JButton("Return");
		button.setBounds(271, 199, 97, 25);
		contentPane.add(button);
	}

}
