package OOP_Practical_Lab;
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void displayRole() {
        System.out.println("I am a person.");
    }
}

class Student_s extends Person {
    Student_s(String name) {
        super(name);
    }

    @Override
    void displayRole() {
        System.out.println("I am a student. My name is " + name);
    }
}

class Faculty extends Person {
    Faculty(String name) {
        super(name);
    }

    @Override
    void displayRole() {
        System.out.println("I am a faculty member. My name is " + name);
    }
}

class Admin extends Person {
    Admin(String name) {
        super(name);
    }

    @Override
    void displayRole() {
        System.out.println("I am an admin. My name is " + name);
    }
}

public class Task4 {
    public static void main(String[] args) {
        Person p1 = new Student_s("Alice");
        Person p2 = new Faculty("Bob");
        Person p3 = new Admin("Charlie");

        p1.displayRole();
        p2.displayRole();
        p3.displayRole();
    }
}
