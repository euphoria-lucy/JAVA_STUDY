package th06;

public class SharedBoard {
	
	private int sum = 0;
	
	synchronized public void add() { // 특정 스레드가 이 메서드를 실행중일때 다른 스레드는 접근 불가. 데이터를 여러 스레드가 공유할 경우에는 반드시 동기화(synchronized) ㅠ필요
		int n = sum;
		Thread.yield(); // 현재 실행중인 스레드의 실행을 양보
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName() + " : " + sum); // Thread.currentThread().getName() 은 현재 실행중인 스레드 이름
	}
	
	public int getSum() {
		return sum;
	}

}
