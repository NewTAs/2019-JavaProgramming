
public class StaticEx {

	int b= 7;
	static int c;
	void value() {
		this.b = 2;
		this.c = 3; //non-static 메소드에서는 static 멤버 접근 가능
	}
	int sum() {
		int a = 1+2;
		return a;
	}
	static int sums() {
		int i = 1+2;
		//this.b = 3; static 안에서는 this를 사용할 수 없다.
		return i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//b = 3; static은 non-static을 불러올 수 없다.
		//sum(); static은 non-static을 불러올 수 없다.
		
		StaticEx examEx = new StaticEx();
		
		examEx.b = 3;
		examEx.sum();
	}

}
