import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Turma turma= new Turma();
		
		for(int i=0;i<10;i++){
			Estudante aluno=new Estudante();
		    System.out.println("Digite o nome do aluno "+(i+1)+":");
		    aluno.setNome(in.next());
		    for(int j=0;j<4;j++){
		    	System.out.println("Digite a nota "+(j+1)+" :");
		    	aluno.setNotas(j, in.nextFloat());
		    }
		    aluno.mediaEstudante();
		    turma.setAluno(aluno);
		}
		turma.imprimeMedia();

	}

}
