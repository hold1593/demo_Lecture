package demolecture;

public class Doc_03 {
	// 분기문
	// 1. break
	// 반복문에서는 break문 자신이 포함된 가장 가까운 반복문을 빠져나가는 구문
	
	/*
	for(int i=1; i<=10; i++) {
		System.out.println("i:"+i);
		if(i % 2 == 0 && i > 5) {
			System.out.println("짝수");
			break;
		}
	}
	*/
	// i는 6까지 출력 => "짝수" 출력 => 종료
	
	/*
	for(int i=1; i<=10; i++) {
		System.out.println("i:"+i);
		for(int j=0; j <= 5; j++) {
			System.out.println("j:"+j);
			break;
		}
	}
	*/
	// j는 0밖에 출력을 못한다.
	// 0출력 구문을 수행한 뒤 break구문을 만나서 해당 반복문을 종료시키기 때문에
	// 위 코드에서 break를 어디에 작성하냐에 따라 실행 결과가 모두 다름.
	
	
	
	// 2. continue
	// 반복문 내에서만 사용 가능.
	// 반복문 실행 시 continue 아래 부분은 실행하지 않고 반복문 다시 실행.
	// for문의 경우 증감식으로 이동, while(do~while)문의 경우 조건식으로 이동
	// 전체 반복 중에 특정 조건을 만족하는 경우를 제외하고자 할 때 유용

	/*
	 * for(int i=1; i <= 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println("i:"+i);
		}
		// 홀수만 출력
	 * */
}
