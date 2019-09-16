
public class Estudante {
	private String nome;
	private float[] notas;
	private float media;
	
	public Estudante(){
		notas=new float[4];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float[] getNotas() {
		return notas;
	}

	public void setNotas(int i,float nota) {
		notas[i]=nota;
	}
	public float mediaEstudante(){
		int soma=0;
		for(int i=0;i<4;i++){
			soma+=notas[i];
		}
		return media=soma/4;
	}
	

}
