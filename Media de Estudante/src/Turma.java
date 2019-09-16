
public class Turma {
	private Estudante[]  alunos;
	private int quantAtual;
	
	public Turma(){
		alunos=new Estudante[10];
	}

	public Estudante[] getAluno() {
		return alunos;
	}

	public void setAluno(Estudante aluno) {
		alunos[quantAtual] = aluno;
		quantAtual++;
	}
	public void imprimeMedia(){
		Estudante aux;
		for(int i=1;i<10;i++){
			for(int j=0;j<i;j++){
			if(alunos[i].mediaEstudante()>alunos[j].mediaEstudante()){
				aux=alunos[j];
				alunos[j]=alunos[i];
				alunos[i]=aux;
			}
			}
		}
		for(int i=0;i<10;i++){
			System.out.println("aluno: "+alunos[i].getNome()+" media: "+alunos[i].mediaEstudante());
		}
	}



}
