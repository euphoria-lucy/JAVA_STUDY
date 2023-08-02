package gui01;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {
	
	public BorderLayoutEx() {
		setTitle("BorderLayout Sample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); // 컨테이너 생성
		
		c.setLayout(new BorderLayout(30, 20)); 
		// 30 컨테이너 위에 있는 Object들의 수평간격
		// 40 컨테이너 위에 있는 Object들의 수직간격
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("mul"), BorderLayout.EAST);
		c.add(new JButton("div"), BorderLayout.WEST);
		c.add(new JButton("Calculate"), BorderLayout.CENTER);
		
		setSize(300, 200);
		setVisible(true);
		
	}

	public static void main(String[] args) {

		new BorderLayoutEx();
		
	}

}
