
class CurrencyConverter {

	private static double rate;
	public static double toDollar(double won) {
		return won / rate;
	}
	public static double toKWR(double dollar) {
		return dollar * rate;
	}
	public static void setRate(double r) {
		rate = r;
	}
}

public class StaticMember {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CurrencyConverter.setRate(1137.50);
		System.out.println("백만원은 " + CurrencyConverter.toDollar(1000000) + "달러 입니다.");
		System.out.println("백달러는 " + CurrencyConverter.toKWR(100) +"원 입니다.");
	}

}
