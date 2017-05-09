package Cap3;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class AcounntTest {

	public static void main(String[] args) {
		   String name;
		   double deposit;
		   double retirado;
		   Scanner input = new Scanner(System.in);
           Account bb  = new Account("Jeen");
           System.out.print("Type the amount the aumont deposit: ");
           deposit = input.nextDouble();
           System.out.print("Type the amout retirado: ");
           retirado = input.nextDouble();
           bb.Deposit(deposit);
           bb.WithDraw(retirado);
           bb.displayAccount(bb); 
         
           
           
           
	}
}
