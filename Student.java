package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Student extends JFrame {

	private JPanel contentPane;
	private JTextField fullnameField;
	private JTextField idField;
	private JTextField tuitionField;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student frame = new Student();
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
//	public Student(int userID, JFrame loginFrame) {
	public Student() {
		//System.out.print(userID);
		

		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenu mnAbout = new JMenu("About");
		menuBar.add(mnAbout);
		
		JMenuItem mntmInfo = new JMenuItem("Info");
		mnAbout.add(mntmInfo);
		
		JPanel panel = new JPanel();
		menuBar.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JButton btnLogout = new JButton("Logout");
		panel.add(btnLogout, BorderLayout.EAST);
		// Menu bar handler
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opt = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?");
				if(opt == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
				
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 775, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 527, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JPanel studentTab = new JPanel();
		tabbedPane.addTab("Student", null, studentTab, null);
		
		JPanel schedulePanel = new JPanel();
		schedulePanel.setBorder(new TitledBorder(null, "Weekly Schedule", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel addClassPanel = new JPanel();
		addClassPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Add Class", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel dropClassPanel = new JPanel();
		dropClassPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Drop Class", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel studentInfoPanel = new JPanel();
		studentInfoPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Student Info", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GroupLayout gl_studentTab = new GroupLayout(studentTab);
		gl_studentTab.setHorizontalGroup(
			gl_studentTab.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_studentTab.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_studentTab.createParallelGroup(Alignment.LEADING)
						.addComponent(dropClassPanel, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
						.addComponent(studentInfoPanel, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
						.addComponent(addClassPanel, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(schedulePanel, GroupLayout.PREFERRED_SIZE, 530, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_studentTab.setVerticalGroup(
			gl_studentTab.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_studentTab.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_studentTab.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_studentTab.createSequentialGroup()
							.addComponent(studentInfoPanel, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(addClassPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(dropClassPanel, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))
						.addComponent(schedulePanel, GroupLayout.PREFERRED_SIZE, 478, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		JLabel lblTerms = new JLabel("Term: ");
		lblTerms.setBounds(16, 30, 32, 14);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(52, 27, 92, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Fall 2019", "Spring 2020"}));
		schedulePanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 65, 498, 396);
		schedulePanel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		schedulePanel.add(lblTerms);
		schedulePanel.add(comboBox);
		
		JLabel label = new JLabel("CRN:");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GroupLayout gl_dropClassPanel = new GroupLayout(dropClassPanel);
		gl_dropClassPanel.setHorizontalGroup(
			gl_dropClassPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_dropClassPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		gl_dropClassPanel.setVerticalGroup(
			gl_dropClassPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_dropClassPanel.createSequentialGroup()
					.addGap(47)
					.addGroup(gl_dropClassPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(59, Short.MAX_VALUE))
		);
		dropClassPanel.setLayout(gl_dropClassPanel);
		
		JLabel lblNewLabel = new JLabel("CRN:");
		
		textField = new JTextField();
		textField.setColumns(10);
		GroupLayout gl_addClassPanel = new GroupLayout(addClassPanel);
		gl_addClassPanel.setHorizontalGroup(
			gl_addClassPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_addClassPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		gl_addClassPanel.setVerticalGroup(
			gl_addClassPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_addClassPanel.createSequentialGroup()
					.addGap(57)
					.addGroup(gl_addClassPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(65, Short.MAX_VALUE))
		);
		addClassPanel.setLayout(gl_addClassPanel);
		
		JLabel lblName = new JLabel("Name:");
		
		JLabel lblId = new JLabel("ID:");
		
		JLabel lblTuition = new JLabel("Tuition:  ");
		
		fullnameField = new JTextField();
		fullnameField.setColumns(10);
		fullnameField.setEditable(false);
		fullnameField.setText("Trung Nguyen");

		
		idField = new JTextField();
		idField.setColumns(10);
		idField.setEditable(false);

		
		tuitionField = new JTextField();
		tuitionField.setColumns(10);
		tuitionField.setEditable(false);

		GroupLayout gl_studentInfoPanel = new GroupLayout(studentInfoPanel);
		gl_studentInfoPanel.setHorizontalGroup(
			gl_studentInfoPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_studentInfoPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_studentInfoPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblName)
						.addComponent(lblId)
						.addComponent(lblTuition))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_studentInfoPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(tuitionField, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
						.addComponent(fullnameField, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
						.addComponent(idField, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		gl_studentInfoPanel.setVerticalGroup(
			gl_studentInfoPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_studentInfoPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_studentInfoPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(fullnameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_studentInfoPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(idField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblId))
					.addPreferredGap(ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
					.addGroup(gl_studentInfoPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(tuitionField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTuition))
					.addContainerGap())
		);
		studentInfoPanel.setLayout(gl_studentInfoPanel);
		studentTab.setLayout(gl_studentTab);
		
		JPanel scheduleTab = new JPanel();
		tabbedPane.addTab("Schedule", null, scheduleTab, null);
		contentPane.setLayout(gl_contentPane);
	}
}
