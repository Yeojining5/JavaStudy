package ch14;

import java.util.*;
import java.util.stream.*;

class Ex14_5 {
	public static void main(String[] args) {
		// student 객체 스트림
		Stream<Student> studentStream = Stream.of(
						new Student("이자바", 3, 300),
						new Student("김자바", 1, 200),
						new Student("안자바", 2, 100),
						new Student("박자바", 2, 150),
						new Student("소자바", 1, 200),
						new Student("나자바", 3, 290),
						new Student("감자바", 3, 180)
					);
		
		// 역순으로 할 때는 .reversed() 만 붙이면 됨
		studentStream.sorted(Comparator.comparing(Student::getBan) // 1. 반별 정렬
		 	.thenComparing(Comparator.naturalOrder())) // 2. 기본 정렬 -> 반별 정렬 후 점수 높은사람이 위로
			.forEach(System.out::println);
	}
}

class Student implements Comparable<Student> {
	String name;
	int ban;
	int totalScore;
	Student(String name, int ban, int totalScore) { 
		this.name =name;
		this.ban =ban;
		this.totalScore =totalScore;
	}

	public String toString() { 
	   return String.format("[%s, %d, %d]", name, ban, totalScore); 
	}

	String getName()     { return name;}
	int getBan()         { return ban;}
	int getTotalScore()  { return totalScore;}

   // 총점 내림차순을 기본 정렬로 한다
	public int compareTo(Student s) { 
		return s.totalScore - this.totalScore;
	}
}