package Sample_code;
import java.util.*;

public class Q4 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Double value: ");
		double doubleValue = sc.nextDouble();
		int intValue = (int) doubleValue;
        System.out.println("Original double value: " + doubleValue);
        System.out.println("After casting to int: " + intValue);
        
	}

}
