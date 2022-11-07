package demolecture;

public class Main {
	// 제어문
	
	// 제어문이란?
	// 자바 인터프리터는 위에서 아래로, 오른쪽에서 왼쪽으로 프로그램을 읽어가는데
	// 이러한 프로그램의 흐름을 제어하는 것을 제어문이라고 한다.
			
	/* 제어구조 종류(3가지)
	 	1.순차처리: 위에서 아래로
		2.선택처리: 
		  -조건분기 : if, if else, switch-case 등
		  -무조건분기(자바에서 사용x)
		3.반복처리: for, while, do~while + 분기문(break, continue)
	 */
	public static void main(String[] args) {
		
		for(int i=1; i <= 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println("i:"+i);
		}
		
	}
 
}
