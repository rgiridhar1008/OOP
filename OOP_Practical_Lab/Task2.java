package OOP_Practical_Lab;
import java.util.*;

class Course {
    private String id;
    private String name;

    public Course(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + ": " + name;
    }
}

class Students {
    private String studentName;
    private Course[] courses;
    private int count;

    public Students(String name) {
        studentName = name;
        courses = new Course[5];
        count = 0;
    }

    public void enroll(Course course) {
        if (isAlreadyEnrolled(course)) {
            System.out.println(studentName + " already enrolled in " + course.getName());
            return;
        }

        if (count < 5) {
            courses[count++] = course;
            System.out.println(studentName + " enrolled in " + course.getName());
        } else {
            System.out.println("Enrollment limit reached.");
        }
    }

    private boolean isAlreadyEnrolled(Course course) {
        for (int i = 0; i < count; i++) {
            if (courses[i].getId().equals(course.getId())) {
                return true;
            }
        }
        return false;
    }

    public void showCourses() {
        System.out.println("\nCourses for " + studentName + ":");
        if (count == 0) {
            System.out.println(" - No courses enrolled.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(" - " + courses[i]);
            }
        }
    }
}

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Course oop = new Course("C101", "Object Oriented Programming");
        Course os = new Course("C102", "Operating Systems");
        Course db = new Course("C103", "Database Systems");

        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        Students student = new Students(name);

        while (true) {
            System.out.println("\n--- Course Enrollment Menu ---");
            System.out.println("1. Enroll in OOP");
            System.out.println("2. Enroll in OS");
            System.out.println("3. Enroll in DB");
            System.out.println("4. Show Enrolled Courses");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    student.enroll(oop);
                    break;
                case 2:
                    student.enroll(os);
                    break;
                case 3:
                    student.enroll(db);
                    break;
                case 4:
                    student.showCourses();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
