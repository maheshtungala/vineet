package basics;

public class Local {
    void print() {
    	int x=25; //local to print method
    	System.out.println("Local variable from print " +x);
    }
	public static void main(String[] args) {
		int x=10;  //local to main method
		System.out.println("Local variable from main " +x);
		
		Local obj = new Local();
		obj.print();

	}

}
