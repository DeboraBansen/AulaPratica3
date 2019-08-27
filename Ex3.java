import java.util.Scanner;


public class Ex3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[][] v=new int[3][2];
		int[][] vt=new int[2][3];
		
		System.out.println("digite uma matriz 3x2");
		
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				v[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				vt[i][j]=v[j][i];
			}
		}
		System.out.println("a matriz:");
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				System.out.println("v["+i+"]["+j+"] = "+v[i][j]);
			}
		}
		System.out.println("a matriz transposta:");
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.println("vt["+i+"]["+j+"] = "+vt[i][j]);
			}
		}

	}

}
