package demolecture;

public class Doc_02 {
	// 반복문
	// 특정 문장들을 반복해서 수행하도록 함

	// 1. for문
	
	 /*for(초기식; 조건식; 증감식) {
		수행될 코드;
	}*/
	
	public void method1() {
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
	}
	

	
	// 1-2. 중첩반복문
	public void method2() {
		
		for(int i=0; i<5; i++) {
			System.out.println("i: "+i);
			
			for(int x=0; x<3; x++) {
				System.out.println("x:" + x);
			}
			
			System.out.println(i+"회전종료");
		}
	}
	
	
	// 3.while문
	public void method3() {
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++; // 조건을 벗어나게 할 연산(증감식, 분기문) 필요함 -> 무한루프에 빠질수있음
		}
	}
	
	// 4. do while문
	// while 문과의 차이점
	// 1. do 안의 내용을 먼저 실행
	// 2. -> 조건문이 true가 아니어도 무조건 한 번 이상 수행한다.
	public void method4() {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while(i <= 10);
		
		
	}
	
}
