class ConA {
	public ConA() {
		System.out.println("생성자A");
	}
	public ConA(int x) {
		System.out.println("매개변수 생성자A" + x);
	}
}

class ConB extends ConA {
	public ConB() {
		System.out.println("생성자B");
	}
	public ConB(int x) {
		System.out.println("매개변수 생성자B " + x);
	}
}

public class ConstructorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConB b;
		b = new ConB(5);
	}

}
