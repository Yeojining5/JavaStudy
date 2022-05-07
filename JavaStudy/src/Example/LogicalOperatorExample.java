package Example;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		// if문의 조건식이 ture라면 블록을 실행하고 false라면 실행X
		// if문의 조건식에는 true false 값을 산출할 수 있는 연산식, boolean 변수가 올 수 있다.
		if( (charCode>=65) & (charCode<=90) ) {
			System.out.println("대문자 이군요");
		}
		if( (charCode>=97) && (charCode<=122) ) {
			System.out.println("소문자 이군요");
		}
		if( !(charCode<48) && !(charCode>57) ) {
			System.out.println("0-9 숫자 이군요");
		}
		
		int value = 6;
		
		if( (value%2==0) | (value%3==0) ) {
			System.out.println("2 또는 3의 배수 이군요");
		}
		if( (value%2==0) || (value%3==0) ) {
			System.out.println("2 또는 3의 배수 이군요");
		}
		
		

	}

}
