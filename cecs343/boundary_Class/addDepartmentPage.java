package boundary_Class;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class addDepartmentPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addDepartmentPage frame = new addDepartmentPage();
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
	public addDepartmentPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreateNewDepartment = new JLabel("Create new department");
		lblCreateNewDepartment.setBounds(140, 32, 186, 26);
		contentPane.add(lblCreateNewDepartment);
		
		JLabel lblDepartmentname = new JLabel("DepartmentName:");
		lblDepartmentname.setBounds(53, 109, 134, 16);
		contentPane.add(lblDepartmentname);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(177, 106, 116, 22);
		contentPane.add(textField);
		
		JButton button = new JButton("Submit");
		button.setBounds(155, 189, 97, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Return");
		button_1.setBounds(278, 189, 97, 25);
		contentPane.add(button_1);
	}

}
