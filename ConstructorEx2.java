class ConsA {
	ConsA(int a) {
		System.out.println("매개변수 생성자A ");
	}
}

class ConsB extends ConsA {
	/*  이렇게 작성하면 ConsB()에 대한 오류가 발생한다.
	ConsB() {
		System.out.println("매개변수 생성자B ");
	}
	*/ 
	
	//해결방법
	ConsB() {
		super(1);
		System.out.println("매개변수 생성자B ");
	}
}

public class ConstructorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConsB b = new ConsB();
	}

}
