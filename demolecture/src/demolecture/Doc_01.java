package demolecture;

import java.util.Scanner;

public class Doc_01 {
	
	// 조건문
	// 프로그램 수행 흐름을 바꾸는 역할을 하는 제어문 중 하나로
	// 조건에 따라 다른 문장이 수행되도록 함.
	
	// 선택처리 - 조건분기
	// 조건 중 해당되는 조건문을 해석하고 종료함.

	// ===============================
	// 1. if
	/*
	 int num = 2;
	System.out.println(num +"은(는)");
	
	if(num % 2 == 0) {
		System.out.println("짝수");
	} else {
		System.out.println("홀수");
	}
	
	System.out.println("입니다.");
	*/
	
	// 가장 처음 if는 true, false와 상관 없이 조건절이 진행되고,
	// if~ else if~ else 조건문이 true면 이후 조건은 실행하지 않고 종료.
	
	
	// ===============================
	
	// 2. if else 
	/*
	 * 
	 * int grade = 1;
	
	if(grade == 1) {
		System.out.println("최우수");
	} else if(grade == 2) {
		System.out.println("우수");
	} else if(grade == 3) {
		System.out.println("보통");
	} else {
		System.out.println("재응시");
	}*/
	
	// 해당 케이스는 switch문을 적용하기에 아주 좋은 케이스
	// 동일한 조건문을 여러번 써야하는 불편함을 해결하기위해서 switch문으로 변경
	
	// ===============================
	// 중첩 if문
	/*
	 * 
		int grade = 1;
		boolean hasPlus = true; 
		
		
		if(grade == 1) {
			if(hasPlus) {
				System.out.println("장학금 당첨~!");
			} else{
				System.out.println("최우수");				
			}
		} else if(grade == 2) {
			System.out.println("우수");
		} else if(grade == 3) {
			System.out.println("보통");
		} else {
			System.out.println("재응시");
		}
	 * 
	 * */
	
	// ===============================
	// 3. switch-case
	// 경우의 수가 많을때 사용하며, 조건식의 결과는 정수 또는 문자,문자열이다.
	// => boolean 은 알맞지 않음.
	
	/* if문 switch문으로 변경
	 * int grade = 2;
		
		switch(grade) {
		case 1: System.out.println("최우수"); break;
		case 2: System.out.println("우수"); break;
		case 3: System.out.println("보통"); break;
		default: System.out.println("재응시"); // 아래 코드가 없기때문에 default에는 굳이 break 쓰지 않아도 된다.
		}
	 * */
	
	/*
	 * 중첩if문 switch문으로 변경
	 * 
	 * int grade = 1;
		boolean hasPlus = true; 
			
		switch(grade) {
		case 1: 
			if(hasPlus) System.out.println("장학금당첨~!"); else System.out.println("최우수"); break;
		case 2: System.out.println("우수"); break;
		case 3: System.out.println("보통"); break;
		default: System.out.println("재응시"); // 아래 코드가 없기때문에 default에는 굳이 break 쓰지 않아도 된다.
		}
	 * 
	 * */
	
	/*
	 * 실습문제
	 * 
	 * System.out.println("===KH만화책방===");
		System.out.println("1.원피스");
		System.out.println("2.슬램덩크");
		System.out.println("3.소년탐정 김전일");
		System.out.println("4.유리가면");
		System.out.println("5.귀멸의 칼날");
		System.out.println("");
		System.out.print("대여할 책 번호 입력: ");
		
		Scanner sc = new Scanner(System.in);
		int bookNumber = sc.nextInt();
		
		switch(bookNumber) {
		case 1: System.out.println("250원 입니다."); break;
		case 2: System.out.println("400원 입니다."); break;
		case 3: System.out.println("300원 입니다."); break;
		case 4: System.out.println("100원 입니다."); break;
		case 5: System.out.println("2000원 입니다."); break;
		default: System.out.println("없는 책 번호 입니다.");
		}
	 * 
	 * */

}
