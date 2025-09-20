package Interfaces_PBL;

interface SmartDevice {
    void turnOn();
    void turnOff();
    String getStatus();
}

class SmartLight implements SmartDevice {
    private boolean isOn = false;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Smart Light is now ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Smart Light is now OFF");
    }

    @Override
    public String getStatus() {
        return isOn ? "Smart Light is ON" : "Smart Light is OFF";
    }
}

class SmartFan implements SmartDevice {
    private boolean isOn = false;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Smart Fan is now ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Smart Fan is now OFF");
    }

    @Override
    public String getStatus() {
        return isOn ? "Smart Fan is ON" : "Smart Fan is OFF";
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        SmartDevice[] devices = new SmartDevice[2];
        devices[0] = new SmartLight();
        devices[1] = new SmartFan();

        for (SmartDevice d : devices) {
            d.turnOn();
            System.out.println("Status: " + d.getStatus());
            d.turnOff();
            System.out.println("Status: " + d.getStatus());
            System.out.println("----------------------");
        }
    }
}
