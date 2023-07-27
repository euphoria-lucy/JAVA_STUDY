package gui01;

import java.awt.Container;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	public MyFrame() {
		setTitle("300 * 300 스윙프레임 만들기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}

}
