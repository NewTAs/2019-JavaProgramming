class Sam {
	int id;
	public Sam(int x) {
		this.id = x;
	}
	public void set(int x) {
		this.id = x;
	}
	public int get() {
		return this.id;
	}
	
}
public class Samp_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sam ob1 = new Sam(3);
		Sam ob2 = new Sam(4);
		Sam s;
		
		s = ob2;
		ob1 = ob2;
		System.out.println("ob1.id=" + ob1.id);
		System.out.println("ob2.id=" + ob2.id);
		
		/*객채의 치환을 하게 되면, 두개의 객체는 하나의 객체만 바라보게 된다.
		 * 다른 부분을 바라보기 위해서는 다시 새롭게 만들어야 한다.
		 * Example) Sam ob1 = new Sam(3)*/
	}

}
