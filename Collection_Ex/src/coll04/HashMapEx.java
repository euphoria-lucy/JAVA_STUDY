package coll04;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {

	public static void main(String[] args) {

		// HashMap 객체생성하는데 key의 데이터 타입은 String, value의 데이터 타입은 String인 dic 객체 생성
		HashMap<String, String> dic = new HashMap<String, String>();
		
		// (key, valsu)를 dic 객체에 저장
		dic.put("volleyball", "배구");
		dic.put("baseball", "야구");
		dic.put("NCTDREAM", "엔시티드림");
		
		// 키보드로부터 입력 받기 위함
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("찾고 싶은 단어 → ");
			String eng = sc.next(); // 키보드로부터 문자열을 입력 받음
			// if (eng == "exit") → 문자열의 주소값을 비교
			if (eng.equals("exit")) { // → eng의 문쟈열 값과 "exit"의 문자열을 비교 → 같으면 true 반환
				System.out.println("종료합니다...");
				break; // while 반복문을 빠져나감
			}
			
			String kor = dic.get(eng);
			if (kor == null) {
				System.out.println(eng + "는 없는 단어");
			} else {
				System.out.println(kor);
			}
		}
		
		sc.close();
	}

}
