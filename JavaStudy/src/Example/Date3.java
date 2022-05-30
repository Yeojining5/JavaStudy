package Example;

public class Date3 {
	int x;
	
	public static void main(String[] args) {
		Date3 d = new Date3();
		d.x = 10;
		
		Date3 d2 = copy(d);
		System.out.println("d.x = "+d.x);
		System.out.println("d2.x = "+d2.x);
	}

	static Date3 copy(Date3 d) { // 참조형 반환타입 Date3을 가지는 copy() 메소드 + 참조형 매개변수
		Date3 tmp = new Date3();
		tmp.x = d.x;
		return tmp;
	}
}
