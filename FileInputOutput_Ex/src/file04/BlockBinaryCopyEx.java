package file04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BlockBinaryCopyEx {

	public static void main(String[] args) {

		File src = new File("./src/file03/forest.jpg");
		File dest = new File("./src/file03/blockcopy_forest.jpg");
		
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte[] buf = new byte[1024 * 10]; // 1024는 1KB * 10 → 10KB용량 (버퍼)
			
			while (true) {
				int n = fi.read(buf); // fi가 가리키는 파일에서 데이터를 읽어서 10KB가 buf라는 배열의 임시기억공간에 저장하고, 그 길이 숫자값을 n에 저장
				fo.write(buf, 0, n); // buf 임시공간에 저장되어 있는 데이터에서 0번째부터 시작하여 n갯수만큼을 fo가 가리키는 파일(blockcopy_forest.jpg)에 출력
				System.out.println("n : " + n + ", buf.length : " + buf.length); 
				if (n < buf.length)
					 break;
			}
			
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를 " + dest.getPath() + " 로 복사하였습니다");
			
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
		
	}

}
