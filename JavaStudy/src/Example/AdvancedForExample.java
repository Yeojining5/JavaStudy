package Example;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };
		
		int sum = 0;
		
		// for문의 반복 횟수는 배열의 항목 수가 된다.
		// for( 타입 변수 : 배열) -  배열에서 더이상 가져올 항목이 없으면 빠져나감
		// 타입변수 > 꺼낸 항목을 저장할 변수 선언
		for(int score : scores) {
			sum = sum + score;
			System.out.println(sum);
		}
		System.out.println("점수 총합 =" + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 =" + avg);
	}

}
