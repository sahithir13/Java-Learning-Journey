package javabasics;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var a = 10;
		var b = 5;
		System.out.println("Arithmatic Operators:");
		System.out.println("Addition(a+b): "+(a+b));
		System.out.println("Subbstraction(a-b): "+(a-b));
		System.out.println("Multiplication(a*b): "+(a*b));
		System.out.println("Division(a/b): "+(a/b));
		System.out.println("Modulus(a%b): "+(a%b));
		System.out.println("\nRational Operators:");
		System.out.println("Equal to (a==b): "+(a==b));
		System.out.println("Not equal to (a!=b): "+(a!=b));
		System.out.println("Greater than (a>b): "+(a>b));
		System.out.println("Less than (a<b): "+(a<b));
		System.out.println("Greater than or equal to (a>=b): "+(a>=b));
		System.out.println("less than or equal to (a<=b): "+(a<=b));
		var x = true;
		var y = false;
		System.out.println("\nLogical Operators:");
		System.out.println("Logical AND (x&&y): "+(x&&y));
		System.out.println("Logical OR (x||y): "+(x||y));
		System.out.println("Logical NOT (!x): "+(!x));
		var c = 6;
		var d = 2;
		System.out.println("\nBitwise Operator:");
		System.out.println("Bitwiise AND (c&d): "+(c&d));
		System.out.println("Bitwise OR (c|d): "+(c|d));
		System.out.println("Bitwise XOR (c^d): "+(c^d));
		System.out.println("Bitwise Compliment (~c): "+(~c));
		System.out.println("Left shift (c<<d): "+(c<<d));
		System.out.println("Right shift (c>>d): "+(c>>d));
		System.out.println("Unsigned right shift(c>>>d): "+(c>>>d));
		var e = 0;
		System.out.println("\nAssignment Operators: ");
		e = a;
		System.out.println("Assignment (e=a): "+e);
		e += b;
		System.out.println("Add and assign (e += b): "+e);
		e -= b;
		System.out.println("Substract and assign (e -= b): "+e);
		e *= b;
		System.out.println("Multiply and assign (e *= b): "+e);
		e /= b;
		System.out.println("Divide and assign (e /= b): "+e);
		e %= b;
		System.out.println("Modulus and assign (e %= b): "+e);
		System.out.println("\nUnary Operators:");
		e = +a;
		System.out.println("Unary plus (+a): "+e);
		e = -a;
		System.out.println("Unary minus (-a): "+e);
		e = ++a;
		System.out.println("Pre-increement (++a): "+e);
		e = a++;
		System.out.println("Post-increement (a++): "+e);
		e = a--;
		System.out.println("Post-decreement (a--): "+e);
		e = --a;
		System.out.println("Pre-decrement (--a): "+e);
		System.out.println("\nTernary Operator:");
		var result = (a>b) ? "a is greater than b" : "a is not greater than b";
		System.out.println(result);
		
	}

}
