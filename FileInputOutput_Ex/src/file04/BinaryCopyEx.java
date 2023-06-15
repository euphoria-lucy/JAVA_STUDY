package file04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopyEx {

	public static void main(String[] args) {

		File src = new File("./src/file03/forest.jpg"); // src 파일 객체를 생성하면 파일에 대한 정보를 얻을 수 있음
		File dest = new File("./src/file03/copy_forest.jpg");
		int c;
		
		try {
			FileInputStream fi = new FileInputStream(src); // fi 입력객체는 src 객체의 파일 (forest.jpg)를 가리킴
			FileOutputStream fo = new FileOutputStream(dest); // fo 출력객체는 dest 객체의 파일 (copy_forest.jpg)를 가리킴
			
			while ((c = fi.read()) != -1) { // fi가 가리키는 파일에서 1바이트씩 읽어서 
				fo.write((byte)c); // fo가 가리키는 파일 (copy_forest.jpg)에 출력함
			}
			
			fi.close();
			fo.close();
			
			System.out.println(src.getPath() + "를 " + dest.getPath() + " 로 복사하였습니다");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
		
	}

}
