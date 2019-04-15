class Sample {
	public int a;
	private int b;
	/* default */ int c;
	
	/* 오류가 나지 않고 b에 값을 넣기 위한 방법 */
	public int getB() {
		return b;
	}
	public void setB(int value) {
		b = value;
	}
/*  Sample() {} */
}

public class AccessEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample aClass = new Sample();
		/* 오류
		aClass.a = 10;
		aClass.b = 10;
		aClass.c = 10; */
		
		aClass.a = 10;
		aClass.setB(10);
		aClass.c = 10;
	}

}
