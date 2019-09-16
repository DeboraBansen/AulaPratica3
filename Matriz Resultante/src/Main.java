import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		MatrizResultante m1=new MatrizResultante();
		MatrizResultante m2=new MatrizResultante();
		System.out.println("Digite a matriz A 3x2:");
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				m1.setMatrizResultante(i, j, in.nextInt());
			}
		}
		System.out.println("Digite a matriz B 3x2:");
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				m2.setMatrizResultante(i, j, in.nextInt());
			}
		}
		MatrizResultante m3=new MatrizResultante();
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				if(i<=j){
					m3.setMatrizResultante(i, j, m1.getMatrizResultante(i, j));
				}else{
					m3.setMatrizResultante(i, j, m2.getMatrizResultante(i, j));
				}
			}
		}
		m3.imprimeMatriz();

	}

}
