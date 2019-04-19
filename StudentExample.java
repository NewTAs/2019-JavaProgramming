class Person {
	int age;
	public String name;
	protected int height;
	private int weight;
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
}
public class StudentExample extends Person {

	void set() {
		age = 30;
		name = "ȫ�浿";
		height = 175;
		setWeight(75);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentExample s = new StudentExample();
		s.set();
	}

}
