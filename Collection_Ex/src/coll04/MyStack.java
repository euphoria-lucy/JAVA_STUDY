package coll04;

public class MyStack {

	public static void main(String[] args) {

		GStack<String> stringStack = new GStack<String>();
		// stringStack는 GStack 객체 생성, 생성자가 호출
		stringStack.push("말랑콩떡 김정민");
		stringStack.push("아기짐승 김정민");
		stringStack.push("랜더스 김정민");
		
		for (int n = 0; n < 3; n++)
			System.out.println(stringStack.pop());
		
		GStack<Integer> intStack = new GStack<Integer>();
		intStack.push(3);
		intStack.push(7);
		intStack.push(65);
		
		for (int n = 0; n < 3; n++) {
			System.out.println(intStack.pop());
		}
		
	}

}
