import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		MediaVetor v=new MediaVetor(50);
		for(int i=0;i<50;i++){
			System.out.println("Digite o "+(i+1)+" numero");
		    v.setV(i,in.nextInt());
		}
		float media=v.mediaVetor();
        v.menorQueMedia(media);
	}

}
