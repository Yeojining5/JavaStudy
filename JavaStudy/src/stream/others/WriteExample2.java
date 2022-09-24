package stream.others;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {
	
	public static void main(String[] args) throws Exception {
	// 파일로부터 OutputStream 얻어내기
	OutputStream os = new FileOutputStream("C:/Temp/test.txt");
	byte[] data = "ABCC".getBytes();
	// 바이트 배열을 매개변수로 받아서 모든 데이터를 한번에 출력 가능! 
	// for문이 따로 필요 없음! -> 좀더 효율적임
	os.write(data); 
	os.flush();
	os.close();
	
	}
}