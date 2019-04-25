
public class MPreParation3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("(2X2) Çà·ÄÀÇ µ¡¼À");
		
		int A_matrix[][] = {{1, 2}, {3, 4}};
		int B_matrix[][] = {{2, 5}, {4, 7}};
		int result[][] = new int[2][2];
		
		for (int i = 0 ; i < 2 ; i++) {
			for (int j = 0 ; j < 2 ; j++) {
				result[i][j] = A_matrix[i][j] + B_matrix[i][j];
				System.out.print(result[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
