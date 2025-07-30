package Sample_code;
import java.util.*;

public class Q9 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first integer: ");
    int a = sc.nextInt();
    System.out.print("Enter second integer: ");
    int b = sc.nextInt();

    int and = a & b;
    int or = a | b;
    int xor = a ^ b;
    int leftShift = a << 2;
    int rightShift = a >> 2;

    System.out.println("a & b = " + and + " (Binary: " + Integer.toBinaryString(and) + ")");
    System.out.println("a | b = " + or + " (Binary: " + Integer.toBinaryString(or) + ")");
    System.out.println("a ^ b = " + xor + " (Binary: " + Integer.toBinaryString(xor) + ")");
    System.out.println("a << 2 = " + leftShift + " (Binary: " + Integer.toBinaryString(leftShift) + ")");
    System.out.println("a >> 2 = " + rightShift + " (Binary: " + Integer.toBinaryString(rightShift) + ")");

    
}


}
