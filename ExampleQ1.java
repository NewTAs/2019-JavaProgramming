
public class ExampleQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0, i = 0;
		
		for (i = 0 ; i <= 20 ; i++) {
			if (i % 2 == 0)
				continue;
			else if (i % 3 == 0)
				continue;
			else
				sum += i;
		}
		System.out.println("°á°ú: " + sum);
	}

}
