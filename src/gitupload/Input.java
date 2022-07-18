package gitupload;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// 입력클래스
		Scanner sc = new Scanner(System.in);
		String next1 = null;
		String next2 = null;
		// 입력 메소드
		next1 = sc.next();
		next2 = sc.nextLine();
		System.out.println(next1);
		System.out.println(next2);
		
		// 실습 1
		// 두 개의 정수를 입력한 뒤 덧셈 결과 출력
		// 단, next()만 사용
		// 입력받을 정수형 변수 와 결과값 변수 선언!
		int firstNumber = 0, lastNumber = 0, result = 0; // 최적화
		// 입력받고 저장할 변수 2개 선언!
		String firstNumberMsg = "첫번째 정수 : ", lastNumberMsg = "두번째 정수 :";
//		Scanner sc = new Scanner(System.in);
		
		System.out.print(firstNumberMsg);
		// 문자열 입력값을 정수 값으로 변경 
		firstNumber = Integer.parseInt(sc.next());
		
		System.out.print(lastNumberMsg);
		// 문자열 입력값을 정수 값으로 변경
		lastNumber = Integer.parseInt(sc.next());
			// 첫번째 입력값 과 두번째 입력값을 더한 값을 result 라는 변수에 저장!
		 result = firstNumber + lastNumber;
	      // printf 메소드를 통해 출력!
	     System.out.printf("%d + %d = %d", firstNumber, lastNumber, result);
	     //	실습 2
	     //	3개의 정수를 한 번에 입력받은 후
	     //	3개의 정수의 곱 출력
			// Scanner 클래스 선언 
//			Scanner sc = new Scanner(System.in);
			// 정수 자료형인 int 변수를 선언과 초기화
			int firstNumber1 = 0, secondNumber = 0, thirdNumber = 0, result1 = 0;
			// 문자열 자료형인 String 변수 값으로 메세지를 출력할수 있도록 변수로 저장
			String numberMsg = "3개의 정수값 : ";
			// 위의 numberMsg 변수 를 이용하여 출력!
			System.out.print(numberMsg);
			// 위의 정수(int) 자료형 변수 를 입력 값으로 받아옴!
			firstNumber1 = Integer.parseInt(sc.next());
			secondNumber = Integer.parseInt(sc.next());
			thirdNumber = Integer.parseInt(sc.next());
			// 입력 값을 모두 곱하여 result 값으로 저장!
			result1 = firstNumber1 * secondNumber * thirdNumber;
			// 마지막 결과 값이 저장된 변수 를 출력!
			System.out.print(result);
	}

}
