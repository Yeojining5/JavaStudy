package stream.inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		
		System.out.println("알파벳 하나를 쓰고 엔터를 누르세요");
		int i =0; // 초기화
		try {
			i = System.in.read(); // try-catch 에러처리 필요
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("i : "+i);
		System.out.println("(char)i : "+(char)i);
	}

}