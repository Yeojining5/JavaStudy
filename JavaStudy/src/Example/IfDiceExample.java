package Example;

public class IfDiceExample {

	public static void main(String[] args) {
		//Math.random() 메소드 - 0.0과 1.0 사이에 속하는 double 타입의 난수 하나를 리턴 (<1.0 이므로 1은 속하지X)
		// 주사위의 번호를 뽑는 예제
		// *6 > 1~6정수   +1 > 마지막 자리 정수는 속하지 않기 때문에 +1을 해줌
		int num = (int) (Math.random() * 6) + 1;

		if (num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("번이 나왔습니다.");
		}

	}

}
