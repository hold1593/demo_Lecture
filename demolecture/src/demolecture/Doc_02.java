package demolecture;

public class Doc_02 {
	// 반복문
	// 특정 문장들을 반복해서 수행하도록 함

	// 1. for문
	
	 /*for(초기식; 조건식; 증감식) {
		수행될 코드;
	}*/
	
	// 1회전
	// 초기식 확인 
	// 조건식 확인
	// 조건식 true -> 문장 수행 후 증감식 연산
	// 조건식 false -> 수행 X
	// 2회전
	// 조건식 확인
	// 조건식 true -> 문장 수행 후 증감식 연산
	// 조건식 false -> 수행 X
	// ... 위와 같이 2회전과 동일하게 반복수행 
	// 조건식이 false면 수행하지 않고 종료.

	/*
	 * 	for(int i=0; i<5; i++) {
			System.out.println(i);
		}
		
		// 0,1,2,3,4 종료 (5는 조건식에 부합하지 않으므로 수행하지않고 종료)
	 * */
	
	// 1-2. 중첩반복문
	/*
	 * // 중첩 반복문
		
		for(int i=0; i<5; i++) {
			// 1.첫번째 for문 수행
			// 4.첫번째 for문이 false가 될 때까지 반복 수행
			System.out.println(i);
			for(int j=0; j<3; j++) { // 2.두번째 for문이 false가 나올때까지 반복 수행 후 두번째 for문 종료
				System.out.println("j:" + j);
			}
			System.out.println(i+"회전종료"); // 3. 두번째 for문 종료후 수행
		}
	 * */
	
	// 3.while문
	
	/*
	 * int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++; // 조건을 벗어나게 할 연산(증감식, 분기문) 필요함 -> 무한루프에 빠질수있음
		}
	 * */
	// 4. do while문
	
	/*
	 * 	int i = 1;
		do {
			System.out.println(i);
			i++;
		} while(i <= 10);
		// } while(false);
		
		// while 문과의 차이점
		// 1. do 안의 내용을 먼저 실행
		// 2. -> 조건문이 true가 아니어도 무조건 한 번 이상 수행한다.
	 * */
	
}
