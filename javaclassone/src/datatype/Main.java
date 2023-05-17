package datatype;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("***********data types************");
		System.out.println();
		
		int salary =45000;
		float temperature=94.66f;
		char initial='d';
		String name="vignesh";
		double percentage=99.99;
		boolean isvalid=true;
		
		System.out.println(" primitive data types .........");
		System.out.println();
		System.out.println("int ,char,float ,byte short ,double ,boolean ");
		
		System.out.println();
		System.out.println("*************** non primitive data types **************");
		System.out.println();
		System.out.println("Array ,String and classes ");
		System.out.println();
		System.out.println();
		
		System.out.println("************** arrays *************");
		System.out.println();
		
		//ways of declaring array 
		
		int marks[]= {200,300,400,500,600,700};
		
		String names[]=new String[5];
		
		char alphabet[]= {'a','b','c','d','e'};
		
		//looping statement 
		
		for(short i=0;i<marks.length;i++) {
			
			System.out.println(marks[i]);
			
		}
		
		//for - each loop 
		
		for(char i:alphabet) {
			
			System.out.println(i);
			
		}
		
		//while loop
		
		int j=0;
		
		while(j<names.length) {
			
			String language="java";
			
			names[j]=language;
			j++;
		}
		

	}

}
