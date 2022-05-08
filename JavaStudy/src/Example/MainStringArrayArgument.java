package Example;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		// 매개값을 주지 않았기 때문에 길이가 0인 String 배열이 매개값으로 전달된다 > length는 0
		if(args.length != 2) { // 입력된 데이터 개수가 두 개가 아닐 경우
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0); // 프로그램 강제 종료
		}
		
		String strNum1 = args[0]; // 첫 번째 데이터 얻기
		String strNum2 = args[1]; // 두 번째 데이터 얻기
		
		int num1 = Integer.parseInt(strNum1); // 문자열을 정수로 변환
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + "+num2+" = " + result);
		
	}
// [Run - Run Configuraions...] 를 통해 매개값을 주면 if문은 실행되지 않고 아래 출력문이 실행됨
}
