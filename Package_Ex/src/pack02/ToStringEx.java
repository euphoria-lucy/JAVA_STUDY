package pack02;

public class ToStringEx {

	public static void main(String[] args) {

		Point p = new Point(2, 9);
		System.out.println(p.toString());
		System.out.println(p); // .toString()이 생략됨
		System.out.println(p + "임");
		
	}

}
