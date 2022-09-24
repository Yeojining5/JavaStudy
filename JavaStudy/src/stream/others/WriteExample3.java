package stream.others;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {
	
	public static void main(String[] args) throws Exception {
	// 파일로부터 OutputStream 얻어내기
	OutputStream os = new FileOutputStream("C:/Temp/test.txt");
	byte[] data = "ABCCCC".getBytes(); // "ABC"로부터 바이트 배열 얻기
	os.write(data, 1, 2); // 시작인덱스 1, 출력 개수 2  -> "BC"만 출력
	os.flush();
	os.close();
	
	}
}
