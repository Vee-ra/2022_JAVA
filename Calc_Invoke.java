
public class Calco {
	
	int add(int a, int b) {
		return a+b;
	}
	int sub(int a, int b) {
		return a-b;
	}
	int multiply(int a, int b) {
		return a*b;
	}
	int div(int a, int b) {
		return a/b;
	}
	 void print(int result) {
		System.out.println("Result: " + result);
	}

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 13;
		int num3 = 10;
		
		Calco a = new Calco();
		
		int add = a.add(num1, num2);
		a.print(add);
		
		int sub = a.sub(num1, num2);
		a.print(sub);
		
		int multiply = a.multiply(num1, num2);
		a.print(multiply);
		
		int div = a.div(num1, num3);
		a.print(div);
		
		}
}
