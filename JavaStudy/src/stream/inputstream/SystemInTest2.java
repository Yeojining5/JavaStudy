package stream.inputstream;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		
		System.out.println("알파벳을 여러개를 쓰고 엔터를 누르세요");
		int i =0; // 초기화
		try {
			
//			while((i = System.in.read()) != -1) { // 이거 사용해도 같은 결과
			// 반환값이 뉴라인이 아닌동안
			while((i = System.in.read()) !='\n') {

				System.out.println("i : "+i);
				System.out.println("(char)i : "+(char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}