package file05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class sungDatasExam {
	public void readingData(String fname) throws IOException {
		try {
			FileReader fr = new FileReader(new File(fname)); // fr은 writed.txt 파일을 가리킴
			BufferedReader br = new BufferedReader(fr); // 버퍼 클래스를 이용해서 데이터를 읽음. br은 writed.txt를 가리킴
			String csvStr = "";
			String tmpStr = "";
			do {
				tmpStr = br.readLine(); // writed.txt 파일에서 한줄씩 읽어서 tmpStr에 넘겨줌
				if (tmpStr != null) {
					csvStr += tmpStr + "\t"; // 파일에 있는 데이터를 한줄씩 읽어서 csvStr에 저장하는데 한줄 끝에 '\t'이 저장
					// tmpStr 있는 데이터를 csvStr 저장하는데 한줄 끝에 '\t'이 저장
				}
			} while (tmpStr != null);
			StringTokenizer parse = new StringTokenizer(csvStr, "\t"); // parse는 첫번째 토큰("kim")을 가리킴
			// 토큰의 구분자가 탭('\t')
			// parse는 csvStr의 문자열에서 탭(\t)을 구분자로 하여 새로운 객체 생성
			int length = parse.countTokens() / 4; // parse.countTokens()는 parse가 가리키는 토큰의 전체 갯수(16개)
			String[] name = new String[length]; // 이름
			String[] address = new String[length]; // 주소
			double[] math = new double[length]; // 수학점수
			double[] english = new double[length]; // 영어점수
			double[] total = new double[length]; // 총점
			double[] avg = new double[length]; // 평균
			for (int i = 0; i < length; i++) {
				name[i] = parse.nextToken(); // 첫번째 실행할 때 "kim"을 name[0]에 저장한 후에 parse는 그 다음 토큰을 가리킴
				
				address[i] = parse.nextToken(); // address[0]에 "관악구"저장한 후에 parse는 그 다음 토큰을 가리킴
				
				math[i] = Double.valueOf(parse.nextToken()).doubleValue(); // parse.nextToken()은 "100"데이터를 실수형 객체타입의 데이터로 변환하고
				// .doubleValue()에 의해서 기본형 실수형식으로 변환하여 math[0]에 넘겨주고 parse는 그 다음 토큰을 가리킴
				
				english[i] = Double.valueOf(parse.nextToken()).doubleValue(); // parse.nextToken()은 "100"데이터를 실수형 객체타입의 데이터로 변환하고
				// .doubleValue()에 의해서 기본형 실수형식으로 변환하여 english[0]에 넘겨주고 parse는 그 다음 토큰을 가리킴
				
				total[i] = math[i] + english[i]; // 총점저장
				avg[i] = total[i] / 2.0; // 평균저장
			}
			for (int j = 0; j < length; j++) { // console에 출력
				System.out.println(name[j] + "\t" + address[j] + "\t" + math[j] + "\t" + english[j] 
						+ "\t" + total[j] + "\t" + avg[j]);
			}
		} catch (FileNotFoundException e) {
			System.out.println("잘못된 파일 이름을 입력했습니다");
		}
	}
}
