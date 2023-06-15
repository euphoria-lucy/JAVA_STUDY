package file02;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {

		byte b[] = {3, 4, 65, -3, 19, 2};
		
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Temp//test.out"); // fout 출력파일 객체변수는 "test.out"파일을 가리킴
			
			for (int i = 0; i < b.length; i++) {
				fout.write(b[i]); // 파일(test.out)에 b[i]의 값을 바이너리(2진수)값으로 기록. 텍스트형식이 아님
			}
			
			fout.close();
			
		} catch (IOException e) {
			
			System.out.println("C//Temp//test.out에 저장할 수 없었습니다. 경로명을 확인해 주세요");
			
			return;
		}
		
		System.out.println("C://Temp//test.out을 저장하였습니다."); // test.out 파일을 메모장에서 불러오면 데이터가 깨진 것처럼 보임
		
	}

}
