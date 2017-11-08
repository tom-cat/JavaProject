package devops.numbers;
public class NumberWords {

public static void main(String[] args) {
Scanner reader = new Scanner(System.in); 

System.out.println("Enter Number");
int n = reader.nextInt();
}
	private String returnValue = "";
	public String toWords( int number ) {
		returnValue = String.valueOf( number ) ;
		return returnValue.trim() ;


	}



}

