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
		//super.getPhone()은 아래 p.getPhone()과 달리 동적 바인딩이 일어나지 않는다.
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
		//동적 바인딩에 의하여 Professor의 getPhone()을 호출한다.
	}
	
}
