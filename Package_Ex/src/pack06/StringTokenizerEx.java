package pack06;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("임성진/배구/한국전력/성균관대/제천","/");
		// 구분자는 "/"로 설정했고 토큰들은 "임성진", "배구", "한국전력", "성균관대", "제천"
		// st는 첫번째 토큰을 가리킴
		
		while(st.hasMoreTokens()) // st가 가리키는 곳에 토큰이 존재하면 true를 반환, 토큰이 없으면 false를 반환함
			// st.nextToken()은 st가 가리키는 곳의 토큰을 출력한 후에 st는 다음 토큰을 가리키게 됨
			System.out.println(st.nextToken());
		
	}

}
