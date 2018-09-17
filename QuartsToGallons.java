//importing java scanner
import java.util.Scanner;
//declaring class name
public class QuartsToGallons
{	//main shell
	public static void main(String[] args)
	{
		//constant
		final int QUARTS_IN_GALLON = 4;
		//setting int variable names to have future value
		int quartsNeeded;
		int gallonsNeeded;
		int extraQuarts;
		//establishing scanner
		Scanner keyboard = new Scanner(System.in);
		//output user for quarts needed
		System.out.print("Enter quarts needed for job >> ");
		//saves it in an integer variable
		quartsNeeded = keyboard.nextInt();
		//calculations
		gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
		extraQuarts = quartsNeeded %  QUARTS_IN_GALLON;
		//echos to the user the results
		System.out.println("A job that needs " + quartsNeeded + " quarts requires us to buy " + gallonsNeeded + " gallons plus " + extraQuarts + " extra quarts.");
	}
}