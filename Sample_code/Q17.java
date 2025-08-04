package Sample_code;

class Animal{
	void eat() {
		System.out.println("This anima eats food.");
		
	}
}
class Lion extends Animal{
	void roar() {
		System.out.println("The Loin roars!");
	}
}

public class Q17 {
	public static void main(String[] args) {
		Lion l=new Lion();
		l.eat();
		l.roar();
		
		
	}

}
