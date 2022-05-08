package Example;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------");
			System.out.println("선택> ");
			
			int menuNum = scanner.nextInt(); // 변수명.next(); 문자열을 입력받는 scanner 메소드
			
			switch(menuNum) {
				case 1:
					System.out.print("예금액>");
					balance += scanner.nextInt(); // 입력값을 balance 변수에 저장
					break;
				case 2:
					System.out.print("출금액>");
					balance -= scanner.nextInt(); // 입력값을 balance 변수에 빼서!! 저장
					break;
				case 3:
					System.out.print("잔고>");
					System.out.println(balance);
					break;
				case 4:
					run = false;
					break; // 안넣어도 상관은 없지만 넣기
				
			}
			System.out.println(); // 가독성을 위한 개행문
		}
		
		System.out.println("프로그램 종료");

	}

}
