package exception;

import java.util.Scanner;
class A{}
class B extends A{}
public class Ex02 {
	public static void main(String[] args) {
		
		B b = new B();
		B a = new B();
		
		
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("수 입력");
			num= input.nextInt();
			try {
				System.out.println("결과 : "+(100/num));
			}catch(Exception e) {//부모 나머지도 exception처리
				//System.out.println("0입력하면 안되요!");
				//System.out.println(e);//명시
				System.err.print("에러 : "+e);
			}
		}
	}

}
