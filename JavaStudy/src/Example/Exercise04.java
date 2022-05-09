package Example;

public class Exercise04 {
 
	public static void main(String[] args) {
		
		while(true) { // 무한루프
		int num1 = (int)(Math.random() * 6) + 1;
		
		
		int num2 = (int)(Math.random() * 6) + 1;
		
		System.out.println("("+num1+", " +num2+")"); // 무한출력
		
		if(num1+num2==5) {
			break; // if 조건 만족 시 while문 탈출
		}
	
	}
}
}

