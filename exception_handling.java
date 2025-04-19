package experiments;

public class exception_handling {
	 public static void main(String[] args) {
	        try {
	            int a = 10 / 0;
	        } catch (ArithmeticException e) {
	            System.out.println("Exception caught: " + e);
	        } finally {
	            System.out.println("Finally block executed");
	        }
	    }
}
