package OOP_Practical_Lab;
import java.util.*;


class Student {
    String name;
    long rollno;
    int marks;

    
    void setDetails(String name, long rollno, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    
    void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Marks: " + marks);
    }
}


public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        Student s = new Student();

        
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        long rollno = sc.nextLong();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

    
        s.setDetails(name, rollno, marks);
        System.out.println("\nStudent Details:");
        s.getDetails();

    }
}
