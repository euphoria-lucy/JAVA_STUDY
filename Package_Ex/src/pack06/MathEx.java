package pack06;

public class MathEx {

	public static void main(String[] args) {

		System.out.println(Math.PI);
		System.out.println(Math.ceil(1.11)); // 올림값
		System.out.println(Math.floor(3.3)); // 내림값
		System.out.println(Math.sqrt(9)); // 루트(제곱근)
		System.out.println(Math.exp(2)); // E는 자연대수인데 2.718282로 설정
		System.out.println(Math.round(2.5)); // 소수점 이하 첫째 자리에서 반올림
		
		//1 ~ 45 사이의 정수형 임의의 수 (난수) 5개 발생
		System.out.print("♣ 행운의 번호 → ");
		for (int i = 0; i < 5; i++) {
			System.out.print((int)(Math.random() * 45 + 1) + " ");
		}
		System.out.println("♣ ");
		
	}

}
