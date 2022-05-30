package Example;

	
class Point {
		int x;
		int y;
	}
	
//class Circle extends Point { // 상속
//		int r;
//	}

class Circle { // 상속이 아닌 포함관계
	Point p = new Point();
	int r;
}

public class InheritanceTest {
	public static void main(String[] args) {
		Circle c = new Circle();		
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		System.out.println("c.p.x = "+c.p.x);
		System.out.println("c.p.y = "+c.p.y);
		System.out.println("c.r = "+c.r);
		System.out.println(c.toString()); // 컴파일러가 기본으로 제공하는 클래스
	}

}
