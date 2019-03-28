
public class ExampleQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;
		
		for (i = 1 ; i <= 6 ; i++) {
			for (j = 1 ; j <= 6 ; j++) {
				if (i + j == 6)
					System.out.println(i + " + " + j + " = 6");
				else
					continue;
			}
		}
	}

}
