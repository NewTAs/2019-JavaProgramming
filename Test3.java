class Testing {
	//�ʵ� ����
	int age;
	String name;
	
	public String getName() {
		return name; //�ν��Ͻ� ����(=�ʵ念���� �ִ� ����)�� ��ȯ��Ŵ
	}
	
	public void setName(String n) {
		name = n;
	}
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Testing t = new Testing(); //t ��ü ���� �� ����
		t.name="ȫ�浿"; //��ä��. �ν��Ͻ���(�ʵ� ������ �ִ� ������)
		System.out.println(t.name); //'ȫ�浿' ���
		
		t.setName("����ȫ");
		System.out.println(t.name); //'����ȫ' ���
		System.out.println(t.getName()); //'����ȫ' ���
	}

}
