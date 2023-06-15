package pack02;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 재정의
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}

}
