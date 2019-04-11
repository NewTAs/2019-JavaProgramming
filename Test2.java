
public class Test2 {

	public void A(int a) {
		
	}
	public void A(int a, int b) {
		System.out.println("AA");
	}
	public void A(int a, int h, int c) {
		
	}
	public int A(short a, int b) {
		System.out.println("BB");
		return (int)(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test2 t = new Test2();
		int a = t.A((short)1, 1);
		/* 만약 t.A(1,1)이라면 ERROR 발생
		 * 즉, 타입의 중요성을 보여주는 예제
		 */
		
		System.out.println(a);
	}

}
