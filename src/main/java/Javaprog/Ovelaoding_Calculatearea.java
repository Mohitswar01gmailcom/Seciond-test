package Javaprog;
//https://www.codejava.net/ides/eclipse/25-eclipse-shortcut-keys-for-code-editing
public class Ovelaoding_Calculatearea {

	public int Area(int x, int y) {
		return (x * y);
	}

	public double Area(double x, double y) {
		return (x * y);
	}
	
	public int Area(int x) {
		return (x * x);
	}
	
	

	public static void main(String[] args) {
		
		Ovelaoding_Calculatearea obj1=new Ovelaoding_Calculatearea();
		 System.out.println(obj1.Area(5, 5)); 
	     System.out.println(obj1.Area(4.5,10.4)); 
	     System.out.println(obj1.Area(5)); 
	        

	}

}
