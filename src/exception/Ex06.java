package exception;
class Test06{
	public void test1() {
		System.out.println(11111);
		test2();
	}
	public void test2() {
		System.out.println(22222);
		try {//다른 메소드 추가x
			Thread.sleep(1000);//예외전가는 다른 메소드도 다 해줘야하는 불편
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

public class Ex06 {
	public static void main(String[] args) {
		Test06 t = new Test06();
		t.test1();
		
	}

}
