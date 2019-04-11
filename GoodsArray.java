import java.util.Scanner;

class Good {
	private String name;
	private int price, NumberofStock, sold;

	Good(String n, int p, int nStack, int s) {
		name = n;
		price = p;
		NumberofStock = nStack;
		sold = s;
	}
	
	String getName() {return name;}
	int getPrice() {return price;}
	int getNumberofStock() {return NumberofStock;}
	int getSold() {return sold;}
}

public class GoodsArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Good[] goodsArray;
		goodsArray = new Good[3];
		
		Scanner key = new Scanner(System.in);
		
		for (int i = 0 ; i < goodsArray.length ; i++) {
			String name = key.next();
			int price = key.nextInt();
			int n = key.nextInt();
			int sold = key.nextInt();
			goodsArray[i] = new Good(name, price, n, sold);
		}
		
		for (int i = 0 ; i <goodsArray.length ; i++) {
			System.out.print(goodsArray[i].getName() + " ");
			System.out.print(goodsArray[i].getPrice() + " ");
			System.out.print(goodsArray[i].getNumberofStock() + " ");
			System.out.println(goodsArray[i].getSold() + " ");
		}
	key.close();
	}

}
