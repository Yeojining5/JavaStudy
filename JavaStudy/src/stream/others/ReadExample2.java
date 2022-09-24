package stream.others;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample2 {
	
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByteNo; // read() 메소드가 읽은 바이트 수를 저장할 변수
		byte[] readBytes = new byte[3]; // 읽은 데이터를 저장할 길이 3짜리 바이트배열
		while((readByteNo = is.read(readBytes)) != -1) {
			System.out.println(readByteNo);
		}
	}
}

/*
 * ****** 첫 번째 읽을 때 *****
 *  ex) 주어진 파일은 5byte, 배열의 길이는 3인 경우
 * read(byte[] b) 메소드는 파일의 데이터를 읽어서 byte[] 배열에 저장함
 * 길이가 3이므로 3byte를 읽어서 저장 - b(0), b(1), b(2) 인덱스에 차례대로 저장
 * 실제 데이터는 이 byte 배열에 저장이 되는 것임!
 * read()는 3byte를 읽었으므로 읽은 바이트 수인 3을 리턴함 
 * ********************************
 * 
 * ****** 두 번째 읽을 때 *****
 * 파일의 남은 2byte의 데이터를 각각 배열의 0번지와 1번지에 저장함
 * 나머지 2번지에는 저장할 데이터가 남아있지 않음 
 * but 첫 번째에 읽어서 저장했던 데이터가 그대로 남아있음
 * read()는 2byte를 읽었으므로 읽은 바이트 수인 2을 리턴함 
 * *****************************
 */

