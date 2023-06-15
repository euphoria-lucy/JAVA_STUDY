package file03;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedOutputStream;

public class BurfferedIOex {

	public static void main(String[] args) {

		FileReader fin = null;
		int c;
		
		try {
			fin = new FileReader("C://Temp//test2.txt"); // fin은 파일을 읽어오는 객체변수로 "test2.txt" 파일을 가리킴
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5); // 모니터로 출력하는데 버퍼에 크기가 5byte로 설정. 
			// 5를 설정하지 않으면 기본적으로 8192byte로 되어있음
			
			while ((c = fin.read()) != -1) {
				out.write(c); // Buffer에 출력하는 5byte가 되면 자동으로 화면에 출력
			}
			new Scanner(System.in).nextLine(); // 임의의 객체가 생성됨(이름이 없는 임의의 객체)
			out.flush(); // Buffer에 남아있는 데이터를 강제적으로 출력 (남은부분 강제 출력)
			fin.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
