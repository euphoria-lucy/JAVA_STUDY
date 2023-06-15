package pack05;

public class WrapperEx {

	public static void main(String[] args) {

		System.out.println(Character.toLowerCase('A')); // 소문자 출력
		char c1 = '7', c2 = 'M';
		
		if(Character.isDigit(c1)) // c1의 내용이 숫자인가 확인
			System.out.println(c1 + " : 숫자");
		if(Character.isAlphabetic(c2)) // c2의 내용이 문자인가 확인
			System.out.println(c2 + " : 영문자");
		
		System.out.println(Integer.parseInt("-111")); // parseInt() 메소드 안에는 숫자 형태의 문자열이 존재하고 정수값으로 변환함
		System.out.println(Integer.toHexString(29)); // 16진수 문자열로 출력
		System.out.println(Integer.toBinaryString(29)); // 2진수 문자열로 출력
		System.out.println(Integer.bitCount(29)); // 29를 2진수로 바꿔 1의 갯수 출력
		
		Double d = Double.valueOf(3.3); // 기본형 데이터 3.3을 객체 타입으로 변환 후 d에 저장
		System.out.println(d.toString()); // d의 값을 문자열로 출력
		System.out.println(Double.parseDouble("3.3")); // parseInt() 메소드 안에는 실수(숫자) 형태의 문자열이 존재하고 실수값으로 변환함
		
		boolean b = (9 > 2);
		System.out.println(Boolean.toString(b)); // true를 문자열로 출력
		System.out.println(Boolean.parseBoolean("false")); // 문자열 "false"를 false로 출력
	}

}
