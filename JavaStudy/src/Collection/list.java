package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class list {
	public static void main(String[] args) {
		// 기본 길이(용량, capacity)가 10인 ArrayList를 생성 = 객체 배열
		ArrayList list1 = new ArrayList(10); // 0번지부터 9번지까지
		// ArrayList에는 객체만 저장 가능
		// but, 아래와같이 작성 가능한 이유는 autoboxing에 의해 기본형이 참조형으로 자동 변환
		// 컴파일러가 자동으로 바꿔주는 것임.
		// list1.add(5); // 이와같이 간단하게 쓸 수도 있음
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		
		// ArrayList(Collection c)
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // 1번지부터 4번지까지 뽑아서 새로운 리스트를 만듦
		print(list1, list2);
		
		// Collections은 인터페이스, Collections는 유틸 클래스 (collection을 다루는 메소드를 제공하는 클래스)
		// 컬렉션을 오름차순으로 정렬해준다.
		Collections.sort(list1); // 0, 1, 2, 3, 4, 5
		Collections.sort(list2); // 0, 2, 4
		print(list1, list2);
		
		
		// list1은 list2의 모든 요소들을 포함하고 있다 - true
		System.out.println("list1.containsAll(list2) : "+list1.containsAll(list2));
		
		list2.add("B"); // 0, 2, 4, B
		list2.add("C"); // 0, 2, 4, B, C
		list2.add(3, "A"); // 추가할위치 = 3번지 -> 0, 2, 4, A, B, C
		print(list1, list2);
		
		list2.set(3, "AA"); // 3번지의 값인 A를 AA로 변경(치환) 
		print(list1, list2); // 0, 2, 4, AA, B, C
		
		list1.add(0, "1"); // list1에 문자열 "1" 을 추가 -> 1, 0, 1, 2, 3, 4, 5
		// indexOf()는 지정된 객체의 위치(인덱스)를 알려준다.
		System.out.println("index = "+ list1.indexOf("1")); // index = 0 (String 1의 인덱스)
		System.out.println("index = "+ list1.indexOf(1)); // index = 2 (Integer 1의 인덱스)
		
		list1.remove(5); // 인덱스가 5인 객체를 삭제
		list1.remove(new Integer(1)); // 1을 삭제 ***** 중요!!
		
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : "+list1);
		System.out.println("list2 : "+list2);
		System.out.println();
	}
	
}
