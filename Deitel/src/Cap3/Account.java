package Cap3;

public class Account {
	private double balance;
    private String name;
    
    
    public Account(String name){
    	this.name = name;
    	
    }
    
    public void  setName(String name){
    	this.name = name;	
    }
    public String getName(){
    	return name;
    }
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
    
	public void Deposit(double depositoAmount){
		if(depositoAmount>0.00){
			this.balance+=depositoAmount;
		}
	}

	public void WithDraw(double retirado){
		if(retirado < balance){
			this.balance = this.balance - retirado;
		}else{
			System.out.println("valor não permtido");
		}
	}
	public static void displayAccount(Account d){
		System.out.println("Nome: "+d.name+" Saldo: "+d.balance);
		
	}
		

	
}


