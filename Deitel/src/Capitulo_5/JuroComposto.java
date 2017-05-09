package Capitulo_5;

public class JuroComposto {
	public static void main(String[] args) {
	  double a=1;
	  System.out.printf("%s%20s %n", "Year","Amount in deposito");
	  
       for(int i=1;i<=10;i++){
    	   a = (a*(1+0.05))*1000;     	     	
          System.out.println(" " +i+" "+a);
       }
       
	}

}
