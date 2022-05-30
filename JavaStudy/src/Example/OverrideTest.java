package Example;

class MyPoint {
	int x;
	int y;
	String getLocation() {
		return "x:"+x+", y:"+y;
	}
}

class Point3D extends MyPoint {
	int z;  // 변수 z가 추가되었으니 이에 맞게 재정의하였음
	
	// 조상의 getLocation() 메소드를 오버라이딩
	String getLocation() {
		return "x:"+x+", y:"+y+", z:"+z;
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		Point3D p = new Point3D();
		p.x = 3;
		p.y = 5;
		p.z = 7;
		System.out.println(p.getLocation());

	}

}
