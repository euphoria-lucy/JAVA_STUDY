/* C://Temp//test.txt 파일을 이용해서 testout.txt로 복사하는 프로그램을 작성하기오
 * FileReader 클래스와 FileWrite클래스를 사용해서 작성하시오 */

package file02;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyEx {

	public static void main(String[] args) {

		File src = new File("C://Temp//test.txt");
		File dest = new File("C://Temp//testout.txt");
//		String src = "C://Temp//test.txt";
//		String dest = "C://Temp/testout.txt";
		int c;
		
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			
			while((c = fr.read()) != -1) {
				fw.write((char)c);
			}
			
			fr.close();
			fw.close();
			System.out.println("복사 성공");
			System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사");
		} catch (IOException e) {
			System.out.println("입출력오류");
		}
		
	}

}
