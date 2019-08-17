package basics;

public class StaticVariable {
    static int s=50;  //static variable
    void print() {  //instance method
    	System.out.println(s);
    }
	public static void main(String[] args) {
		System.out.println(s);  //static variable ...
		
		StaticVariable obj = new StaticVariable(); 
		obj.print();

	}

}
