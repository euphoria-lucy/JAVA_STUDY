package pack03;

public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object obj) {
		// Object obj = b와 같은 표현
		Point p = (Point)obj; // 다운캐스팅
		if (this.x == p.x && y == p.y) {
			return true;
		} else {
			return false;
		}
	}
	
}
