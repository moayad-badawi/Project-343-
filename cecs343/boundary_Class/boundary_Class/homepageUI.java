package boundary_Class;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class homepageUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application for testing, have to remove later and run in main
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepageUI frame = new homepageUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * This will be the first page users see
	 * Create one textfield for username and another textfield for password just in case
	 * 
	 * Need to write the logic of button submit respond (interaction with database???)
	 */
	public homepageUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.setBounds(157, 202, 97, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(98, 79, 72, 32);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(98, 119, 72, 25);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(213, 84, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(213, 120, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUniversityManageSystem = new JLabel("University Manage System");
		lblUniversityManageSystem.setBounds(124, 28, 251, 34);
		contentPane.add(lblUniversityManageSystem);
	}
}
