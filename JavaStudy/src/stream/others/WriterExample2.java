package stream.others;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample2 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test.txt");
		char[] data = "강감찬".toCharArray(); // "홍길동" 문자열로부터 char 배열 얻어내기
		
		// char배열에 있는 모든 데이터를 출력함
		writer.write(data);
		
		writer.flush(); // 버퍼 비우기
		writer.close(); // 닫아주기
	}
}
