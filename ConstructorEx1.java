class ConA {
	public ConA() {
		System.out.println("������A");
	}
	public ConA(int x) {
		System.out.println("�Ű����� ������A" + x);
	}
}

class ConB extends ConA {
	public ConB() {
		System.out.println("������B");
	}
	public ConB(int x) {
		System.out.println("�Ű����� ������B " + x);
	}
}

public class ConstructorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConB b;
		b = new ConB(5);
	}

}
