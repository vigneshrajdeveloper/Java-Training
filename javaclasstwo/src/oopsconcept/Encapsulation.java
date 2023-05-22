package oopsconcept;

public class Encapsulation {
	
	//protecting of data 
	
	private int accno;
	private String password ;
	
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	protected void display() {
		System.out.println("your acc no : " +accno+" your pwd : "+password);
		
	}
	

}
