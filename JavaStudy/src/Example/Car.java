package Example;

public class Car {
	String color;
	String gearType;
	int door;
	
	Car() { } // 기본 생성자
	Car(String c, String g, int d) { // 매개변수가 있는 생성자
		color = c;
		gearType = g;
		door = d;
		System.out.println("color - "+c);   
		System.out.println("gearType - "+g);   
		System.out.println("door - "+d);   
	}
	
	
	public static void main(String[] args) {
//		Car c = new Car();
//		c.color = "white";
//		c.gearType = "auto";
//		c.door = 4;
		// 위 3줄을 아래 한줄로 대체 가능
		Car c = new Car("white", "auto", 4);
	}
}
