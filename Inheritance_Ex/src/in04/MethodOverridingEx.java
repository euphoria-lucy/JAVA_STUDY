package in04;

public class MethodOverridingEx {
	public static void main(String[] args) {
		
		Rect r = new Rect();
		Shape s;
		s = r;
		System.out.println(s.a);
		System.out.println(s.b);
		s.draw();
		s.draw2();
		
	}

}
