package il.ac.tau.cs.sw1.ex2;
import java.util.Arrays;

public class Assignment02Q05 {

	public static void main(String[] args) {
		// do not change this part below
		int N = Integer.parseInt(args[0]);
		int[][] matrix = new int[N][N]; // the input matrix to be
		for(int i=0;i < N; i++){
			for(int j=0; j < N; j++){
				matrix[i][j] = Integer.parseInt(args[1+(i*N)+j]); // the value at [i][j] is the i*N+j item in args (without considering args[0])
			}
		}
		for(int i=0;i < N; i++)
			System.out.println(Arrays.toString(matrix[i]));
		System.out.println("");
		int[][] RotatedMatrix = new int[N][N]; // the transposed matrix
		for(int i=0;i < N; i++){
			for(int j = N-1; j >= 0; j--){
				RotatedMatrix[i][j] = matrix[N-1-j][i]; // the value at [i][j] is the i*N+j item in args (without considering args[0])
			}
		}		
		
		System.out.println("this is fucking awesome")
		// do not change this part below
		for(int i=0;i < N; i++){ 
			System.out.println(Arrays.toString(RotatedMatrix[i])); // this would compile after you would put value in transposedMatrix
		}
	}
}
