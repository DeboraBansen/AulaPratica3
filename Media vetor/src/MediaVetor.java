
public class MediaVetor {
	private int [] v;

	public MediaVetor(int cont){
		v=new int[cont];
	}

	public int getV(int pos) {
		if(pos>=0&&pos<v.length){
		return v[pos];
		}else{
			return -1;
		}
	}
    public void setV(int pos, int n) {
		if(pos>=0&&pos<v.length){
		   v[pos]=n;
		}
	}
    public float mediaVetor(){
    	float soma=0;
    	for(int i=0;i<v.length;i++){
    		soma+=v[i];
    	}
    	System.out.println("a media eh "+(soma/v.length));
    	return soma/v.length;
    	
    }
	public void menorQueMedia(float media){
		for(int i=0;i<50;i++){
			if(v[i]<media){
				System.out.println("v["+i+"] = "+v[i]);
			}
		}
	}
	

}
