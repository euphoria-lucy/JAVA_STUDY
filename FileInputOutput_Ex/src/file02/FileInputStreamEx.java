package file02;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {

		byte b[] = new byte [6]; // 비어있는 byte배열
		
		try {
			FileInputStream fin = new FileInputStream("C://Temp//test.out"); // fin은 입력 파일 객체변수로 "test.out"파일을 가리킴
			int n = 0, c;
			
			while((c = fin.read()) != -1) { // fin이 가리키는 "test.out"파일에 있는 내용을 읽어서 저장
				b[n] = (byte)c; // byte로 형변환하여서 배열 b에 저장
				n++; // 인덱스 증가
			}
			
			System.out.println("C://Temp//test.out에서 읽은 배열을 출력합니다.");
			
			for (int i = 0; i < b.length; i++) {
				System.out.print(b[i] + " ");
			}
			
			System.out.println( );
			
			fin.close();
			
		} catch (IOException e) {
			
			System.out.println("C://Temp//test.out에서 읽지 못했습니다. 경로명을 체크해보세요");
			
		}
		
	}

}
