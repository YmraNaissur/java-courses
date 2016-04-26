/**
*	A class maintaining some arithmetical operations
*/
public class Calculator {
	/**
	*	Calculations' result
	*/
	private Double result = new Double(0);
	
	/**
	*	Summarising arguments
	*	@param params Arguments of summarising
	*/
	public void add(final Double ... params) {
		double summ = 0;
		for (Double i: params) {
			summ += i;
		}
		result += summ;
	}
	
	/**
	*	Multiplying arguments
	*	@param params Arguments for multiplication
	*/
	public void multi(final Double ... params) {
		double mult = 1;
		for (double i: params) {
			mult *= i;
		}
		result += mult;
	}
	
	/**
	*	Dividing arguments
	*	@param params Arguments for division
	*/
	public void div(final Double ... params) {
		result += params[0] / params[1];
	}
	
	/**
	*	Subtraction arguments
	*	@param params Arguments for subtraction
	*/
	public void sub(final Double ... params) {
		result += params[0] - params[1];
	}
	
	/**
	*	Powering arguments
	*	@param params Arguments for powering
	*/
	public void pow(final Double ... params) {
		result += Math.pow(params[0], params[1]);
	}
	
	/**
	*	Getting the result of calculations
	*	@return Calculation result
	*/
	public Double getResult() {
		return result;
	}

	/**
	*	Clearing up the calculations' result
	*/
	public void cleanResult() {
		result = new Double(0.0);
	}
}