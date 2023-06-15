package coll04;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {
	
	static void printList(LinkedList<String> l) { // l = myList
		Iterator<String> iterator = l.iterator(); // 순차적으로 접근하기 위함
		while (iterator.hasNext()) { // iterator가 가리키는 곳에 데이터가 존재하면 true
			String e = iterator.next(); // iterator가 가리키는 곳의 데이터를 e에게 넘겨줌
			// 데이터를 넘겨준 후에 그 다음 데이터를 가리킴
			String separator;
			if (iterator.hasNext())
				separator = " → ";
			else
				separator = "\n"; // 줄바꿈
			System.out.print(e + separator);
		}
	}

	public static void main(String[] args) {

		LinkedList<String> myList = new LinkedList<String>();
		myList.add("말랑콩떡 김정민");
		myList.add("랜더스 김정민");
		myList.add("아기짐승 김정민");
		printList(myList); // 출력결과 : 말랑콩떡 김정민 → 랜더스 김정민 → 아기짐승 김정민
		
		myList.add(0, "말랑콩떡"); // 출력결과 : 말랑콩떡 → 말랑콩떡 김정민 → 아기짐승 → 랜더스 김정민 → 아기짐승 김정민
		myList.add(2, "아기짐승"); // 출력결과 : 말랑콩떡 → 말랑콩떡 김정민 → 아기짐승 → 랜더스 김정민 → 아기짐승 김정민
		printList(myList);
		
		Collections.sort(myList); // 오름차순 (ascending sort)
		printList(myList);
		
		Collections.reverse(myList); // myList에 들어있는 데이터를 역순으로 변경 → 출력
		printList(myList);
		
		int index = Collections.binarySearch(myList, "말랑콩떡") + 1;
		System.out.println("말랑콩떡은 " + index + "번째 요소 입니다");
		
	}

}
