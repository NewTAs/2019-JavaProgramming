
public class StaticEx {

	int b= 7;
	static int c;
	void value() {
		this.b = 2;
		this.c = 3; //non-static �޼ҵ忡���� static ��� ���� ����
	}
	int sum() {
		int a = 1+2;
		return a;
	}
	static int sums() {
		int i = 1+2;
		//this.b = 3; static �ȿ����� this�� ����� �� ����.
		return i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//b = 3; static�� non-static�� �ҷ��� �� ����.
		//sum(); static�� non-static�� �ҷ��� �� ����.
		
		StaticEx examEx = new StaticEx();
		
		examEx.b = 3;
		examEx.sum();
	}

}
