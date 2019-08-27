import java.util.Scanner;


public class Ex2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[][] v=new int[5][5];
		int soma=0;
		
		System.out.println("informe a matriz 5x5:");
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				v[i][j]=in.nextInt();
				if(i>j){
				soma+=v[i][j];
				}
			}
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.println("v["+i+"]["+j+"] = "+v[i][j]);
				}
			}
		
	    System.out.println("a soma dos elemetos da parte inferior da diagonal eh: "+soma);
	}

	}


