
public class Calculator {

	static int add(int a, int b) {
		return a + b;
	}

	static int sub(int a, int b) {
		return a - b;
	}

	static int multiply(int a, int b) {
		return a * b;
	}

	static int div(int a, int b) {
		return a / b;
	}

	static void print(int result) {
		System.out.println("RESULT:" + result);
	}

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 10;
		int num3 = 10;
		
		int addResult = Calculator.add(num1, num2);
		print(addResult);
		int subResult = Calculator.sub(num1, num2);
		print(subResult);
		int multiplyResult = Calculator.multiply(num1, num2);
		print(multiplyResult);
		int divResult = Calculator.div(num2, num3);
		print(divResult);
		
	}

}
