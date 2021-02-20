package ExceptionAssignment;

import java.util.Scanner;

public class AgeApp {

	public static void main(String[] args) throws AgeException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
       CheckEligibility ce=new CheckEligibility();
       ce.checkAge(age);
	}

}
