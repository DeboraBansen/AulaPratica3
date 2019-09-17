
public class Matriz {
	private float[][]  m;
	
	public Matriz(int i,int j){
		m=new float[i][j];
	}

	public boolean setMatriz(int i,int j,float n){
		if(i>=0&&j>=0){
			m[i][j]=n;
			return true;
		}else{
			return false;
		}
		
	}
	
	public float getMatriz(int i,int j){
		return m[i][j];
	}
	public void imprimeMatriz(int l,int c){
		for(int i=0;i<l;i++){
			for(int j=0;j<c;j++){
				System.out.print("  "+m[i][j]);
			}
			System.out.println();
		}
	}
	
}

