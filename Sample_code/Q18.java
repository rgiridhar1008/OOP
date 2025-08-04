package Sample_code;
class Vehicle{
	void move() {
		System.out.println("the vehicle is moving.");
	}
}
class Car extends Vehicle{
	void fueltype()
	{
		System.out.println("The car uses petrol or diesel.");
	}
	
}
public class Q18 {
	public static void main(String[] args) {
        Car car = new Car();
        car.move();      
        car.fueltype();  
    }

}
