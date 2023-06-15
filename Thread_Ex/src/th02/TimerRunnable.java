package th02;

import javax.swing.JLabel;

public class TimerRunnable implements Runnable {
	
	private JLabel timerLabel;

	public TimerRunnable(JLabel timerLabel) { // JLabel timerLabel = timerLabel
		this.timerLabel = timerLabel;
	}
	
	@Override
	public void run() {
		int n = 0;
		while(true) { // 무한반복
			timerLabel.setText(Integer.toString(n)); // n값을 문자열로 timerLabel에 출력
			n++;
			try {
				Thread.sleep(1000); // 1000 : 1초를 의미. sleep : "1초씩 지연시켜라"라는 의미
				// ★ sleep()메소드를 사용할 경우 try ~ catch를 반드시 사용해야함!!
			} catch (InterruptedException e) {
				return;
			}
		}
	}

}
