package Cap3;

public class Employe {
	
	private String name;
	private String sobrenome;
	private double salario;
	
	public Employe(String name, String sobrenome, double salario) {
		this.name = name;
		this.sobrenome = sobrenome;
		if(salario>0){
		this.salario = salario;
		}
	}
	
	
public void Anual(){
	
	System.out.println("\nSalario Anual: "+this.salario*12);	
 }
public void aumento(){
	
	System.out.println("\nSalario depois do aumento: "+(this.salario+(this.salario*0.1))*12);
}

public void Informar(){
	System.out.print("Name: "+this.name+"\nSobrenome: "+this.sobrenome+"\nSalario atual: "+ this.salario);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSobrenome() {
	return sobrenome;
}
public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}
}