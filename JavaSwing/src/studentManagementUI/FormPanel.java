package studentManagementUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import studentManagementUI.Model.Student;
import studentManagementUI.Model.Dao.StudentDao;

public class FormPanel extends JPanel {
	public FormPanel() {
		setBackground(Color.cyan);
		setBounds(10, 10, 370, 200);
		setLayout(null);
		JLabel title = new JLabel("Student Form");
		title.setBounds(150,20,100,30);
		add(title);
		JLabel lblfName = new JLabel("First Name: ");
		lblfName.setBounds(50,60,100,30);
		add(lblfName);
		JTextField fNameField = new JTextField();
		fNameField.setBounds(160,65,150,20);
		add(fNameField);
		
		JLabel lbllName = new JLabel("Last Name: ");
		lbllName.setBounds(50,90,100,30);
		add(lbllName);
		JTextField lNameField = new JTextField();
		lNameField.setBounds(160,95,150,20);
		add(lNameField);
		
		JLabel lblEmail= new JLabel("Email: ");
		lblEmail.setBounds(50,120,100,30);
		add(lblEmail);
		JTextField emailField = new JTextField();
		emailField.setBounds(160,125,150,20);
		add(emailField);
		
		JButton submitBtn = new JButton("Submit");
		submitBtn.setBounds(50,160,260,20);
		add(submitBtn);
		
		
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fName = fNameField.getText();
				String lName = lNameField.getText();
				String email= emailField.getText();
				Student st = new Student(fName, lName, email);
				StudentDao sDao = new StudentDao();
				sDao.insert(st);
			}
		});
		
		setVisible(true);
	}
}
