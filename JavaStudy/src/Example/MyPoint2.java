package Example;

public class MyPoint2 extends Object {
	int x;
	int y;
	
	MyPoint2(int x, int y) { // 생성자
		this.x = x;
		this.y = y;
	}
	
	// Object 클래스의 toString()을 오버라이딩. 재정의함!
	public String toString() {
		return "x:"+x+", y:"+y;
	}
	
	public static void main(String[] args) {
		MyPoint2 p = new MyPoint2(3,5); // 생성자 호출
		System.out.println(p);
	}
}
