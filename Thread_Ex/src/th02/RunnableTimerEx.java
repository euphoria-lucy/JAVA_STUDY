package th02;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class RunnableTimerEx extends JFrame {
	
	public RunnableTimerEx() {
		setTitle("Runnable을 구현한 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫을때 응용프로그램(자바)이 종료
		Container c = getContentPane(); // 컨테이너 박스를 생성
		c.setLayout(new FlowLayout()); // C 컨테이너에 object를 어떻게 배치할 것인가?
		
		JLabel timerLabel = new JLabel(); // 레이블 생성
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80)); // 글꼴 : 고딕, 폰트 : 이텔릭체, 크기 : 80
		c.add(timerLabel); // C 컨테이너에 timerLabel을 둠
		
		/*
		 * TimerRunnable rnnnable = new TimerRunnable(timerLabel); // TimerThread 클래스의
		 * 객체는 th 
		 * Thread th = new Thread(runnaable);
		 */
		
		Thread th = new Thread(new TimerRunnable(timerLabel)); // 위 주석과 같음
		
		setSize(250, 170); // 컨테이너의 크기 설정
		setVisible(true); // 컨테이너를 화면에 출력(true) ↔ false면 화면에 출력 안됨
		
		th.start(); // TimerThread 클래스에 있는 run() 메소드가 호출됨
	}

	public static void main(String[] args) {
		
		// main() 메소드도 스레드임
		// main() 메소드가 다른 스레드보다 먼저 종료될 수 있음
		new RunnableTimerEx(); // 익명의 객체 생성 후 생성자 호출
		for (int i = 0; i < 100; i++) {
			System.out.println("Thread " + i);
		}
		
	}

}
