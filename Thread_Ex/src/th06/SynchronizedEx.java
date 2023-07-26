package th06;

public class SynchronizedEx {

	public static void main(String[] args) {

		SharedBoard board = new SharedBoard(); // board는 SharedBoard 클래스를 가리키는 객체 (데이터)
		Thread th_one = new StudentThread("jungmin", board);
		Thread th_two = new StudentThread("minjun", board);
		
		th_one.start(); // th_one의 스레드 이름은 "jungmin"
		th_two.start(); // th_two의 스레드 이름은 "minjun"
		
	}

}
