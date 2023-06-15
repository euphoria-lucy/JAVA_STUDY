package pack04;

public class EqualsEx {

	public static void main(String[] args) {

		Rect a = new Rect(2,9);
		Rect b = new Rect(9,2);
		Rect c = new Rect(2,5);
		
		if(a.equals(b))
			System.out.println("a is equal to b");
		if(a.equals(c))
			System.out.println("a is equal to c");
		if(b.equals(c))
			System.out.println("b is equal to c");
	}

}
