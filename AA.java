interface Clock {
	public static final int ONEDAY = 24; // ��� �ʵ� ���� 
	abstract public int getMinute();
	abstract public int getHour();
	abstract void setMinute(int i);
	abstract void setHour(int i);
}
interface Car {
	int MAXIMUM_SPEED = 260; // static final ����
	int moveHandle(int degree); // abstract public ���� 
	int changeGear(int gear); // abstract public ���� }
}
new Clock(); // ����. �������̽��� ��ü ���� �Ұ� 
new Car(); // ����. �������̽��� ��ü ���� �Ұ�
Clock clock; // �������̽� Clock�� ���۷��� ���� ���� ����
Car car; // �������̽� Clock�� ���۷��� ���� ���� ����