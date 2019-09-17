import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Matriz A;
		Matriz B;
		
		
		System.out.println("Quantas linhas da matriz A");
		int l=in.nextInt();
		System.out.println("Quantas colunas da matriz A");
		int c=in.nextInt();
		A=new Matriz(l, c);
		
		
		System.out.println("Quantas linhas da matriz B");
		int l2=in.nextInt();
		System.out.println("Quantas colunas da matriz B");
		int c2=in.nextInt();
		B=new Matriz(l2, c2);
		
		if(c!=l2){
			System.out.println("ERRO nao e possivel multiplicar essas matrizes");
		}else{
		System.out.println("Digite sua matriz A");
		for(int i=0;i<l;i++){
			for(int j=0;j<c;j++){
				A.setMatriz(i, j, in.nextFloat());
			}
		}
	
		
		System.out.println("Digite sua matriz B");
		for(int i=0;i<l2;i++){
			for(int j=0;j<c2;j++){
				B.setMatriz(i, j, in.nextFloat());
			}
		}
		float n=0;
		//System.out.println(""+l+" "+c2);
		Matriz C=new Matriz(l, c2);
		for(int i=0;i<l;i++){
			for(int j=0;j<c2;j++){
				for(int k=0;k<c;k++){
			        n+=A.getMatriz(i, k)*B.getMatriz(k, j);
			        //System.out.println(A.getMatriz(i, k));
			    }
				C.setMatriz(i, j, n);
				n=0;
		    }		
		}
		System.out.println();
		C.imprimeMatriz(l,c2);
		}
	}
}
