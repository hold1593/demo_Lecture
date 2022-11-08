package demolecture;

import java.util.Scanner;

public class Main {
	// 제어문
	
	// 제어문이란?
	// 위에서 아래로 프로그램을 읽어가는 프로그램의 흐름을 제어하는 것을 제어문이라고 합니다.
	// 위에서 아래로 읽다가 특정 구역에서 코드를 건너 뛴다거나, 반복하는 등의 제어가 가능한 것.
	// 언제 사용하나?
	// 특정 조건이 있을때 => 조건문
	// 특정 조건을 반복한다 => 반복문(반복문 안에 조건문이 포함되어 있다)
	// 탈출하거나, 되돌아가거나 등 제어 => 분기문
			
	/* 
	 * 1. 조건문
	 * 2. 반복문
	 * 3. 분기문
	 * 
	 * 사용하는 이유?
	 *  조건문과 반복문은 프로그래밍에 있어서
	 *  논리의 흐름을 정하는 가장 기본적인 기술.
	 *  조건문은 조건에 따라 결정을 내리는것.
	 *  예를들어 나이로 성년을 결정할 때 만 19세가 넘으면 성인이다 라고 하는것도 조건문에 해당한다.
	 *  반복문은 반복적으로 같은 처리를 되풀이하는것.
	 *  만약 1000명의 사람의 각각 나이를 출력하기위해서 100번의 나이 출력코드를 작성하는것은 매우 비효율적 => 반복문을 이용하여 그런 과정을 대신할 수 있다.
	 *  
	 */
	public static void main(String[] args) {

		Doc_01 doc1 = new Doc_01();
		doc1.method1();
		
		Doc_02 doc2 = new Doc_02();
		//doc2.method1();
		
		Doc_03 doc3 = new Doc_03();
		//doc3.method1();
	}
 
}
