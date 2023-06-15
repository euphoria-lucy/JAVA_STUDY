package coll03;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		
		// 키보드로부터 데이터를 입력받기 위해 객체 생성
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("이름 입력 → ");
			String s = sc.next(); // 키보드로부터 문자열 입력받음
			a.add(s); // a 객체에 데이터 저장
		}
		
		for (int i = 0; i < a.size(); i++) {
			String name = a.get(i); // 0번째부터 시작하여 데이터를 가져와서 name에 저장
			System.out.print(name + " "); 
		}
		
		// 각 요소에 저장되어 있는 데이터들의 길이 값을 가지고 그 길이의 최대값에 해당되는 인덱스를 구하는 알고리즘
		int longestIndex = 0;
		for (int i = 1; i < a.size(); i++) {
			if (a.get(longestIndex).length() < a.get(i).length()) {
				longestIndex = i;
			}
		}
		System.out.println("가장 긴 이름은 : " + a.get(longestIndex));
		
		sc.close();
	}

}
