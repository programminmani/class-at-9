package TableModelExample;


import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.AbstractTableModel;

import studentManagementUI.Model.Student;
import studentManagementUI.Model.Dao.StudentDao;

public class TableModelExample {

    public static void main(String[] args) {
        new TableModelExample();
    }

    public TableModelExample() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }

//                List<Click> clicks = new ArrayList<>(25);
//                clicks.add(new Click(620, 1028));
//                clicks.add(new Click(480, 230));
                
                List<Student> stList = new StudentDao().getAll();
                StudentTableModel model = new StudentTableModel(stList);
                JTable table = new JTable(model);

                JFrame frame = new JFrame("Testing");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new JScrollPane(table));
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    

    public class StudentTableModel extends AbstractTableModel {

        private List<Student> students;

        public StudentTableModel(List<Student> students) {
            this.students = new ArrayList<>(students);
        }

        @Override
        public int getRowCount() {
            return students.size();
        }

        @Override
        public int getColumnCount() {
            return 4;
        }

        @Override
        public String getColumnName(int column) {
            String name = "??";
            switch (column) {
                case 0:
                    name = "id";
                    break;
                case 1:
                    name = "First Name";
                    break;
                case 2:
                	name = "Last Name";
                	break;
                case 3:
                	name = "Email";
                	break;
            }
            return name;
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            Class type = String.class;
            switch (columnIndex) {
                case 0:
                case 1:
                    type = Integer.class;
                    break;
            }
            return type;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Student st = students.get(rowIndex);
            Object value = null;
            switch (columnIndex) {
                case 0:
                    value = st.getId();
                    break;
                case 1:
                    value = st.getfName();
                    break;
                case 2:
                	value  = st.getlName();
                	break;
                case 3:
                	value = st.getEmail();
                	break;
            }
            return value;
        }            
    }        
}
