package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// StringTokenizer 클래스는 문자열을 우리가 지정한 구분자로 문자열을 쪼개주는 클래스입니다. 
// 그렇게 쪼개어진 문자열을 우리는 토큰(token)이라고 부릅니다.
import java.util.StringTokenizer;


public class Main3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		// new StringTokenizer(문자열, 구분자) > 구분자를 기준으로 문자열을 분리
		StringTokenizer st = new StringTokenizer(str," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		System.out.println(A);
		System.out.println(B);
		System.out.println((A>B) ? ">" : ((A<B) ? "<" : "==" ));
	}
}
