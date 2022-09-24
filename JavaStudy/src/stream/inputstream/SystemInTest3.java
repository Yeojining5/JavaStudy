package stream.inputstream;

import java.io.IOException;

public class SystemInTest3 {

	public static void main(String[] args) throws IOException {
		
		for(int i=0; i<10; i++) { // 반복문 시행횟수 : 10번
			int num = System.in.read();
				System.out.print(num+" / ");
		}
	}
}