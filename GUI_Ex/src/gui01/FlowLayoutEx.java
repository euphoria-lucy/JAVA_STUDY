package gui01;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame {
	
	public FlowLayoutEx() {
		setTitle("FlowLayout Sample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); // 컨테이너 생성
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40)); 
		// 30 컨테이너 위에 있는 Object들의 수평간격
		// 40 컨테이너 위에 있는 Object들의 수직간격
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		setSize(300, 150);
		setVisible(true);
		
	}

	public static void main(String[] args) {

		new FlowLayout();
		
	}

}
