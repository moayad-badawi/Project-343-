package boundary_Class;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class manageEmloyeeMainPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					manageEmloyeeMainPage frame = new manageEmloyeeMainPage();
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
	public manageEmloyeeMainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Add");
		button.setBounds(25, 167, 97, 73);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Remove");
		button_1.setBounds(121, 167, 97, 73);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Update");
		button_2.setBounds(215, 167, 97, 73);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Return");
		button_3.setBounds(308, 167, 97, 73);
		contentPane.add(button_3);
		
		JLabel lblManageEmployeeMain = new JLabel("Manage employee main page");
		lblManageEmployeeMain.setBounds(121, 38, 266, 46);
		contentPane.add(lblManageEmployeeMain);
	}

}
