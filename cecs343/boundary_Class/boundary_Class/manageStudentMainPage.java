package boundary_Class;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class manageStudentMainPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					manageStudentMainPage frame = new manageStudentMainPage();
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
	public manageStudentMainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblManageStudentMain = new JLabel("Manage student main page");
		lblManageStudentMain.setBounds(121, 27, 266, 46);
		contentPane.add(lblManageStudentMain);
		
		JButton button = new JButton("Add");
		button.setBounds(25, 156, 97, 73);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Remove");
		button_1.setBounds(121, 156, 97, 73);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Update");
		button_2.setBounds(215, 156, 97, 73);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Return");
		button_3.setBounds(308, 156, 97, 73);
		contentPane.add(button_3);
	}

}
