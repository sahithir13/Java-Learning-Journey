package javabasics;

public class MethodTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        // 1. No parameter, No return value
		        add();

		        // 2. Parameter, No return value
		        subtract(20, 8);

		        // 3. No parameter, Return value
		        int multiplication = multiply();
		        System.out.println("Multiplication = " + multiplication);

		        // 4. Parameter, Return value
		        int division = divide(20, 5);
		        System.out.println("Division = " + division);
		    }

		    // 1. No parameter, No return value
		    static void add() {
		        int a = 10;
		        int b = 5;
		        int sum = a + b;
		        System.out.println("Addition = " + sum);
		    }

		    // 2. Parameter, No return value
		    static void subtract(int a, int b) {
		        int sub = a - b;
		        System.out.println("Subtraction = " + sub);
		    }

		    // 3. No parameter, Return value
		    static int multiply() {
		        int a = 10;
		        int b = 5;
		        return a * b;
		    }

		    // 4. Parameter, Return value
		    static int divide(int a, int b) {
		        return a / b;
		    }
		}

