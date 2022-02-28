package studentManagementUI;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import studentManagementUI.Model.Student;

public class StudentTableModel extends AbstractTableModel {
	
	List<Student> stList = new ArrayList<>();
	private String[] columnHeader={"Id", "First Name", "Last Name", "Email"}; 
	
	public StudentTableModel(List<Student> stList) {
		this.stList = stList;	
	}

	@Override
	public int getRowCount() {
		return stList.size();
	}

	@Override
	public int getColumnCount() {
		return 4;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		 Student st = stList.get(rowIndex);
		 //System.out.println(st);
         //Object value = null;
         switch (columnIndex) {
             case 0:
                 return st.id;
                 
             case 1:
            	 return st.fName;
                 
             case 2:
            	 return st.lName;
            	 
             case 3:
            	 return st.email;
            	 
         }
         return null;
	}
	
	@Override
    public String getColumnName(int column) {
      return this.columnHeader[column];
        
    }
	
	@Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
            	return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
        }
        return null;
    }


}

