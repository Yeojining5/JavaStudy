package ch14;

///// 람다식을 주고받는 방법에 대한 예제 /////

@FunctionalInterface
interface MyFunction {
	void run();  // public abstract void run();
}

class Ex14_1 {
	static void execute(MyFunction f) { // 매개변수의 타입이 MyFunction인 메서드
		// 람다식을 매개변수로 받아서 호출하는 것 -> 간단
		f.run();
	}

	static MyFunction getMyFunction() { // 반환 타입이 MyFunction인 메서드 
//		MyFunction f = () -> System.out.println("f3.run()");
//		return f;
		// 위 두문장을 한문장으로 -> 람다식을 반환하는 것
		return () -> System.out.println("f3.run()"); 
	}

	public static void main(String[] args) {
		// 람다식으로 MyFunction의 run()을 구현
		// interface MyFunction의 메소드 run()은 반환타입이 void, 매개변수도 없다.
		// 이는 아래 람다식과 일치해야함!! 반환타입과 매개변수 없는 것이 동일!
		MyFunction f1 = ()-> System.out.println("f1.run()");
		
		// dll
		MyFunction f2 = new MyFunction() {  // 익명클래스로 run()을 구현
			public void run() {   // public을 반드시 붙여야 함
				System.out.println("f2.run()");
			}
		};

		// MyFunction f3 = getMyFunction();   // 이 문장은 아래 문장과 같다
		MyFunction f3 = () -> System.out.println("f3.run()");

		f1.run();
		f2.run();
		f3.run();

		execute(f1);
		execute( ()-> System.out.println("run()") ); // 람다식을 직접 매개변수로 넘겨줌
	}
}