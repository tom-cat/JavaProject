package devops.numbers;
public class NumberWords {
	public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.
    }


	private String returnValue = "";
	public String toWords( int number ) {
		returnValue = String.valueOf( number ) ;
		return returnValue.trim() ;


	}



}

