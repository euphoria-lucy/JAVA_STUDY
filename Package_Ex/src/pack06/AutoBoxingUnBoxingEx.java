package pack06;

public class AutoBoxingUnBoxingEx {

	public static void main(String[] args) {

		int n = 9; // 기본 정수형 데이터
		Integer intObject = n; // 자동박싱 (auto boxing) → 기본데이터를 객체타입으로 변환해서 저장
		System.out.println("intObject → " + intObject);
		
		int m = intObject + 2; // 
		System.out.println("m → " + m);
		
	}

}
