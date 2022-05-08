package Example;

public class Exercise03 {
// for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드 작성
	public static void main(String[] args) {
		int i;
		int sum = 0;
		for(i=1; i<101; i++) {
			if(i%3==0) {
				sum += i;
			}
			// for문 안에서 출력문장 호출하면 과정이 쭉~ 출력됨
		}
		System.out.println("3의 배수의 합 : "+sum);
	}

}
