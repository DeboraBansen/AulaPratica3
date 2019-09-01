
import java.util.Scanner;


public class Ex6 {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int iA=0,jA=0;
		int iB=0,jB=0;
		
		
		System.out.println("digite o numero de linhas e colunas da matriz A");
		iA=in.nextInt();
		jA=in.nextInt();
		
		System.out.println("digite o numero de linhas e colunas da matriz B");
		iB=in.nextInt();
		jB=in.nextInt();
		
		int[][] A=new int [iA][jA];
		int[][] B=new int [iB][jB];
		int[][] AB=new int [iA][jB];
		
		for(int i=0;i<iA;i++){
			for(int j=0;j<jB;j++){
				AB[i][j]=0;			
			}		
		}
		
		
		if(jA==iB){
			System.out.println("informe a matriz A");
			for(int i=0;i<iA;i++){
				for(int j=0;j<jA;j++){
					A[i][j]=in.nextInt();			
				}		
			}
			System.out.println("informe a matriz B");
			for(int i=0;i<iB;i++){
				for(int j=0;j<jB;j++){
					B[i][j]=in.nextInt();			
				}		
			}
			
			
			for(int i=0;i<iA;i++){
				for(int j=0;j<jB;j++){
					for(int k=0;k<jA;k++){
				        AB[i][j]+=A[i][k]*B[k][j];
				    }		
			    }		
			}
		
		for(int i=0;i<iA;i++){
			for(int j=0;j<jB;j++){
				System.out.print(" "+AB[i][j]+"  ");			
			}
			System.out.println("\n");
		}
		}else{
			System.out.println("ERRO!nao eh possivel mutiplicar");
		}
		
	}
}
