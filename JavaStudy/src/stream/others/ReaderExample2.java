package stream.others;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample2 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test.txt");
		int readCharNo; // Reader가 읽은 문자수를 저장할 변수
		char[] cbuf = new char[2]; // read()가 읽은 데이터를 저장할 배열 - 길이 2짜리
		String data = ""; // 전체 문자열을 저장할 변수
		
		// read 메소드는 읽은 문자수를 readCharNo에 저장하고,
		// 실제로 읽은 문자 데이터는 배열 cbuf에 저장 
		while( (readCharNo = reader.read(cbuf)) != -1 ) {
			// 인덱스0부터 읽은문자 수만큼 문자열로 만들어서 data에 저장
			data += new String(cbuf, 0, readCharNo);
		}
		System.out.println(data);
		
		reader.close();
	}
}


