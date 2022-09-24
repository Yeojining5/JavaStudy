package stream.others;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample1 {
	
	public static void main(String[] args) throws Exception {
		// FileInputStream을 이용하여 객체생성 후 파일로부터 데이터를 읽어보기
		// 문자 파일도 InputStream으로 읽을 수 있다 
		// -> 문자도 바이트화 하여 저장할 수 있기 때문
		// C드라이브 내의 Temp폴더에 text.txt 파일 생성 후 abcde 입력해둠(=5byte)
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByte; // 읽은 바이트를 저장할 변수 선언
		// while문을 통해 파일의 크기인 5byte, 즉 5번을 돌게됨
		while((readByte=is.read()) != -1) {
			System.out.print((char)readByte); // 97 98 99 100 101 -> 아스키코드값 출력
		}
		
	}
}

// txt파일로부터 1byte씩 읽기 위해 read()메소드 사용
// 읽은 메소드를 readByte에 저장
// 데이터는 abcde 총 5byte가 입력된 파일이므로
// 5byte를 다 읽고 나서 6byte를 읽을 때 더이상 읽을 것이 없으므로
// read()는 -1을 반환 -> while문 조건을 만족하지 않으므로 빠져나옴