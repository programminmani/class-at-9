import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowClass {
	public static void main(String[] args) {
		Frame frame = new Frame();
		
	}
	
	
	static class Frame extends JFrame{
		public Frame() {
			JButton enterBtn = new JButton("Enter");
			enterBtn.setBounds(200, 100, 100, 50);
			add(enterBtn);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(null);
			setBounds(200, 100, 700, 500);
			setVisible(true);
		}
	}
}
