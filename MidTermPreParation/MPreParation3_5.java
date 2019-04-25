import java.util.Scanner;
public class MPreParation3_5 {

	public static int[][] make_matrix(int matrix[][], Scanner key) {
		for (int i = 0 ; i < matrix.length ; i++) {
			for (int j = 0 ; j < matrix[i].length ; j++) {
				System.out.print("(" + i + "," + j + ") :");
				matrix[i][j] = key.nextInt();
			}
		}
		
		for (int i = 0 ; i < matrix.length ; i++) {
			for (int j = 0 ; j <matrix.length ; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		return matrix;
	}
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("����� ũ�⸦ �Է����ּ���.");
		int rows = key.nextInt();
		int cols = key.nextInt();
		
		if (rows <= 0 || cols <= 0) {
			System.out.println("����� ũ�Ⱑ �߸� �����Ǿ����ϴ�.");
			System.out.println("�ý����� �����մϴ�.");
		}
		else {
			int matrix1[][] = new int[rows][cols];
			int matrix2[][] = new int[rows][cols];
			int result[][] = new int[rows][cols];
			
			System.out.println("1��° Matrix");
			matrix1 = make_matrix(matrix1, key);
			System.out.println("2��° Matrix");
			matrix2 = make_matrix(matrix2, key);
			
			System.out.println("���");
			
			for (int i = 0 ; i < rows ; i++) {
				for (int j = 0 ; j < cols ; j++) {
					result[i][j] = matrix1[i][j] + matrix2[i][j];
					System.out.print(result[i][j] + "\t");
				}
				System.out.println();
			}
		}
		
		key.close();
		
	}
}
