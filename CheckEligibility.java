package ExceptionAssignment;

public class CheckEligibility {
	
	void checkAge(int age) throws AgeException
	{
		if(age<18)
		{
			throw new AgeException("You are not eligible for vote because your age is "+age+", which is less than 18.");
		}
		else
		{
			System.out.println("You are eligible for vote");
		}
	}

}
