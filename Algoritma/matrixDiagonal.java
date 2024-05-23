import java.util.*;
public class matrixDiagonal {
	public static void main(String[] args) {
		//4. Silahkan cari hasil dari pengurangan dari jumlah diagonal sebuah matrik NxN
		Scanner in = new Scanner(System.in);
		int [][] matrix;
		int [] matrixD1,matrixD2;
		int matrixS;
		
		System.out.print("Masukan Ukuran Matrix NxN: ");
		matrixS = in.nextInt();
		matrix = new int[matrixS][matrixS];
		
		for(int row = 0; row < matrixS; row++){
			for(int col = 0; col < matrixS; col++){
				System.out.print("Masukan Nilai Matrix ["+row+","+col+"]: ");
				matrix[row][col] = in.nextInt();
			}
		}
		
		matrixD1 = new int[matrixS];
		matrixD2 = new int[matrixS];
		
		System.out.println("Matrix:");
		for(int row = 0; row < matrixS; row++){
			for(int col = 0; col < matrixS; col++){
				if(row == col) {
					matrixD1[row] = matrix[row][col];
				}
				
				if(col == (matrixS - row)-1) {
					matrixD2[row] = matrix[row][col];
				}
				System.out.print(matrix[row][col]+"	");
			}
			System.out.println();
		}
		
		System.out.print("Diagonal Pertama: ");
		int sum1 = 0;
		for(int md1 = 0; md1 < matrixS; md1++) {
			sum1 = sum1 + matrixD1[md1];
			System.out.print(matrixD1[md1]);
			if(md1 != matrixS - 1) {System.out.print(" + ");}
			else {System.out.println(" = "+sum1);}
		}
		
		System.out.print("Diagonal Kedua: ");
		int sum2 = 0;
		for(int md2 = 0; md2 < matrixS; md2++) {
			sum2 = sum2 + matrixD2[md2];
			System.out.print(matrixD2[md2]);
			if(md2 != matrixS - 1) {System.out.print(" + ");}
			else {System.out.println(" = "+sum2);}
		}
		
		System.out.println("Maka hasilnya adalah "+sum1+" - "+sum2+" = "+(sum1-sum2));
	}
}