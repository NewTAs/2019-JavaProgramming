class CA {
	public CA() {
		System.out.println("������A");
	}
	public CA(int x) {
		System.out.println("�Ű�����������A" + x);
	}
}

class CB extends CA {
	public CB() {
		System.out.println("������B");
	}
	public CB(int x) {
		super(x);
		System.out.println("�Ű�����������B" + x);
	}
}
public class ConstructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CB b;
		b = new CB(5);
	}

}
