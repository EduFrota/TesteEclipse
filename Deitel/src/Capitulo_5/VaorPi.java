package Capitulo_5;

public class VaorPi {

	public static void main(String[] args) {
        float result=0;
        
        for(int i=3;i <=100;i+=2){
        	result = result+(result-(4/i));
        }
        System.out.println(result);
	}

}
