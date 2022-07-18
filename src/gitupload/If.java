package gitupload;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// if 문
		if (10 >12) {
			System.out.println("크다");
		}else {
			System.out.println("작다");
		}
		// if , else if문
		int check1 = 10;
		if (check1 > 15) {
			System.out.println("4이상입니다");
		}else if(check1 > 7){
			System.out.println("7이상입니다");
		}else {
			System.out.println("4보다 작습니다");
		}
		
		//switch 문
		switch(check1) {
		case 1:
			System.out.println("1보다큽니다");
			break;
		case 2:
				System.out.println("2보다큽니다");
				break;
		case 3:
			System.out.println("3보다큽니다");
			break;
		case 4:
			System.out.println("4보다큽니다");
			break;
		case 5:
			System.out.println("5보다큽니다");
			break;
		case 6:
			System.out.println("6보다큽니다");
			break;
		case 7:
			System.out.println("7보다큽니다");
			break;
		case 10:
			System.out.println("10보다큽니다");
			break;
			default:
				System.out.println("1보다 낮습니다");
				break;
			}
		
		// 실습 1
//      심리 테스트
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
      
      String message = "Q. 당신이 좋아하는 색을 선택하세요.";
      String choiceMessage = "1. 빨간색\n2.노란색\n3.검은색\n4.흰색";
      String redMessage = "불같고 열정적이고 적극적이다."; 
      String yellowMessage = "발랄하고 밝고 귀엽고 개성있고 착하다."; 
      String blackMessage = "묵묵하고 든든하고 냉철하고 멋지다."; 
      String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
      String errorMessage = "다시 입력해주세요.";
      String resultMessage = null;
      int choice = 0;
      Scanner sc = new Scanner(System.in);
      
      System.out.println(message + "\n" + choiceMessage);
      choice = sc.nextInt();
      
//   switch문 사용
      switch(choice) {
      case 1:
    	  resultMessage = redMessage;
    	  break;
      case 2:
    	  resultMessage = yellowMessage;
    	  break;
      case 3:
    	  resultMessage = blackMessage;
    	  break;
      case 4:
    	  resultMessage = whiteMessage;
    	  break;
      default:
    	  resultMessage = errorMessage;
    	  break;
      }
      
//		if문 사용
//      if (choice == 1) {
//    	  resultMessage = redMessage;
//       }else if(choice == 2) {
//    	   resultMessage = yellowMessage;
//       }else if(choice == 3) {
//    	   resultMessage = blackMessage;
//       }else if(choice == 4) {
//    	   resultMessage = whiteMessage;
//       }else{
//    	   resultMessage = errorMessage;
//       }
	   System.out.println(resultMessage);
	   
		// 두 정수 입력받고 대소비교
	   // 정수 형 자료형 변수를 두가지를 생성및 초기화
		int firstNumber = 0, lastNumber = 0;
		// 그리고 메세지를 출력할 변수 (문자열변수)를생성후 값 작성 
		String message1 = "두 정수 입력 : ";
//		Scanner sc = new Scanner(System.in);
		// 메세지 변수를 출력 메소드에 출력!
		System.out.println(message1);
		// 입력값 두개를 받을수 있도록 nextInt를 사용하여 정수값으로 받아오고 변수에 저장!
		firstNumber = sc.nextInt();
		lastNumber = sc.nextInt();
		// if 문으로 작성 !
		if(firstNumber > lastNumber) {
			System.out.println("큰 값 : " + firstNumber);
		}else if(firstNumber != lastNumber) {
			System.out.println("큰 값 : " + lastNumber);
		}else {
			System.out.println("두 수가 같습니다!");
		}
	}


}


