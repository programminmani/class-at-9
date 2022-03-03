package studentManagementUI;


import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneLayout;

import studentManagementUI.Model.Student;
import studentManagementUI.Model.Dao.StudentDao;

public class StudentWindow extends JFrame{
	public StudentWindow() {
		
		
		JPanel formPanel = new FormPanel(this);
		add(formPanel);
		//JPanel studentsTable = new StudentsTablePanel();
		//add(studentsTable);
		List<Student> stList = new StudentDao().getAll();
        StudentTableModel model = new StudentTableModel(stList);
        JTable table = new JTable(model);
		
		JScrollPane tablePane = new JScrollPane(table);
		tablePane.setBounds(10, 220, 370, 235);
		add(tablePane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		pack();
		setBounds(200, 100, 400, 500);
		setVisible(true);
	}
}