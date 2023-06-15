package pack04;

public class Rect {
	
	private int width;
	private int height;
	
	public Rect(int width, int height) {
		// super(); → 모든 클래스의 아버지 클래스이기 때문
		this.width = width;
		this.height = height;
	}
	
	public boolean equals(Object obj) {
		// Object obj = c와 같음
		Rect r = (Rect)obj;
		if (this.width * this.height == r.width * r.height)
			return true;
		else
			return false;
	}

}
