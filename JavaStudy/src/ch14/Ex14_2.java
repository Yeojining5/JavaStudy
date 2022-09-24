package ch14;

import java.util.function.*;
import java.util.*;

class Ex14_2 {
	public static void main(String[] args) {
		Supplier<Integer>  s = ()-> (int)(Math.random()*100)+1; // 1~100난수
		Consumer<Integer>  c = i -> System.out.print(i+", ");  // 콘솔에 출력
		Predicate<Integer> p = i -> i%2==0; // 짝수인지 검사
		Function<Integer, Integer> f = i -> i/10*10; // i의 일의 자리를 없앤다
		
		List<Integer> list = new ArrayList<>();	
		makeRandomList(s, list); // list를 랜덤값으로 채운다
		System.out.println(list);
		printEvenNum(p, c, list);
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList);
	}

	static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
		List<T> newList = new ArrayList<T>(list.size());

		for(T i : list) {
			newList.add(f.apply(i));
		}	

		return newList;
	}

	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i : list) {
			if(p.test(i))
				c.accept(i);
		}	
		System.out.println("]");
	}
	
	// 람다식을 주면 그 람다식에 있는 것을 10번 돌면서 꺼내옴
	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i=0;i<10;i++) {
			list.add(s.get()); // Supplier로부터 1~100의 난수를 받아서 list에 추가
		}
	}
}