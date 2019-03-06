package boundary_Class;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class updateCollegePage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updateCollegePage frame = new updateCollegePage();
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
	public updateCollegePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUpdateCollegeAccount = new JLabel("Update college information");
		lblUpdateCollegeAccount.setBounds(129, 45, 186, 26);
		contentPane.add(lblUpdateCollegeAccount);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(185, 110, 116, 22);
		contentPane.add(textField);
		
		JLabel lblCollegeName = new JLabel("College Name:");
		lblCollegeName.setBounds(62, 113, 97, 16);
		contentPane.add(lblCollegeName);
		
		JButton button = new JButton("Submit");
		button.setBounds(159, 191, 97, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Return");
		button_1.setBounds(276, 191, 97, 25);
		contentPane.add(button_1);
	}
}
