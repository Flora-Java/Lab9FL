import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayofStudents {

	// Flora Lopez  April 2019
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] students = {"Maria", "Jose", "Claudia", "Jorge", "Ramon", "Chelo", "Alberto","Miriam"};
		String[] homtow = {"Troy", "Pontiac", "Paris","Rome","Cordoba", "Detroit", "Dearborn","Tulsa"};
		String[] favFood = {"pizza", "soup", "pork", "noodles", "salad", "nuts","veggies","cake"};
		
		String contin = "yes"; 
		String extraInf;
		int numStudent = -1 ;
		
		System.out.println("Welcome to our javaclass.");

	   do {
		System.out.println("Which student would you like to learn more about? ");
		System.out.print("(enter a number 1-8): ");

	   try {
		   numStudent = scan.nextInt() - 1 ;
		   scan.nextLine();
	   } catch (InputMismatchException e) {
		   System.out.println("You must enter a whole number!");
		   break;
	   } 
	
		try {   
			System.out.println("Student " + (numStudent+1)+ " is " + students[numStudent]);
			System.out.println("what would you like to know about " + students[numStudent] + "?");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("That student does not exist. Please try again. (enter a number 1 - 8)");
			continue;
		}
		    System.out.println("(enter \"home town\" or \"favorite food\")");
	   
			do {
				extraInf = scan.nextLine();
			
				if (extraInf.equalsIgnoreCase("home town")) {
					System.out.println(students[numStudent] + " is from " + homtow[numStudent]);
					
				} else if (extraInf.equalsIgnoreCase("favorite food")) {
					System.out.println(students[numStudent] + "'s favorite food is: " + favFood[numStudent]);
				} else {
					System.out.println("That data does not exist. Please try again. (enter \"hometown\" or \"favorite food\"):");
					continue;
				}
					
			} while (!(extraInf.equalsIgnoreCase("hometown") ||  extraInf.equalsIgnoreCase("favorite food")));
	
		System.out.println("Would you like to know more? (enter \"yes\" or \"no\"): ");
		contin = scan.next();
		
	   } while (contin.equalsIgnoreCase("yes")) ;
		

	}
	public static boolean checkSizeOfArray(int number) {
		if (number >= 0 && number < 10) {
			return true;
		} else {
			return false;
		}
					
	}

}
