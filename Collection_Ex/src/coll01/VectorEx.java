package coll01;

import java.util.Vector;

public class VectorEx {
	public static void printVector(Vector<Integer> v) { // Vector<Integer> v = v 
		for (int i = 0; i < v.size(); i++) { // v.size() : 4
			int n = v.get(i);
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		// v : 벡터클래스의 객체변수로 데이터는 정수를 담는 것으로 10개의 기억공간이 만들어짐
		// Vector() 생성자에 의해 10개의 기억공간이 만들어짐
		
		v.add(1); // 인덱스 0번째 1이 삽입
		v.add(11); // 인덱스 1번째 11이 삽입
		v.add(9); // 인덱스 2번째 9가 삽입
		
		v.add(2, 100); // 인텍스 2번째 100이 삽입되고, 원래 2번째 이후의 모든 데이터는 자동으로 뒤로 이동함
		// 0번째 : 1, 1번째 : 11, 2번째 : 100, 3번째 : 9
		
		System.out.println("Vector 요소 객체의 수 → " + v.size()); // 데이터 수 말함. 실제 데이터가 저장되어 있는 데이터 개수
		System.out.println("Vector의 현재 용량 → " + v.capacity()); // 전체용량
		
		printVector(v); // 메소드 호출되는데 파라미터값은 v객체인데 전달되는데 ....... 받는 쪽도 같은 자료형이어야 함
		
//		for (int i = 0; i < v.size(); i++) { // v.size() : 4
//			int n = v.get(i);
//			System.out.println(n + " ");
//		}
		
	}

}
