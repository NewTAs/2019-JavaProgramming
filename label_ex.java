
public class label_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for(int i = 0 ; i < 3 ; i++) {
			AA:
				for(int j = 0 ; j < 5 ; j++) {
					if (j==3)
						break AA;
				System.out.println("i = " + i + "j = " + j);
				}
		}
	}

}
