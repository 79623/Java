public class Vehicle {
	public static void sum(int a, float b){
		float sum = a+b;
		return  a + b;
	
	}
	public void sum(float b,int a){
		float sum = a+b;
        return  a + b;
		
		
	}
public static void main(String[] args) {
	System.out.println("sum   : " + sum(10,12.5f));
    System.out.println("sum   : "+ sum(12.5f,10)););
    
}

}

