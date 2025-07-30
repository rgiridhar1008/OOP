package Sample_code;
import java.util.*;


public class Q7 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        double average = (a + b + c) / 3.0;
        System.out.println("Average: " + average);

        boolean logicalCheck = (a > b) && (b < c);
        System.out.println("Logical AND (a > b && b < c): " + logicalCheck);

        int bitwiseAnd = a & b;
        int bitwiseOr = a | b;
        int bitwiseXor = a ^ b;
        System.out.println("Bitwise AND (a & b): " + bitwiseAnd);
        System.out.println("Bitwise OR (a | b): " + bitwiseOr);
        System.out.println("Bitwise XOR (a ^ b): " + bitwiseXor);

    }

}
