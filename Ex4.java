import java.util.Scanner;


public class Ex4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[][] A=new int[3][2];
		int[][] B=new int[3][2];
		int[][] C=new int[3][2];
		System.out.println("digite a matriz A 3x2");
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				A[i][j]=in.nextInt();
			}
		}
		System.out.println("digite a matriz B 3x2");
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				B[i][j]=in.nextInt();
			}
		}
		//Se i  ≤  j então  C(i, j) = A(i, j), senão  C(i, j) = B(i, j).
        //Onde C = matriz resultante, A = matriz 3X2 e B = matriz 3X2.
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				if(i<=j){
				C[i][j]=A[i][j];
				}else{
					C[i][j]=B[i][j];
				}
			}
		}
		System.out.println("  MATRIZ C");
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				System.out.print("  "+C[i][j]);
			}
			System.out.println("\n");
		}

	}

}
