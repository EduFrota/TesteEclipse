package Capitulo_5;

public class AutoPolicy {
	private	 int accountNumber;//Armazena o numero da áplice
	private String MakeANdModel;//marca e modelo do carro
    private String State;//Siglado estado da APlolice
	
	public AutoPolicy(int accountNumber, String makeANdModel, String state) {
		this.accountNumber = accountNumber;
		this.MakeANdModel = makeANdModel;
		this.State = state;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getMakeANdModel() {
		return MakeANdModel;
	}

	public void setMakeANdModel(String makeANdModel) {
		MakeANdModel = makeANdModel;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}
	
	public Boolean isNoFaultState(){
		boolean noFautState;
		switch (State) {
		case "MA":
			  noFautState = true;
			break;
		case "NJ":
			  noFautState = true;
			break;
		case "NY":
			  noFautState = true;
			break;
		case "PA":
			  noFautState = true;
			break;
		default:
			noFautState = false;
			break;
		}
		return noFautState;
	}

}
