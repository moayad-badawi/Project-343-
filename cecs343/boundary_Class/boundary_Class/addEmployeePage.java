package boundary_Class;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class addEmployeePage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addEmployeePage frame = new addEmployeePage();
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
	public addEmployeePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Submit");
		button.setBounds(159, 190, 97, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Return");
		button_1.setBounds(282, 190, 97, 25);
		contentPane.add(button_1);
		
		JLabel lblEmployeeName = new JLabel("Employee Name:");
		lblEmployeeName.setBounds(57, 110, 134, 16);
		contentPane.add(lblEmployeeName);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(181, 107, 116, 22);
		contentPane.add(textField);
		
		JLabel lblCreateNewEmployee = new JLabel("Create new employee");
		lblCreateNewEmployee.setBounds(144, 33, 186, 26);
		contentPane.add(lblCreateNewEmployee);
	}

}
