package exception;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		try {
			int n1= 10, n2 = 2;
			System.out.println(n1/n2);
			
			ArrayList<String> arr = new ArrayList<>();
			arr.add("111");
			arr.add("222");
			arr.add("333");
			for(int i=0; i<=arr.size();i++) {//<=인덱스 범위 벗어난다
				System.out.println(arr.get(i));
			}
		}catch(IndexOutOfBoundsException e) {//하나의 메소드
			System.out.println("문제 발생 : "+e);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없음!");
		}
		System.out.println("다음 문장들 이어서 진행!!");
	}

}
