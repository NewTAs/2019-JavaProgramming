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
		
		System.out.println("행렬의 크기를 입력해주세요.");
		int rows = key.nextInt();
		int cols = key.nextInt();
		
		if (rows <= 0 || cols <= 0) {
			System.out.println("행렬의 크기가 잘못 설정되었습니다.");
			System.out.println("시스템을 종료합니다.");
		}
		else {
			int matrix1[][] = new int[rows][cols];
			int matrix2[][] = new int[rows][cols];
			int result[][] = new int[rows][cols];
			
			System.out.println("1번째 Matrix");
			matrix1 = make_matrix(matrix1, key);
			System.out.println("2번째 Matrix");
			matrix2 = make_matrix(matrix2, key);
			
			System.out.println("결과");
			
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
