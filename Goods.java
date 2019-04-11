
public class Goods {
	
	String name;
	int price, NumberofStock, sold;
	
	/* public Goods() {
	 * 이 생성자를 선언하지 않았을 때는 자동적으로 생기지만, 선언 해 주는 것이 좋다.
	 * } */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    //클래스 명, 객채 명 = new 클래스 명
		Goods camara = new Goods(); //생성자는 객채가 만들어질 때 한 번 호출된다.
		
		camara.name = "Nikon";
		camara.price = 400000;
		camara.NumberofStock = 30;
		camara.sold = 50;
		
		System.out.println("상품 이름 :" + camara.name);
		System.out.println("상품 가격 :" + camara.price);
		System.out.println("재고 수량 :" + camara.NumberofStock);
		System.out.println("팔린 수량 :" + camara.sold);
	}

}
