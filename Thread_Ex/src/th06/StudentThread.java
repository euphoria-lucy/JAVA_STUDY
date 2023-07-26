package th06;

public class StudentThread extends Thread {

	private SharedBoard board;
	
	public StudentThread(String name, SharedBoard board) {
		super(name); // 스레드의 이름 생성
		this.board = board;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			board.add();
			try {
				sleep(200); // 0.2초 지연
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
