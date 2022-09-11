package demoPackage;


/*  variable -  Instance variable, Local Variable Static variable.
 *  
 *  Instance Variable -  inside the class but out side from any methods of the class. 
 *  
 */

public class Variables {
	
	// Instance variable - global variable , class variable. 
	
	 int a;            // Static Variable
	 int b;
	 int result;
	

	public static void sum(){
	
		Variables obj = new Variables();
		
		obj.a =40;
		obj.b =69;
		obj.result =obj.a+obj.b;
		
		System.out.println(obj.result);
		
		int d = 50;   // Inside the block or method -  local variable or private variable. 
			
	}
	
	public void minus() {
		
		a = 89;
		b = 78;
		result = a-b;
		
		System.out.println(result);
		
	}
	
	
	public static void main(String[] args) {
		
		sum();
		
		Variables obj = new Variables();
		
		obj.minus();
		
		sum();
		
	}

}
