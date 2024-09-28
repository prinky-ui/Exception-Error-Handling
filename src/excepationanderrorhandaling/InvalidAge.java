package excepationanderrorhandaling;

public class InvalidAge {

	public static void main(String[] args) {
	String name = args[0];
	
	try
	{
	vote(20);
	}
	
	catch(Exception e) {
		
	}
	
      }
	public static void vote(int age) throws InvalidAgeException {
	
	
	if (age<=18)
	{
		throw new InvalidAgeException ("Not Eligiable for Voting");
		}
	else 
	{
		System.out.println("Eligiale for voting");
	}
	
		
	}

}
