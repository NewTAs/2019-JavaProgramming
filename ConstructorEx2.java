class ConsA {
	ConsA(int a) {
		System.out.println("�Ű����� ������A ");
	}
}

class ConsB extends ConsA {
	/*  �̷��� �ۼ��ϸ� ConsB()�� ���� ������ �߻��Ѵ�.
	ConsB() {
		System.out.println("�Ű����� ������B ");
	}
	*/ 
	
	//�ذ���
	ConsB() {
		super(1);
		System.out.println("�Ű����� ������B ");
	}
}

public class ConstructorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConsB b = new ConsB();
	}

}
