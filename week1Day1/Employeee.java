package week1Day1;


public class Employeee {
	
	String employeeName = "Arish";        
    int employeeId = 013;                 
	float employeeSalary = 25000.00f;     
	boolean eligibleToVote = true;        
	
	public int employeeInfo(int a,int b){     //calling local variable int a,int b to output using return keyword in Method.
		int sum;
		sum=a+b;
		System.out.println(employeeName); 
		return sum;
		
	}
	
	public static void main(String[] args) {
		Employeee obj1= new Employeee();        
		System.out.println(obj1.employeeInfo(5, 5));
		
		
	}

}
