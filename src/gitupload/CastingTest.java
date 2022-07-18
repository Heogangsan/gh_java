package gitupload;

public class CastingTest {

	public static void main(String[] args) {
		// 1. 자동 형변환
		
		System.out.println(3 + 3); // 정수 + 정수 = 정수
		System.out.println(3 + 3.0);// 정수 + 실수  = 실수
		System.out.println('A' + 1);// 문자 + 정수  = 정수
		System.out.println("문자열"+12);// 문자열 + 정수 = 문자열

		// 2. 강제 형변환
		System.out.println(15/(double)9);
		System.out.println((int)8.12 + 2.55);
		System.out.println((int)(8.12 + 2.55));
		System.out.println((int)8.12 + (int)2.55);
		
		// 3. 문자열 형변환
		System.out.println(Integer.parseInt("12")+14); // 문자열 에서 정수 형 변경후 더하기
		System.out.println(Float.parseFloat("12.4")+22.1);// 문자열 에서 실수 형 (float) 변경후 더하기
		System.out.println(Double.parseDouble("12.6")+12.5);// 문자열 에서 실수 형 (double) 변경후 더하기!
		
	}

}
