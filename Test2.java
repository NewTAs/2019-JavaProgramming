
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
		/* ���� t.A(1,1)�̶�� ERROR �߻�
		 * ��, Ÿ���� �߿伺�� �����ִ� ����
		 */
		
		System.out.println(a);
	}

}
