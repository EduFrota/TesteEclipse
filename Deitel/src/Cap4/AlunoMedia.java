package Cap4;

import java.util.Scanner;

public class AlunoMedia {
	private int notas, con=0, total=0;
	private double media;
	Scanner sc = new Scanner(System.in);
	
	public void MediaTotal(){
		System.out.print("Enter first grade: ");
		notas = sc.nextInt();
		
		while(notas!=-1){
			total= total+notas;	
			con=con+1;
			System.out.print("Digite a  Nota: ");
			notas = sc.nextInt();
		}
		media = (double) total/con;
		System.out.println("Tota de "+con+" Notas Inseridas"+" Media: "+media);		
	}
	
	
 	

}
