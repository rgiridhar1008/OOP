package Sample_code;

class Individual {
    String name;
    int age;

    Individual(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Q16Student extends Individual {
    long id;
    String course;

    Q16Student(long id, String name, int age, String course) {
        super(name, age); // call parent constructor
        this.id = id;
        this.course = course;
    }

    void displayDetails() {
        super.displayDetails(); // call parent method
        System.out.println("ID: " + id + ", Course: " + course);
    }

    public static void main(String[] args) {
        Q16Student s1 = new Q16Student(2420030171L, "GIRIDHAR", 19, "CSE");
        s1.displayDetails();
    }
}
