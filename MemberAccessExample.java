class A {
	public int p;
	private int n;
	public void setN(int n) {
		this.n = n;
	}
	public int getN() {
		return n;
	}
}

class B extends A {
	private int m;
	public void setM(int m) {
		this.m = m;
	}
	public int getM() {
		return m;
	}
	public String toString() {
		String s = getN() + " " + getM();
		return s;
	}
}
public class MemberAccessExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		B b = new B();
		
		a.p = 5;
		//a.n = 5; n¿∫ private
		
		b.p = 5;
		//b.n = 5; n¿∫ private
		b.setN(10);
		int i = b.getN();
		
		//b.m = 20; n¿∫ private
		b.setM(20);
		System.out.println(b.toString());
		
	}

}
