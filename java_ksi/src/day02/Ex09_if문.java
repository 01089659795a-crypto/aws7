package day02;

public class Ex09_if문 {

	public static void main(String[] args) {

	      /* 조건문
	       * - 상황에 따라 결과가 달라질 때 사용
	       * - 예 : 자판기에서 선택한 메뉴에 따라 나오는 음료가 다름
	       * - ~면 ...해라 표현되면 조건문
	       *   - ~ : 조건식
	       *   - ... : 실행문
	       * 
	       * else if문 문법
	       * 
	       * //조건식1이 참이면 실행문1을 실행
	       * if(조건식1){ 
	       *       실행문1;
	       * }
	       * //조건식1이 거짓이고 조건식2가 참이면 실행문2를 실행
	       * else if(조건식2){ 
	       *       실행문2;
	       * }
	       * //조건식1과 조건식2가 모두 거짓이면 실행문3을 실행
	       * else{ 
	       *       실행문3;
	       * }
	       * 
	       * */
		  /* 영업이익이 1억 이상이면 보너스가 200이고, 영업이익이 6천 이상이면 보너스가 100이고
		   * 아니면 보너스 없습니다.
		   */
		
		int operatingIncome = 11000; // 단위 : 만원
		int bonus = 0; // 단위 : 만원
		if(operatingIncome >= 10000) {
			bonus = 200;
		}
		else if(operatingIncome >= 6000) {
			bonus = 100;
		}
		else {
			bonus = 0;
		}
		
		System.out.println("영업 이익은 " + operatingIncome + "만원이고, 내 보너스는 " + bonus + "만원입니다.");
		
   }


}


