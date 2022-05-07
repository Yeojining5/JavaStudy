package Example;

public class IfNestedExample {

	public static void main(String[] args) {
		// 81~100점까지 출력시키는 난수 메서드 
		int score = (int)(Math.random()*20)+81;
		System.out.println("점수: " + score);
		
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if(score>=85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		System.out.println("학점: " + grade);
	}

}
