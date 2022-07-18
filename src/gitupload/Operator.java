package gitupload;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		// 비트 연산자
		System.out.println(10&11);
		System.out.println(10|11);
		System.out.println(10^11);
		System.out.println(~10);
		System.out.println(~11);
		// 조건식
		boolean isTrue = 10 > 11;
		System.out.println(10 == 11);
		System.out.println(10 != 11);
		System.out.println(isTrue);
		System.out.println(isTrue && 10 == 11);
		System.out.println(isTrue || 10 == 10);
		//true가 나오도록 수정
		System.out.println(isTrue && 10 == 10);
		// 삼항연산자
		System.out.println(10 < 11 ? "ok" : "false");
		// 증감 연산자
		int data = 10;
//		System.out.println(data++);
		System.out.println(++data);
		System.out.println(data);
		// 대입 연산자(복합 대입 연산자, 누적 연산자)
		int money = 10000;
		// money - 1000
		money = money - 1000;
		System.out.println(money);
		int score = 10000;
		score -= 1000;
		System.out.println(score);
		
		//실습 1
//		두 정수 입력받기
		// 입력 클래스 호출!
			Scanner sc = new Scanner(System.in);
			// boolean 변수 2개 를 선언 및 초기화 !
			boolean isBigger = false, isSame = false;
			// 정수 값 2개를 받고 저장해야할 변수 선언과 초기화 !
			int firstNumber = 0, secondNumber = 0;
			// 메세지 출력을 사용할 문자열 변수 2개와 결과 값을 저장과 출력할 문자열 변수값 1개 선언과 초기화
			String numberMsg = "정수값 2개 입력 : ", numberMsg2 = "두 수가 값습니다",result = null;
			System.out.println(numberMsg);
			// 입력값을 정수로 받아 변수 2개에 저장!
			firstNumber = sc.nextInt();
			secondNumber = sc.nextInt();
			// boolean 변수 2개중 첫번째 firstNumber 값이 secondNumber 값보다 클때 
			// 두번째 변수 는 firstNumber 값과 secondNumber값이 같은경우 
			isBigger = firstNumber > secondNumber;
			isSame = firstNumber == secondNumber;
			// 삼항연산자를 이용하여 메세지 출력!
			result  = isBigger ? "큰 값 : "+firstNumber : isSame ? numberMsg2 : "큰 값 : "+secondNumber;
			
			System.out.println(result);
			
			// 실습 2
//			Scanner sc = new Scanner(System.in);
			// 실수형 변수와 문자열 변수2개 그리고 논리형 변수 하나 생성 및 초기화! 그리고 문자 변수에 제어문자\n 변수 저장!
			double height = 0.0;
			String format = null;
			boolean check = false;
			char newLine = '\n';
			String message = "키 : ";
			
			System.out.println(message);
			// 입력값을 실수형 으로 받은후 변화과 함께 height 변수에 저장
			height = sc.nextDouble();
			
//			System.out.println(height);
			// 체크 변수 에서 height 변수가 height 를 뺀값이 0과 같을때를 boolean값으로 check변수에 저장!
			
			check = height - (int)height == 0;
			
			format = check ? "%.0fcm%c" : "%.2fcm%c";
			
			System.out.printf(format, height, newLine);
			// 실습 3
			// 심리 테스트
		      /*
		       * Q. 당신이 좋아하는 색을 선택하세요.
		       * 1. 빨간색
		       * 2. 노란색
		       * 3. 검은색
		       * 4. 흰색
		       * 
		       * 빨간색 : 불같고 열정적이고 적극적이다.
		       * 노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
		       * 검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
		       * 흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
		       * 
		       */
		      // 문자열 변수 8개 를 생성하여 각각 출력메세지를 입력후 변수 저장 그리고 나머지 하나는 결과값을 받아야하기에 초기화!
		      String message1 = "Q. 당신이 좋아하는 색을 선택하세요.";
		      String choiceMessage = "1. 빨간색\n2.노란색\n3.검은색\n4.흰색";
		      String redMessage = "불같고 열정적이고 적극적이다."; 
		      String yellowMessage = "발랄하고 밝고 귀엽고 개성있고 착하다."; 
		      String blackMessage = "묵묵하고 든든하고 냉철하고 멋지다."; 
		      String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		      String errorMessage = "다시 입력해주세요.";
		      String resultMessage = null;
		      // int 자료형의 변수값을 생성하여 0 으로 초기화!
		      int choice = 0;
//		      Scanner sc = new Scanner(System.in);
		      
		      System.out.println(message1 + "\n" + choiceMessage);
		      // choice 변수 값을 입력값으로 받을수 있도록 작성!
		      choice = sc.nextInt();
		      // 삼항 연산자를 통해 조건식으로 연결하도록 작성!
		      resultMessage = choice == 1 ? redMessage : 
		         choice == 2 ? yellowMessage :
		            choice == 3 ? blackMessage : 
		               choice == 4 ? whiteMessage : errorMessage;
		      // 그리고 그 결과를 메세지 출력!
		      System.out.println(resultMessage);
		   }
		
			
	}

