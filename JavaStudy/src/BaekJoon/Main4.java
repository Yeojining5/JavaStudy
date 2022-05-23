package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		int jumsu = Integer.parseInt(st.nextToken());
		
		if(jumsu >= 90) {
			System.out.println("A");
		} else if(jumsu >= 80) {
			System.out.println("B");
		} else if(jumsu >= 70) {
			System.out.println("C");
		} else if(jumsu >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
