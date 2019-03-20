package boundary_Class;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class admin_main_UI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_main_UI frame = new admin_main_UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public admin_main_UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("1");
		button.setBounds(49, 27, 97, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setBounds(49, 65, 97, 25);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setBounds(49, 103, 97, 25);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.setBounds(49, 141, 97, 25);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.setBounds(49, 179, 97, 25);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.setBounds(49, 211, 97, 25);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.setBounds(49, 249, 97, 25);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.setBounds(49, 287, 97, 25);
		contentPane.add(button_7);
		
		JLabel lblManage = new JLabel("5. Manage student information");
		lblManage.setBounds(255, 198, 208, 25);
		contentPane.add(lblManage);
		
		JLabel label_1 = new JLabel("Content :");
		label_1.setBounds(255, 103, 56, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("1. Change school information");
		label_2.setBounds(255, 118, 208, 25);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("2. Manage college information");
		label_3.setBounds(255, 138, 208, 25);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("4. Manage major information");
		label_4.setBounds(255, 178, 208, 25);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("3. Manage department information");
		label_5.setBounds(255, 158, 208, 25);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("6. Manage employee information");
		label_6.setBounds(255, 218, 208, 25);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("8. Manage class information");
		label_7.setBounds(255, 258, 208, 25);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("7. Manage session information");
		label_8.setBounds(255, 238, 208, 25);
		contentPane.add(label_8);
		
		JLabel lblAdminManagePage = new JLabel("Admin manage page");
		lblAdminManagePage.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAdminManagePage.setBounds(255, 54, 192, 16);
		contentPane.add(lblAdminManagePage);
	}
}
