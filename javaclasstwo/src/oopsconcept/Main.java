package oopsconcept;

public class Main extends Sub{

	public static void main(String[] args) {
		
		System.out.println(" Main Method ");
		
		staticmethod(); //static method can be called by other static method or non -static method
		
		Main obj=new Main();
		obj.nonstaticmethod();  //non static method can be called by another non -static method not with static method 
		
		addition();
		Sub object=new Sub();
		object.subtraction();
		
		Encapsulation eobject = new Encapsulation();
		eobject.setAccno(113124);
		eobject.setPassword("vicky");
		
		System.out.println(eobject.getAccno());
		System.out.println(eobject.getPassword());
		
	}
	
	public static void staticmethod() {
		
		System.out.println(" static method ");
		
	}
	
	public void nonstaticmethod() {
		
		System.out.println(" non static Method ");
	}

}


