package arithmatic;
import java.util.*;

public class Arithmatic {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int num1 = obj.nextInt();
		
		System.out.println("Enter second number:");
		int num2 = obj.nextInt();
		
		int add = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		int mod = num1 % num2;
		
		System.out.println("Addition = " + add);
		System.out.println("Subtraction = " + sub);
		System.out.println("Multiplication = " + mul);
		System.out.println("Division = " + div);
		System.out.println("Modulus = " + mod);
	}
}
