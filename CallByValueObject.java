class MyInt {
	int val;
	MyInt(int i) {
		val = i;
	}
}

class Persan {
	public String name;
	public int age;
	public Persan(String s) {
		name = s;
	}
	
	public void setAge(MyInt i) {
		age = i.val;
		i.val++;
	}
}

public class CallByValueObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persan aPerson = new Persan("ȫ�浿");
		MyInt a = new MyInt(33);
		
		aPerson.setAge(a);
		
		System.out.println(a.val);
	}

}
