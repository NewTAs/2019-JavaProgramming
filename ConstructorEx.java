class CA {
	public CA() {
		System.out.println("생성자A");
	}
	public CA(int x) {
		System.out.println("매개변수생성자A" + x);
	}
}

class CB extends CA {
	public CB() {
		System.out.println("생성자B");
	}
	public CB(int x) {
		super(x);
		System.out.println("매개변수생성자B" + x);
	}
}
public class ConstructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CB b;
		b = new CB(5);
	}

}
