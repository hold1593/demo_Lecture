package demolecture;

public class Doc_01 {
	
	// 조건문
	// 프로그램 수행 흐름을 바꾸는 역할을 하는 제어문 중 하나로
	// 조건에 따라 다른 문장이 수행되도록 함.
	
	// 선택처리 - 조건분기
	// 조건 중 해당되는 조건문을 해석하고 종료함.

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
	
	
	// 2. if else
	/*int grade = 1;
	
	if(grade == 1) {
		System.out.println("최우수");
	} else if(grade == 2) {
		System.out.println("우수");
	} else if(grade == 3) {
		System.out.println("보통");
	} else {
		System.out.println("재응시");
	}*/
	
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
	
	// 3. switch-case
	// 경우의 수가 많을때 사용하며, 조건식의 결과는 정수 또는 문자,문자열이다.
	// => boolean 은 알맞지 않음.
	
	/* int result = (int) (Math.random() * 10);
	System.out.println("랜덤숫자: "+result);
	
	switch(result) {
		case 1: System.out.println("일이에요"); break;
		case 2: System.out.println("이에요"); break;
		case 3: System.out.println("삼이에요"); break;
		case 4: System.out.println("사에요"); break;
		case 5: System.out.println("오에요"); break;
		case 6: System.out.println("육이에요"); break;
		case 7: System.out.println("칠이에요"); break;
		case 8: System.out.println("팔이에요"); break;
		case 9: System.out.println("구에요"); break;
		case 10: System.out.println("십이에요"); break;
		
		default : System.out.println("무슨값이에용?"); 
		// 해당되는 값이 없을때 기본 설정값으로 출력
	}*/

}
