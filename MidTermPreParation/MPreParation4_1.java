
public class MPreParation4_1 {

	private int kor, eng, math;
	private String name;
	
	public MPreParation4_1(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getTotal() {
		return (this.kor + this.eng + this.math);
	}
	
	public float getAverage() {
		return (getTotal() / 3.0f);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MPreParation4_1 s = new MPreParation4_1("ȫ�浿", 98, 82, 77);
		
		System.out.println("�̸� :" + s.getName());
		System.out.println("���� :" + s.getTotal());
		System.out.println("��� :" + s.getAverage());
	}

}
