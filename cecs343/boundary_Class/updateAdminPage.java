package boundary_Class;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class updateAdminPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application for testing, have to remove later and run in main
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updateAdminPage frame = new updateAdminPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Page for user to update admin information
	 * The logic so far is read the admin name textfield and replace with old one by click submit
	 * Require to write more for button response
	 * Submit - update to database and direct to manageAdminMainPage
	 * Return - direct to manageAdminMainPage
	 */
	public updateAdminPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(190, 112, 116, 22);
		contentPane.add(textField);
		
		JLabel label = new JLabel("Admin Name:");
		label.setBounds(67, 115, 97, 16);
		contentPane.add(label);
		
		JLabel lblUpdateAdminAccount = new JLabel("Update admin account");
		lblUpdateAdminAccount.setBounds(136, 27, 186, 26);
		contentPane.add(lblUpdateAdminAccount);
		
		JButton button = new JButton("Submit");
		button.setBounds(164, 193, 97, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Return");
		button_1.setBounds(281, 193, 97, 25);
		contentPane.add(button_1);
	}

}
