package Cap3;

public class Invoce {

	private String number;
	private String description;
	private int qte;
	private double price;
	
	public Invoce(String number, String description, int qte, double price) {
		this.number = number;
		this.description = description;
		this.qte = qte;
		this.price = price;
	}


	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void getInvoceAummont( ){
		double all=0;
		if(this.qte < 0 || this.price < 0 ){
			all =0;
			System.out.println("VALOR NEGATIVO NÃO ACEITO: "+all);	
		}else{
			all = this.qte*this.qte;
			System.out.println("Numero: "+this.number+"\nDescrição: "+this.description+"\nValor Total: "+all);;
		}
		
	}
	

}
