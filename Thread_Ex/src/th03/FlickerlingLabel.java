package th03;

import java.awt.Color;

import javax.swing.JLabel;

public class FlickerlingLabel extends JLabel implements Runnable {
	
	private long delay;
	
	public FlickerlingLabel(String text, long delay) { // flabel_o 객체 생성시 text = "깜빡임", delay = 500
		super(text); // 지정된 text로 JLabel 인스턴스를 만듬
		this.delay = delay; // 500이 전달
		setOpaque(true); // 배경색을 설정
		Thread th = new Thread(this); // this는 flabel_o 객체 생성시 fabel_o이 됨
		th.start();
	}
	
	@Override
	public void run() {
		int n = 0;
		while(true) {
			if (n == 0)
				setBackground(Color.PINK);
			else 
				setBackground(Color.GRAY);
			if (n == 0) n = 1;
			else n = 0;
			
			try {
				Thread.sleep(delay); // 0.5초씩 지연
			} catch (InterruptedException e) {
				return;
			}
		}
	}

}
