package pack06;

public class StringEx {

	public static void main(String[] args) {

		String a = new String(" LSJ");
		String b = new String("♥PSH ");
		
		System.out.println(a + " 의 길이 : " + a.length());
		System.out.println(a.contains("★")); // a문자열에 "★"문자가 있으면 true를 반환, "★"문자가 없으면 false 반환
		
		a = a.concat(b); // a와 b가 결합된 새로운 문자열 생성
		// 원래 a : " LSJ"를 가리키는 객체변수인데 새로운 문자열 " LSJ♥PSH"을 가리킴
		System.out.println(a);
		
		a = a.trim(); // 양쪽(맨앞 또는 맨뒤) 공백 제거
		System.out.println(a);
		
		a = a.replace("LSJ", "VB");
		System.out.println(a);
		
		String s[] = a.split(", "); // a문자열을 분리하는데 기준이 ', '임
		for (int i = 0; i < s.length; i++) {
			System.out.println("분리된 문자열 " + i + " : " + s[i]);
		}
		
		a = a.substring(3); // 인텍스는 0부터 시작하는데 …
		System.out.println(a); // 3번째부터 끝까지 문자열을 반환한다.
		
		char c = a.charAt(2); // 인덱스 2번째 문자값을 반환함
		System.out.println(c);
		
	}

}
