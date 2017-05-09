package Cap4;

public class Student {
	private String name;
	private double avarege;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getAvarege() {
		return avarege;
	}


	public void setAvarege(double avarege) {
		this.avarege = avarege;
	}


	public Student(String name, double avarege) {
		this.name = name;
		
		if(avarege>0.0)
			if(avarege<=100.0)
		      this.avarege = avarege;
	}
	public String getLetterGrade() {
		String letterGrade ="";
		if(avarege >=90)
			letterGrade = "A";
		else if (avarege>=80.0) 
			letterGrade ="B";
		else if (avarege>=70.0) 
			letterGrade ="c";
		else if (avarege>=60)
			letterGrade = "d";
		else 
			letterGrade = "Reprovado";
		System.out.println("\nNome: " +name+"\nNota: "+avarege+"\nSituação: "+letterGrade);
		return letterGrade;
		
		
	}
	         
}
