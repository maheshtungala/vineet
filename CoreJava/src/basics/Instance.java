package basics;

public class Instance {
    int i=10;  //instance variable
    void print() {  //instance method
    	System.out.println(i*2);  //instance variable
    }
	public static void main(String[] args) {
		Instance obj = new Instance();  //object
		System.out.println(obj.i);  //instance variable
        obj.print(); //prints 20...
	}

}
