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
		
		/*��ä�� ġȯ�� �ϰ� �Ǹ�, �ΰ��� ��ü�� �ϳ��� ��ü�� �ٶ󺸰� �ȴ�.
		 * �ٸ� �κ��� �ٶ󺸱� ���ؼ��� �ٽ� ���Ӱ� ������ �Ѵ�.
		 * Example) Sam ob1 = new Sam(3)*/
	}

}
