package ch14;

import java.util.Random;
import java.util.stream.IntStream;

class Ex14_0 {

	public static void main(String[] args) {
		IntStream intStream = new Random().ints(); // 무한스트림 생성
		intStream.limit(5).forEach(System.out::println); // 5개씩 잘라서 출력
	}
}
		
