package coll03;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {
	
	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		int sum = 0;
		
		v.add(2); // 인덱스 0번째 2이 삽입
		v.add(11); // 인덱스 1번째 11이 삽입
		v.add(9); // 인덱스 2번째 9가 삽입
		
		v.add(2, 100); // 인텍스 2번째 100이 삽입되고, 원래 2번째 이후의 모든 데이터는 자동으로 뒤로 이동함
		
		// Iterator it 객체변수 : v 객체변수의 iterator() 메소드에 의해서 객체가 생성된 것임
		// it : v 객체 데이터의 첫번째 요소를 가리키게 됨
		Iterator<Integer> it = v.iterator();
		while (it.hasNext()) { 
			// 첫번째 요소에 데이터가 존재하면 true값을 반환함
			// 두번째 요소에 데이터가 존재하면 true값을 반환함
			// .....
			// it이 가리키는 위치에 데이터가 없으면 false 값을 반환함

			int n = it.next(); // 첫번째 데이터를 n에게 넘겨준 후에 v 객체 데이터에 있는 그 다음 요소를 가리키게 됨
			sum += n;
			System.out.print(n + " ");
		}
		
		System.out.println("\nVector에 있는 정수의 합 : " + sum);
		
	}

}
