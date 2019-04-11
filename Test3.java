class Testing {
	//필드 영역
	int age;
	String name;
	
	public String getName() {
		return name; //인스턴스 변수(=필드영역에 있는 변수)를 변환시킴
	}
	
	public void setName(String n) {
		name = n;
	}
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Testing t = new Testing(); //t 객체 선언 및 생성
		t.name="홍길동"; //객채명. 인스턴스명(필드 영역에 있는 변수명)
		System.out.println(t.name); //'홍길동' 출력
		
		t.setName("동길홍");
		System.out.println(t.name); //'동길홍' 출력
		System.out.println(t.getName()); //'동길홍' 출력
	}

}
