
public class Goods {
	
	String name;
	int price, NumberofStock, sold;
	
	/* public Goods() {
	 * �� �����ڸ� �������� �ʾ��� ���� �ڵ������� ��������, ���� �� �ִ� ���� ����.
	 * } */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    //Ŭ���� ��, ��ä �� = new Ŭ���� ��
		Goods camara = new Goods(); //�����ڴ� ��ä�� ������� �� �� �� ȣ��ȴ�.
		
		camara.name = "Nikon";
		camara.price = 400000;
		camara.NumberofStock = 30;
		camara.sold = 50;
		
		System.out.println("��ǰ �̸� :" + camara.name);
		System.out.println("��ǰ ���� :" + camara.price);
		System.out.println("��� ���� :" + camara.NumberofStock);
		System.out.println("�ȸ� ���� :" + camara.sold);
	}

}
