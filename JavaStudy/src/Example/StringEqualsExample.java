package Example;

public class StringEqualsExample {

	public static void main(String[] args) {
		// 원시형 타입은 ==연산자를 사용하지만 
		// 참조 타입인 String 변수 비교 시 ==연산자를 사용하면 결과가 상이하다
		// 자바는 문자열 리터럴이 "신민철"과 같이 동일하다면 동일한 String 객체를 참조함
		String strVar1 = "신민철"; // 1,2는 동일한 String 객체의 번지값을 가짐
		String strVar2 = "신민철";
		//but 3은 새로운 String 객체의 번지값을 가짐 (객체 생성 연산자 new의 영향)
		String strVar3 = new String("신민철");
		
		System.out.println( strVar1 == strVar2 );
		System.out.println( strVar1 == strVar3 ); // 번지값이 다르기 때문에 false출력
		System.out.println();
		// String 객체의 문자열만을 비교하고 싶다면 equals() 메소드를 사용해야 함!
		System.out.println( strVar1.equals(strVar2) );
		System.out.println( strVar1.equals(strVar3) );

	}

}
