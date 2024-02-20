package exception;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age= 0;
		System.out.println("나이 입력");
		try {
			age = input.nextInt();
			if(age<0) {// 강제예외(잘 쓰지는 않는다)
				throw new Exception("음수는 안되요!");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("당신의 나이는 : "+age);
		
	}

}
