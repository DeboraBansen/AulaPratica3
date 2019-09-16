import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		MatrizTransposta m=new MatrizTransposta();
		System.out.println("Digite a matriz 3x2:");
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				m.setMatrizTransposta(i, j, in.nextFloat());
			}
		}
		m.imprimeMatriz();
		System.out.println();
		m.imprimeMatrizTransposta();

	}

}
