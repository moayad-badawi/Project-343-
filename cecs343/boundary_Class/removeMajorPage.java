package boundary_Class;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class removeMajorPage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnUpdate;
	private JButton btnReturn;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					removeMajorPage frame = new removeMajorPage();
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
	public removeMajorPage() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//ScrollPane for Table
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 3, 368, 212);
		contentPane.add(scrollPane);
		
		//Table
		table = new JTable();
		scrollPane.setViewportView(table);
		
		//Model for table
		DefaultTableModel model= new DefaultTableModel() {
			public Class<?>getColumnClass(int column){
				switch(column) {
					case 0:
						return Boolean.class;
					case 1:
						return String.class;
					case 2:
						return String.class;
					case 3:
						return String.class;
					case 4:
						return String.class;
					case 5:
						return String.class;
					case 6:
						return String.class;
					default:
						return String.class;
				}
			}
		};
		
		table.setModel(model);
		
		model.addColumn("1");
		model.addColumn("2");
		model.addColumn("3");
		model.addColumn("4");
		model.addColumn("5");
		
		for( int i = 0;i<5;i++){
			model.addRow(new Object[0]);
		}
	
		btnNewButton = new JButton("Remove");
		btnNewButton.setBounds(323, 220, 97, 25);
		contentPane.add(btnNewButton);
		
		btnUpdate = new JButton("Update");
		btnUpdate.setBounds(214, 220, 97, 25);
		contentPane.add(btnUpdate);
		
		btnReturn = new JButton("Return");
		btnReturn.setBounds(105, 220, 97, 25);
		contentPane.add(btnReturn);
	}

}
