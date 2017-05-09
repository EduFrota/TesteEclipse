import java.util.Scanner;

public class Criptografia {
     int messenger, milesimo, centena, dezena, unidade, messenger_Criptografada;
          
     public void Entrada_Dados(){
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Digite o Numero: ");
    	 messenger = sc.nextInt();
    	 
     }
     public void Criptografar(){
    	 System.out.print(" Numero Recibido: "+messenger);
    	 if(messenger <= 9999 ){
    		milesimo = messenger/1000;
    		centena = (messenger%1000)/100;
    		dezena = (messenger%100)/10;
    		unidade = (messenger%10);
    		messenger_Criptografada = unidade+7+((dezena+7)*10)+((centena+7)*100)+((milesimo+7)*1000);
    		System.out.println("numero Criptografado: "+messenger_Criptografada);	
    		 
     }else{
    	 System.out.println("  Numero Invalido!");
     }
    	 
     }
}
