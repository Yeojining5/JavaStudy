package stream.others;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample3 {
	
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByteNo; // read() 메소드가 읽은 바이트 수를 저장할 변수
		byte[] readBytes = new byte[8]; // 읽은 데이터를 저장할 길이 3짜리 바이트배열
		
		// 2는 시작인덱스. 2번지 부터 3개만 읽어서 readBytes에 데이터를 저장!
		readByteNo = is.read(readBytes, 2, 3);
		for(int i=0; i<readBytes.length; i++) {
			System.out.println(readBytes[i]);
		}
	}
}

 

