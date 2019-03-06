package boundary_Class;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class manageAdminMainPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application for testing, have to remove later and run in main
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					manageAdminMainPage frame = new manageAdminMainPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Page shown after superadmin click button5 in admin main ui
	 * Need to write more for button respond
	 * Add - direct to addAdminPage
	 * Remove - direct to updateAdminPage
	 * Update - direct to updateAdminPage
	 * Return - direct to admin_mainUI
	 */
	public manageAdminMainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(23, 167, 97, 73);
		contentPane.add(btnNewButton);
		
		JLabel lblManageAdministratorMain = new JLabel("Manage administrator main page");
		lblManageAdministratorMain.setBounds(99, 50, 266, 46);
		contentPane.add(lblManageAdministratorMain);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(119, 167, 97, 73);
		contentPane.add(btnRemove);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(213, 167, 97, 73);
		contentPane.add(btnUpdate);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReturn.setBounds(306, 167, 97, 73);
		contentPane.add(btnReturn);
	}
}
