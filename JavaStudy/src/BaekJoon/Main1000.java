package BaekJoon;

import java.util.Scanner;

public class Main1000 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		String B = sc.next();
		char c = ' ';
		
		System.out.println(A * (B.charAt(2)-'0'));
		System.out.println(A * (B.charAt(1)-'0'));
		System.out.println(A * (B.charAt(0)-'0'));
		System.out.println(A * Integer.parseInt(B));
	}
}