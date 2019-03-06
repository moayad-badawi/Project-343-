package boundary_Class;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class schoolInfoPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application for testing, have to remove later and run in main
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					schoolInfoPage frame = new schoolInfoPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create page for update school information
	 * Need to write more for button response
	 * Return - direct to admin_mainUI
	 * Submit - always replace the word in textarea to database and then direct to admin_mainUI
	 */
	public schoolInfoPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 13, 387, 190);
		textArea.setLineWrap(true);				//Turn on auto next line
		contentPane.add(textArea);		
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(302, 215, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("Return");
		button.setBounds(193, 216, 97, 25);
		contentPane.add(button);
	}
}
