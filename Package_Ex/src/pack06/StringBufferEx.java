package pack06;

public class StringBufferEx {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("THIS");
		
		sb.append(" IS DREAM"); // sb문자열에서 " IS DREAM" 추가
		// "THIS" + " is DREAM"
		System.out.println(sb); // 출력 : THIS IS DREAM
		
		sb.insert(7, " NCT"); // sb문자열의 7번째 인덱스 위치에 " NCT"를 삽입하고 원래 그자리에 있던 문자열은 뒤로 이동함
		System.out.println(sb); // 출력 : THIS IS NCT DREAM
		
		sb.replace(8, 11, "MY"); // 인덱스 8번째 문자부터 시작하여 11 - 1번째 문자까지를 교체
		System.out.println(sb); // 출력 : THIS IS MY DREAM
		
		sb.delete(8, 11); // 인덱스 8번째부터 시작하여 11 - 1번째 까지 삭제
		System.out.println(sb); // 출력 : THIS IS DREAM
		
		sb.setLength(4); // sb의 길이는 13인데, 4로 변경하면 앞의 4개 문자열만 남겨두고 뒤의 모든 문자열은 삭제됨
		System.out.println(sb); // 출력 : THIS
		
	}

}
