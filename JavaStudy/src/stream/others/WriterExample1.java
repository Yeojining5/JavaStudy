package stream.others;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample1 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test.txt");
		char[] data = "홍길동".toCharArray(); // "홍길동" 문자열로부터 char 배열 얻어내기
		// for문으로 배열에서 한문자씩 꺼내오기
		for(int i=0; i<data.length; i++) {
			writer.write(data[i]);
		}
		writer.flush(); // 버퍼 비우기
		writer.close(); // 닫아주기
	}
}
