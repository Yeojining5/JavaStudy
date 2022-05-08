package Example;

public class ForSumFrom1To100Example {
// 1부터 100까지 합을 출력

	public static void main(String[] args) {
		int sum = 0;
		
		int i = 0; // 카운터 변수 - for문 전에 선언되어 for문을 벗어나도 사용 가능
		// for문 전에 선언이 없이 for문에서만 변수 i를 선언했다면 이는 지역변수이므로 밖에서 사용 불가
		for(i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~" + i + " 합 : " +sum);
	}

}
