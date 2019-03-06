package boundary_Class;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class addStudentPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addStudentPage frame = new addStudentPage();
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
	public addStudentPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreateNewStudent = new JLabel("Create new student");
		lblCreateNewStudent.setBounds(145, 29, 186, 26);
		contentPane.add(lblCreateNewStudent);
		
		JLabel lblStudentname = new JLabel("StudentName:");
		lblStudentname.setBounds(73, 106, 97, 16);
		contentPane.add(lblStudentname);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(182, 103, 116, 22);
		contentPane.add(textField);
		
		JButton button = new JButton("Submit");
		button.setBounds(160, 186, 97, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Return");
		button_1.setBounds(283, 186, 97, 25);
		contentPane.add(button_1);
	}

}
