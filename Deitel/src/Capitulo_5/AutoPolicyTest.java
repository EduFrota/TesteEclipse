package Capitulo_5;

public class AutoPolicyTest {

	public static void main(String[] args) {
       AutoPolicy a = new AutoPolicy(1, "Palio Fiat", "MA");
       AutoPolicy b = new AutoPolicy(2, "F100 Ford", "PI");
       PolicyTest(a);
       PolicyTest(b);
        
      	}

	public static void PolicyTest(AutoPolicy policy){
		System.out.println("The Auto Policy");
		System.out.println(policy.getAccountNumber()+policy.getMakeANdModel()+policy.getState()+
		(policy.isNoFaultState() ? "is":"is not"));
		
	}
}
