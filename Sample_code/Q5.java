package Sample_code;
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a charcter :");
		char ch = sc.next().charAt(0);
        int asciiValue = (int) ch;
        System.out.println("Character: " + ch);
        System.out.println("ASCII value as integer: " + asciiValue);

	}

}
