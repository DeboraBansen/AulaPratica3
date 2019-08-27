import java.util.Scanner;


public class Ex01 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int tam=5;
		int soma=0;
		int media=0;
		int[] v=new int[tam];
		System.out.println("digite os valores do vetor:");
		for(int i=0;i<tam;i++){
			v[i]=in.nextInt();
		    soma+=v[i];
		}
		media=soma/tam;
        System.out.println("a media eh = "+media);
		
        for(int i=0;i<tam;i++){
			if(v[i]<media){
				System.out.println("v["+i+"] = "+v[i]);
			}
		}
	}

}
