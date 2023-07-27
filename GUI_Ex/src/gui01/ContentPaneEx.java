package gui01;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {
	
	public ContentPaneEx( ) {
		setTitle("ContentPane과 JFrame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane(); // 컨테이너 생성
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setLayout(new FlowLayout()); // contentPane Container에 올라오는 Object를 나열하는 방식. Object가 생성되는 순서대로 배치됨
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore")); // contentPane Container 위에 버튼 추가
		
		setSize(300, 150);
		setVisible(true);
		
	}

	public static void main(String[] args) {

		new ContentPaneEx();
		
	}

}
