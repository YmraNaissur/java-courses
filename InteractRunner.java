import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
*	A class for launching a calculator. Supports user input.
*/
public class InteractRunner {
	/**
	*	A scanner for user input
	*/
	private final Scanner scanner;
	
	/**
	*	A variable, storing exit flag
	*/
	private boolean exit = false;
	
	public static void main(String args[]) {
		/**
		*	Creating main object
		*/
		final InteractRunner runner = new InteractRunner(new Scanner(System.in));
		
		/**
		*	Calculator object
		*/
		final Calculator calc = new Calculator();
		
		while (!runner.isExit()) {		
			/**
			*	Creating an arguments list
			*/
			final List<Double> arguments = runner.argumentsRequest(runner.getScanner(), 2);
			
			// selecting operation
			System.out.println("Select operation (enter \"+\", \"-\", \"*\", \"/\", or \"^\")");
			String operation = runner.getScanner().next();
			
			Double[] requestedArgs = arguments.toArray(new Double[arguments.size()]);
			
			switch (operation) {
				case "+":
					calc.add(requestedArgs);
					break;
				case "-":
					calc.sub(requestedArgs);
					break;
				case "*":
					calc.multi(requestedArgs);
					break;
				case "/":
					calc.div(requestedArgs);
					break;
				case "^":
					calc.pow(requestedArgs);
					break;
			}
			
			System.out.println("Result: " + calc.getResult());
			
			// asking for clearing the result
			System.out.println("Clear result? (yes / no): ");
			if (runner.yesOrNoRequest(runner.scanner).equals("yes")) {
				calc.cleanResult();
			}
			
			// asking for exit
			System.out.println("Exit? (yes / no): ");
			runner.setExit(runner.yesOrNoRequest(runner.scanner));
		}
		
		runner.closeScanner();
	}
	
	/**
	*	InteractRunner class constructor
	*	@param scanner A scanner for user input
	*/
	public InteractRunner(Scanner scanner) {
		this.scanner = scanner;
	}
		
	/**
	*	A getter for Sanner object
	*	@return Scanner object for user input
	*/
	public Scanner getScanner() {
		return this.scanner;
	}
	
	/**
	*	A getter for exit flag
	*	@return Exit flag value (true of false)
	*/
	public boolean isExit() {
		return this.exit;
	}
	
	/**
	*	A setter for exit flag
	*	@param exit A String value "yes" or "no"
	*/
	public void setExit(String exit) {
		this.exit = exit.equals("yes") ? true : false;
	}
	
	/**
	*	A yes or no request.
	*	@param reader A scanner object for user input
	*	@return "yes" or "no" String value
	*/
	public String yesOrNoRequest(Scanner reader) {
		String result = "";
		while (!(result.equals("yes") || result.equals("no"))) {
			result = reader.next();
			switch (result) {
				case "yes":
					result = "yes";
					break;
				case "no":
					result = "no";
					break;
				default:
					System.out.println("Wrong input. Try again.");
					break;
			}
		}
		return result;
	}
	
	/**
	*	Requesting a list of arguments for operation
	*	@param reader A scanner object for user input
	*	@param numberOfArguments A number of arguments to be requested
	*	@return A list of arguments of type Double
	*/
	public List<Double> argumentsRequest(final Scanner reader, final int numberOfArguments) {
		/**
		*	A list of Double values
		*/
		final List<Double> arguments = new ArrayList<Double>();
		
		/**
		*	Temporary variable for placing value, inputed by user
		*/
		Double value = null;
		
		/**
		*	Creating a list of Doubles
		*/
		int i = 1;
		while (i <= numberOfArguments) {
			System.out.println("Enter " + i + " argument: ");
			try {
				arguments.add(Double.valueOf(reader.next()));
				i++;
			} catch (Exception e) {
				System.out.println("Something went wrong. Try again.");
			}
		}
		
		/**
		*	Returning created list
		*/
		return arguments;
	}
	
	/**
	*	Closing a scanner
	*/
	public void closeScanner() {
		this.getScanner().close();
		System.out.println("Scanner closed");
	}
}