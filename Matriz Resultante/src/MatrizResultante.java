
public class MatrizResultante {
	private int[][]  m;
	
	public MatrizResultante(){
		m=new int[3][2];
	}
	
	public boolean setMatrizResultante(int i,int j,int n){
		if(i>=0&&j>=0&&i<3&&j<2){
			m[i][j] =n;
			return true;
			}else{
				return false;
			}
	}
	public int  getMatrizResultante(int i,int j){
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

	

}
