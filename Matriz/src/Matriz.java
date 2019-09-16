
public class Matriz {
	private int [][] m;
	
	public Matriz(int cont){
		m=new int[cont][cont];
		
	}
	public boolean setMatriz(int i,int j,int n){
		if(i>=0&&j>=0&&i<m.length&&j<m.length){//sem certeza se vai dar certo
		m[i][j] =n;
		return true;
		}else{
			return false;
		}
		
	}
	public int getMatriz(int i,int j){
		if(i>=0&&j>=0&&i<m.length&&j<m.length){
		return m[i][j];
		}
		return -1;	
	}
	public void somaMatriz(){
		int soma=0;
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m.length;j++){
				if(i>j){
			      soma+=m[i][j];
				}
			}
		}
		System.out.println("soma = "+soma);
	}
	public void imprimeMatriz(){
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m.length;j++){
				System.out.print(" "+m[i][j]);
			}
			System.out.println();
		}
	}

}
