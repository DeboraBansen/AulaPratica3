import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Matriz m=new Matriz(5);
		System.out.println("Digite a matriz 5x5");
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				m.setMatriz(i, j, in.nextInt());
			}
				
			}
		m.imprimeMatriz();
		m.somaMatriz();
	}

}
