class Person {
	public String name;
	public int age;
	
	public Person(String s) {
		name = s;
	}
	
	public void setAge(int n) {
		age = n;
		n++;
	}
}

public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person aPerson = new Person("ȫ�浿");
		int a = 33;
		
		aPerson.setAge(a);
		System.out.println(a);
	}

}
