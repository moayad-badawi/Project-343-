package boundary_Class;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class addSessionPage extends JFrame {

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
					addSessionPage frame = new addSessionPage();
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
	public addSessionPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSessionid = new JLabel("sessionID:");
		lblSessionid.setBounds(70, 111, 97, 16);
		contentPane.add(lblSessionid);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(193, 108, 116, 22);
		contentPane.add(textField);
		
		JLabel lblCreateNewSession = new JLabel("Create new session");
		lblCreateNewSession.setBounds(142, 34, 186, 26);
		contentPane.add(lblCreateNewSession);
		
		JButton button = new JButton("Submit");
		button.setBounds(157, 191, 97, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Return");
		button_1.setBounds(280, 191, 97, 25);
		contentPane.add(button_1);
		
		JLabel label = new JLabel("Location:");
		label.setBounds(70, 143, 97, 16);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(193, 140, 116, 22);
		contentPane.add(textField_1);
	}

}
