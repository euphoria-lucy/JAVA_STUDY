package th03;

public class ThreadMainEx {

	public static void main(String[] args) {

		long id = Thread.currentThread().getId(); // 현재 실행되고 있는 스레드(main)의 id
		String name = Thread.currentThread().getName(); // 현재 실행되고 있는 스레드(main)의 이름
		int prority = Thread.currentThread().getPriority(); // 현재 실행되고 있는 스레드(main)의 우선순위 기본값은 5로 설정
		Thread.State s = Thread.currentThread().getState(); // 현재 실행되고 있는 스레드(main)의 상태
		
		System.out.println("현재 스레드 이름 : " + name);
		System.out.println("현재 스레드 id : " + id);
		System.out.println("현재 스레드 우선순위 : " + prority);
		System.out.println("현재 스레드 상태 : " + s);
		
	}

}
