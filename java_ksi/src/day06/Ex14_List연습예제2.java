package day06;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex14_List연습예제2 {

	public static void main(String[] args) {
		/* 3개의 중복되지 않는 정수를 입력받는 코드를 작성하세요.
		 * - 단, 1~9사이의 정수
		 * - 중복 입력하면 다시 입력
		 * - 리스트.contains(숫자)
		 */
		
		//ArrayList 생성(정수)
		ArrayList<Integer> list = new ArrayList<Integer> ();
		
		//반복 : 리스트에 3개가 저장될 때까지
			//정수를 입력 받음
			Scanner scan = new Scanner(System.in);
			
			for( ; list.size() < 3; ) {
				System.out.println("정수 입력 : ");
				//정수를 입력 받음
				int num = scan.nextInt();
				//입력받은 정수가 리스트에 없으면 추가
				if(!list.contains(num)) {
					list.add(num);
				
				}
			}
			//list에 있는 값을 콘솔에 출력
			System.out.println(list);
	}
	public static ArrayList<Integer> inputNums(int size, int min, int max) {
		//ArrayList 생성(정수)
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Scanner scan = new Scanner(System.in);
		//반복 : 리스트에 3개가 저장될때까지
		for( ; list.size() < size ; ) {
			//정수를 입력 받음
			int num = scan.nextInt();
			//입력받은 정수가 리스트에 없으면 추가
			if(!list.contains(num)) {
				list.add(num);			
			}
		}
		return list;
	}

}
