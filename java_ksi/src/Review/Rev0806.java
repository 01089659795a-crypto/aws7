package Review;

public class Rev0806 {

	public static void main(String[] args) {
		// 중첩 for문을 사용하여 2단부터 9단까지 전체 구구단을 출력하는 코드를 작성해보세요.
		
		for(int i = 2; i <= 9; i++) {
			System.out.println("===== " + i + "단 =====");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
		}

	

	 	// 정수 5개를 담는 배열을 생성하고, for문을 사용하여 모든 요소의 합계와 평균을 출력해보세요.
		
		int [] scores = {50, 60, 70, 80, 90};
		int sum = 0;
		
		for(int score : scores) {
			sum += score;
		}
		double average = (double)sum/scores.length;
		
		System.out.println("모든 요소의 합계 : " + sum);
		System.out.println("모든 요소의 평균 : " + average);
		
		
		// 
	}		
}

