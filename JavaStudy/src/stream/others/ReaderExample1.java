package stream.others;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample1 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test.txt");
		int readData; // reader가 읽은 한 문자를 저장할 변수
		while( (readData=reader.read()) != -1 ) {
			System.out.print((char)readData);
		}
		
		reader.close();
	}
}

/*
 * while을 통해 한 문자씩 읽어오기 -> 더이상 읽을 문자가 없다면 -1을 리턴
 * ex) test.txt 파일에는 "자바" 라는 두 개의 문자만 저장되어 있음 ->  while문은 총 2번을 돌게됨
 * 세 번째 read()를 실행할 때, 더이상 들어올 문자가 없으므로 -1을 리턴 -> while문 빠져나옴
 * 
 * 이렇게 두 개의 문자가 Reader를 통해 들어올 때
 * read() 메소드를 통해 첫문자를 읽어서 int 4byte에서 끝 2byte에 한 개의 문자를 저장
 * 그다음 read() 메소드 실행 후, 두 번째 문자를 읽어서 int 4byte 중에서 끝 2byte에 저장을 하고 리턴!
 * 
 */
