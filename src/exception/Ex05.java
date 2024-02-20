package exception;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);// 입력 스트림(연결통로)
		int x;
		System.out.println("수 입력");
		x= input.nextInt();

		try {
			int result = 10/x;
			System.out.println("결과 : result "+result);
			return;//메소드 종료
		}catch(Exception e) {
			e.printStackTrace();
		}finally {//위와 상관없이 무조건 실행되는 코드(return이 있어도)
			input.close();
			System.out.println("finally 실행");
		}
		System.out.println("다음 문장들 실행!");
	}
}


