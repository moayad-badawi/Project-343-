package boundary_Class;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class searchCriteriaPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searchCriteriaPage frame = new searchCriteriaPage();
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
	public searchCriteriaPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(230, 90, 116, 22);
		contentPane.add(textField);
		
		JLabel lblSubject = new JLabel("Subject :");
		lblSubject.setBounds(80, 96, 97, 16);
		contentPane.add(lblSubject);
		
		JLabel lblSearchCriteriaPage = new JLabel("Search Criteria Page");
		lblSearchCriteriaPage.setBounds(124, 28, 186, 26);
		contentPane.add(lblSearchCriteriaPage);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(162, 204, 97, 25);
		contentPane.add(btnSearch);
		
		JButton button_1 = new JButton("Return");
		button_1.setBounds(271, 204, 97, 25);
		contentPane.add(button_1);
		
		JLabel lblCourseNumber = new JLabel("course number :");
		lblCourseNumber.setBounds(80, 127, 97, 16);
		contentPane.add(lblCourseNumber);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(230, 121, 116, 22);
		contentPane.add(textField_1);
	}

}
