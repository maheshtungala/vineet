package basics;

public class HelloWorld {

	  int value() {
		  return 12;
	  }
	public static void main(String[] args) {
		System.out.println("HelloWorld!");
		HelloWorld h = new HelloWorld();
		h.hello();
         int x = h.value();
         System.out.println(x);
	}
	void hello() {
		System.out.println("Hello!");
		
	}

}
