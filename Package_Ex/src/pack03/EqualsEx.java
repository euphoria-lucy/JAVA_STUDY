package pack03;

public class EqualsEx {

	public static void main(String[] args) {

		Point a = new Point(2, 9); // 각각의 a, b, c 객체 생성
		Point b = new Point(2, 9);
		Point c = new Point(1,11);
		
		if (a == b) // false a와 b가 가리키는 객체의 주소가 다름
			System.out.println("a == b");
		if (a.equals(b)) // true
			System.out.println("a is equal to b");
		if(a.equals(c)) // false
			System.out.println("a is equal to c");
	}

}
