package studentManagementUI;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StudentWindow extends JFrame{
	public StudentWindow() {
		
		
		JPanel formPanel = new FormPanel();
		add(formPanel);
		JPanel studentsTable = new StudentsTablePanel();
		add(studentsTable);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setBounds(200, 100, 400, 500);
		setVisible(true);
	}
}