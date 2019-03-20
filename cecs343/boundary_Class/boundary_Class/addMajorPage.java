package boundary_Class;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class addMajorPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addMajorPage frame = new addMajorPage();
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
	public addMajorPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreateNewMajor = new JLabel("Create new major");
		lblCreateNewMajor.setBounds(149, 26, 186, 26);
		contentPane.add(lblCreateNewMajor);
		
		JLabel lblMajorName = new JLabel("Major Name:");
		lblMajorName.setBounds(62, 103, 134, 16);
		contentPane.add(lblMajorName);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(186, 100, 116, 22);
		contentPane.add(textField);
		
		JButton button = new JButton("Submit");
		button.setBounds(164, 183, 97, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Return");
		button_1.setBounds(287, 183, 97, 25);
		contentPane.add(button_1);
	}

}
