class Person {
	String phone;
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
}

class Professor extends Person {
	public String getPhone() {
		return "Professor :" + super.getPhone();
		//super.getPhone()�� �Ʒ� p.getPhone()�� �޸� ���� ���ε��� �Ͼ�� �ʴ´�.
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Professor a = new Professor();
		a.setPhone("010-1234-5678");
		System.out.println(a.getPhone());
		
		Person p = a;
		System.out.println(p.getPhone());
		//���� ���ε��� ���Ͽ� Professor�� getPhone()�� ȣ���Ѵ�.
	}
	
}
