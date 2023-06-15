package th03;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlickerlingLabelEx extends JFrame{
	
	public FlickerlingLabelEx() {
		setTitle("FlickerlingLabelEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 컨테이너 창을 닫을 때 응용 프로그램이 종료됨
		Container c = getContentPane(); // 컨테이너 객체가 생성
		c.setLayout(new FlowLayout()); // 컨테이너에 배치하는 형식
		
		// 깜빡이는 레이블 생성
		FlickerlingLabel flabel_o = new FlickerlingLabel("깜빡임", 500);
			
		// 깜빡이지 않는 레이블 생성
		JLabel label = new JLabel("깜빡이지 않음");
		
		// 깜빡이는 레이블 생성
		FlickerlingLabel flabel_t = new FlickerlingLabel("여기도 깜빡임", 300);
		
		c.add(flabel_o);
		c.add(label);
		c.add(flabel_t);
		
		setSize(300, 150);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new FlickerlingLabelEx();

	}

}
