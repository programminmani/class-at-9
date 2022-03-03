package otherTools;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;  
public class TabbedPaneExample {  
JFrame f;  
TabbedPaneExample(){  
    f=new JFrame();  
    JTextArea ta=new JTextArea(300,200);
    JPanel mainPane=new JPanel();  
    mainPane.add(ta);  
    JPanel visitPane=new JPanel(); 
    visitPane.add(myTree());
    JPanel helpPane=new JPanel();
    JPanel aboutPane = new JPanel();
    JTabbedPane tp=new JTabbedPane();  
    tp.setBounds(50,50,300,200);  
    tp.add("main",mainPane);  
    tp.add("visit",visitPane); 
    tp.add("help",helpPane); 
    tp.add("about us", aboutPane);
    f.add(tp);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new TabbedPaneExample();  
} 

public JTree myTree() {
	DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");  
    DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");  
    DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");  
    style.add(color);  
    style.add(font);  
    DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");  
    DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");  
    DefaultMutableTreeNode black=new DefaultMutableTreeNode("black");  
    DefaultMutableTreeNode green=new DefaultMutableTreeNode("green");  
    color.add(red); color.add(blue); color.add(black); color.add(green);      
    JTree jt=new JTree(style);  
    return jt;
}
}