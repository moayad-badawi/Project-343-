package boundary_Class;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class addCollegePage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addCollegePage frame = new addCollegePage();
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
	public addCollegePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreateNewCollege = new JLabel("Create new college");
		lblCreateNewCollege.setBounds(153, 39, 186, 26);
		contentPane.add(lblCreateNewCollege);
		
		JLabel lblCollegeName = new JLabel("College Name:");
		lblCollegeName.setBounds(81, 116, 97, 16);
		contentPane.add(lblCollegeName);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(190, 113, 116, 22);
		contentPane.add(textField);
		
		JButton button = new JButton("Submit");
		button.setBounds(168, 196, 97, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Return");
		button_1.setBounds(291, 196, 97, 25);
		contentPane.add(button_1);
	}
}
