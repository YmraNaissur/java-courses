public class Calculate {
	public static void main(String[] args) {
		System.out.println("Calculate...");
		
		Calculate calc = new Calculate();
		
		double first = Double.valueOf(args[0]);
		double second = Double.valueOf(args[1]);
		
		// summarising
		System.out.println("Summarising = " + calc.summ(first, second));
		// subtraction
		System.out.println("Subtraction = " + calc.sub(first, second));
		// division
		System.out.println("Division = " + calc.div(first, second));
		// multiply
		System.out.println("Multiplication = " + calc.multi(first, second));
		// powering
		System.out.println("Powering = " + calc.power(first, second));
	}
	
	/**
	*	A method for summarising
	*/
	public double summ (double first, double second) {
		return first + second;
	}
	
	/**
	*	A method for subtraction
	*/
	public double sub (double first, double second) {
		return first - second;
	}
	
	/**
	*	A method for division
	*/
	public double div (double first, double second) {
		return first / second;
	}
	
	/**
	*	A method for multiplication
	*/
	public double multi (double first, double second) {
		return first * second;
	}
	
	/**
	*	A method for powering
	*/
	public double power (double first, double second) {
		return Math.pow(first, second);
	}
}