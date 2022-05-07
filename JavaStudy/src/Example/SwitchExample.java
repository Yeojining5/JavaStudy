package Example;

public class SwitchExample {
// switch문은 변수의 값에 따라서 실행문이 결정된다.
// break가 없는 경우 연달아서(순서대로) 출력된다
	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1;
		
		switch (num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default: 
			System.out.println("6번이 나왔습니다.");
			break;
		}

	}

}
