package Cap4;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class TesteIfANinhado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if(a >= 90){
			System.out.println(a);  
		}else{
			if(a>=80){
				System.out.println("b");
			}else{
				if(a>=70){
					System.out.println(a);
				}else{
					if(a>=60){
						System.out.println(a);
					}else{
						System.out.println("Não foi escolhido nenhuma!");
					}
				}
			}
		}
	}

}
