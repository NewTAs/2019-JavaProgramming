class Sample {
	public int a;
	private int b;
	/* default */ int c;
	
	/* ������ ���� �ʰ� b�� ���� �ֱ� ���� ��� */
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
		/* ����
		aClass.a = 10;
		aClass.b = 10;
		aClass.c = 10; */
		
		aClass.a = 10;
		aClass.setB(10);
		aClass.c = 10;
	}

}
