package Cap4;

import java.util.Scanner;

public class ResultTest {

	public static void main(String[] args) {
		int result,quantA=0,quantR=0,contador=1;
		Scanner sc = new Scanner(System.in);
		while(contador<=10){
		System.out.print("Dogite o resultado: ");
		result = sc.nextInt();
		if(result == 1){
			quantA = quantA+1;
		}else if(result == 2){
			quantR = quantR+1;
		}
	  
    	contador = contador+1;		
	}
		if(quantA>=8){
			System.out.println("Parabéns ao Instrutor ganhou Bonus! Aprovados: "+quantA+"Reprovados: "+quantR);
	}else{
		System.out.println("Aprovados: "+quantA+"Reprovados: "+quantR);
	}
	
		
	}
}
