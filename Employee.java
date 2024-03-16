package in.cdac.kharghar;

public class Employee {
	  public static void emp(String name , String surname , int empid , float salary){
		  System.out.println(name + surname + empid + salary );
	  }
	  public static void emp(String name , String surname , int empid , float salary,String comname) {
		  System.out.println(name + surname + empid + salary );
	  }

	public static void main(String[] args) {
        String name = "snehal ";
        String surname= "patilr";
        int empid = 01;
        float salary = 45000;
        String comname = "kkk";
        Employee.emp(name, surname, empid, salary);
        Employee.emp(name, surname, empid, salary,comname);
        
	}

}
