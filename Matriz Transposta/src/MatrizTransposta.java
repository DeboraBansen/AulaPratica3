
public class MatrizTransposta {
	private float[][] m;
	
	public MatrizTransposta(){
		m=new float[3][2];
	}
	
	public boolean setMatrizTransposta(int i,int j,float n){
		if(i>=0&&j>=0&&i<3&&j<2){
			m[i][j] =n;
			return true;
			}else{
				return false;
			}
	}
	public float getMatrizTransposta(int i,int j){
		if(i>=0&&j>=0&&i<3&&j<2){
		return m[i][j];
		}
		return -1;
	}
	
	public void imprimeMatriz(){
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				System.out.print(" "+m[i][j]);
			}
			System.out.println();
		}
	}
	
	public void imprimeMatrizTransposta(){
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.print(" "+m[j][i]);
			}
			System.out.println();
		}
	}

}
