package Example;

public class Exercise06 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				/* println 으로 출력하면 개행이 되기 때문에
				 * ** *** **** *****  이 출력문이 1개씩 개행되어 출력됨
				 */
				//System.out.println("*");
				
				if(j==i) {
					System.out.println(); // 개행문
				}
			}
		}

	}

}
