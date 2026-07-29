package Review;

import java.util.Scanner;

public class Rev0723_day02_Ex10_if문연습예제1 {

	public static void main(String[] args) {
		// Scanner를 이용하여 정수를 입력받아 정수가 양수인지, 0인지, 음수인지를 판별하는 코드를 작성하세요.
				/* 예시1
				 * 정수 입력 : 10
				 * 10은 양수
				 * 
				 * 예시2
				 * 정수 입력 : -3
				 * -3은 음수
				 * 
				 * 예시3
				 * 정수 입력 : 0
				 * 0
				 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num1 = scan.nextInt();
		
		if(num1 > 0) {
			System.out.println(num1 + "은 양수");
		}
		else if(num1 < 0) {
			System.out.println(num1 + "은 음수");
		}
		else if(num1 == 0) {
			System.out.println(num1);
		}

		

	}

}
