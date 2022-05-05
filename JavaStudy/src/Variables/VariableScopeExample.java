package Variables;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 -10;
		}
		int v3 = v1+5; // 여기서 v2는 지역변수이기 때문에 사용불가

		System.out.println(v3);
	}

}
