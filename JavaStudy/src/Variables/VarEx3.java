package Variables;

public class VarEx3 {

	public static void main(String[] args) {
		final int score = 100;
		
		boolean power = true;
		
		byte b = 127; // -128 ~ 127
		
		int oct = 010; // 8진수, 10진수로 8
		int hex = 0x10; // 16진수, 10진수로 16
		
		long l = 10_000_000_000L;
		
		float f = 3.14f; // f 생략 불가
		double d = 3.14f;  // d,f 생략 가능
		
		char ch = 'A';
		int i = 'A';
		
		String str = "";
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		System.out.println(i); // 문자A의 코드인 65가 출력됨
		System.out.println(str4);  // ABCD123
		System.out.println(""+7+7); // 77
		System.out.println(7+7+""); // 14
	}

}
