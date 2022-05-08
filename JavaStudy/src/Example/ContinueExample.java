package Example;

public class ContinueExample {

	public static void main(String[] args) throws Exception {
		for(int i = 1; i<=10; i++) {
			if(i%2 != 0) {
				 // if문의 조건을 만족하는 경우 continue문 실행하여	
				continue; // 그 이후의 문장을 실행하지 않고 다음 반복으로 넘어감 (i++)
			}
			System.out.println(i); // 짝수가 아닌 조건(=홀수)은 출력되지 않으므로, 짝수만 출력됨
		} //////////////////////////////// End of For문

	}

}
