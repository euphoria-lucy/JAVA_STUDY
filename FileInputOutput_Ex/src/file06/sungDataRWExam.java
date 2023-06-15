package file06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class sungDataRWExam {
	int length;
	String[] name = new String[10];
	String[] address = new String[10];
	double[] math = new double[10];
	double[] english = new double[10];
	double[] total = new double[10];
	double[] avg = new double[10];

	public void writingData(String fname) throws IOException {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(fname); // fw = writing.txt를 가리킴
			bw = new BufferedWriter(fw); // bw는 출력버퍼를 사용해서 writing.txt에 출력
			for (int j = 0; j < length; j++) {
				bw.write(name[j] + "\t" + address[j] + "\t" + math[j] + "\t" + english[j] + "\t" + total[j] + "\t"
						+ avg[j]); // 데이터를 bw가 가리키는 파일에 출력
				bw.newLine(); // 줄바꿈
			}
			bw.close();
			fw.close();
		} catch (FileNotFoundException e) {
			System.out.println("잘못된 파일 이름을 입력했습니다");
		}
	}

	public void readingData(String fname) throws IOException {
		try {
			String csvStr = "";
			String tmpStr = "";
			FileReader fr = new FileReader(fname);
			BufferedReader br = new BufferedReader(fr);
			do {
				tmpStr = br.readLine();
				if (tmpStr != null) {
					csvStr += tmpStr + "\t";
					// System.out.println(csvStr);
				}
			} while (tmpStr != null);
			StringTokenizer parse = new StringTokenizer(csvStr, "\t");
			length = parse.countTokens() / 4;
			for (int i = 0; i < length; i++) {
				name[i] = parse.nextToken();
				address[i] = parse.nextToken();
				math[i] = Double.valueOf(parse.nextToken()).doubleValue();
				english[i] = Double.valueOf(parse.nextToken()).doubleValue();
				total[i] = math[i] + english[i];
				avg[i] = total[i] / 2.0;
			}
			System.out.println("연산이 잘 이루어졌습니다.");
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("잘못된 파일 이름을 입력했습니다");
		}
	}
}
