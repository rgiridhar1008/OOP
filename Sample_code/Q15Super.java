package Sample_code;

class Human {
    String nationality;

    Human(String nationality) {
        this.nationality = nationality;
    }
}

public class Q15Super extends Human {
    int id;
    String name;
    String course;

    Q15Super() {
        this(0, "Default Student", "Not Assigned", "Indian");
    }

    Q15Super(int id, String name, String course, String nationality) {
        super(nationality);
        this.id = id;
        this.name = name;
        this.course = course;
    }

    void display() {
        System.out.println("ID: " + this.id +
                           ", Name: " + this.name +
                           ", Course: " + this.course +
                           ", Nationality: " + super.nationality);
    }

    public static void main(String[] args) {
        Q15Super s1 = new Q15Super();
        Q15Super s2 = new Q15Super(101, "GIRIDHAR", "CSE", "Indian");

        s1.display();
        s2.display();
    }
}
