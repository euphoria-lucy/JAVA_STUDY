package coll02;

import java.util.Vector;

public class PointVectorEx {

	public static void main(String[] args) {

		Vector<Point> v = new Vector<Point>();
		
		v.add(new Point(2, 9)); // 데이터가 삽입이 되는데 생성자 메소드에 의해서 x, y값이 저장됨
		v.add(new Point(-7, 11));
		v.add(new Point(14, 2));
		
		for (int i = 0; i < v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p); // p.toString()메소드가 호출
//			System.out.println(p.toString()); // toString()메소드가 호출
		}
		
	}

}
