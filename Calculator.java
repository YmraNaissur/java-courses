/**
*	A class maintaining some arithmetical operations
*/
public class Calculator {
	/**
	*	Calculations' result
	*/
	private int result;
	
	/**
	*	Summarising arguments
	*	@param params Arguments of summarising
	*/
	public void add(int ... params) {
		for (int i: params) {
			result += i;
		}
	}
	
	/**
	*	Getting the result of calculations
	*	@return Calculation result
	*/
	public int getResult() {
		return result;
	}

	/**
	*	Clearing up the calculations' result
	*/
	public void cleanResult() {
		result = 0;
	}
}