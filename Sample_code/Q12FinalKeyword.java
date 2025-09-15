/*Q12: Write a program using final keyword to define a constant PI = 3.14159 and use it to calculate the area and circumference of a circle. 
 * Take radius as input.
 Declare a final variable and try modifying it (intentionally). Observe and explain the compile-time error.

Static variables, Static block and Static mathods*/
package Sample_code;
import java.util.Scanner;
public class Q12FinalKeyword {
	public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Radius: ");
        double radius = sc.nextDouble();
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);

        final int num = 10;
        
        sc.close();
}
}
