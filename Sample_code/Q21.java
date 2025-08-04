package Sample_code;
class Appliance {
    void turnOn() {
        System.out.println("Appliance is now ON.");
    }
}

class Fan extends Appliance {
    void rotate() {
        System.out.println("Fan is rotating.");
    }
}

class CeilingFan extends Fan {
    void setSpeed(int speed) {
        System.out.println("Ceiling fan speed set to: " + speed);
    }
}
public class Q21 {
	public static void main(String[] args) {
        CeilingFan cf = new CeilingFan();
        cf.turnOn();       
        cf.rotate();       
        cf.setSpeed(3);    
    }

}
