package boundary_Class;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class addCoursePage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addCoursePage frame = new addCoursePage();
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
	public addCoursePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreateNewCourse = new JLabel("Create new course");
		lblCreateNewCourse.setBounds(137, 37, 186, 26);
		contentPane.add(lblCreateNewCourse);
		
		JLabel lblCoursename = new JLabel("CourseName:");
		lblCoursename.setBounds(65, 114, 97, 16);
		contentPane.add(lblCoursename);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(174, 111, 116, 22);
		contentPane.add(textField);
		
		JButton button = new JButton("Submit");
		button.setBounds(152, 194, 97, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Return");
		button_1.setBounds(275, 194, 97, 25);
		contentPane.add(button_1);
	}

}
