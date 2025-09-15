package Sample_code;

public class Q13Student {
    long id;
    String name;
    static String college;

    static {
        college = "New College";
    }

    Q13Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

    static void changeCollege(String newCollege) {
        college = newCollege;
    }

    void display() {
        System.out.println(id + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Q13Student s1 = new Q13Student(2420030171L, "Giridhar");
        Q13Student s2 = new Q13Student(2420030172L, "Madhu");
        s1.display();
        s2.display();
        Q13Student.changeCollege("KLH University");
        s1.display();
        s2.display();
    }
}
