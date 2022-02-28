package studentManagementUI;

import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import studentManagementUI.Model.Student;
import studentManagementUI.Model.Dao.StudentDao;

public class StudentsTableScrollPane extends JScrollPane {

	public StudentsTableScrollPane() {
		List<Student> stList= new StudentDao().getAll();
		//System.out.println(stList);
		StudentTableModel model = new StudentTableModel(stList);
	    JTable table = new JTable(model);
	    table.setBounds(10,50,350,180);
	    table.setCellSelectionEnabled(true);
	    ListSelectionModel cellSelectionModel = table.getSelectionModel();
	    cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	
	    cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
	      public void valueChanged(ListSelectionEvent e) {
	        String selectedData = null;
	
	        int[] selectedRow = table.getSelectedRows();
	        int[] selectedColumns = table.getSelectedColumns();
	
	        for (int i = 0; i < selectedRow.length; i++) {
	          for (int j = 0; j < selectedColumns.length; j++) {
	            selectedData = (String) table.getValueAt(selectedRow[i], selectedColumns[j]);
	          }
	        }
	       
	      }
	
	    });
	    add(table);
	}
	
}
