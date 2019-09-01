import java.util.Scanner;


public class Ex5 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int turma=10;
		String[]  nome=new String[10];
		int[] notas=new int[40];
		int[] media=new int[10];
		
		
		
		for(int i=0;i<turma;i++){
			int soma=0;
			System.out.println("digite o nome do estudante:");
			nome[i]=in.next();
			System.out.println("digite as 4 notas do aluno:");
			media[i]=0;
			for(int j=0;j<4;j++){
				notas[j]=in.nextInt();
				soma+=notas[j];
			}
			media[i]=soma/4;
		}
		int aux=0;
		String auxn;
		
		for(int i=0;i<turma;i++){
			for(int j=0;j<turma;j++){
			if(media[i]<media[j]){
				aux=media[j];
				media[j]=media[i];
				media[i]=aux;
				auxn=nome[j];
				nome[j]=nome[i];
				nome[i]=auxn;
			}
			}
			
			
		}
		for(int i=0;i<turma;i++){
			System.out.println(""+nome[i]+""+media[i]);
		}
		

	}

}
