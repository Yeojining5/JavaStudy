package stream.others;

import java.io.FileOutputStream;
import java.io.OutputStream;

// write(int b) 메소드
public class WriteExample1 {
	
	public static void main(String[] args) throws Exception {
	// 파일로부터 OutputStream 얻어내기
	OutputStream os = new FileOutputStream("C:/Temp/test.txt");
	// "ABC"라는 문자열을 출력해보기 - getBytes()로 바이트 배열을 얻을 수 있음
	byte[] data = "ABC".getBytes();
	// for문으로 한 바이트씩 출력해보기 - 바이트 수만큼 for문이 돌아감
	for(int i=0; i<data.length;i++) {
		os.write(data[i]);
		}
	// 출력스트림에서 write()를 하게되면 잠시 버퍼에 머물다가 출력되는데,
	// 버퍼가 꽉차야 버퍼에 있는 내용이 출력됨. 꽉차지 않으면 출력X
	// 따라서 강제적으로 출력을 위해 flush() 메소드를 사용하여 버퍼를 비워줄것!
	// -> 데이터가 버퍼에서 완전하게 전송되어 파일에 저장될 수 있음
	
	os.flush(); // 버퍼 비우기
	os.close(); // 스트림 닫기
	
	}
}
