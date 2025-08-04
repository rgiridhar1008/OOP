package Sample_code;

class animal {
	void eat() {
		System.out.println("Animal eates Food.");
	}
}
class dog extends animal{
	void bark()
	{
		System.out.println("Dog barks.");
		
	}
}
class puppy extends dog{
	void weep()
	{
		System.out.println("Puppy weeps.");
	}
}
public class Q19 {
	public static void main(String[] args)
	{
		puppy p =new puppy();
		p.eat();
		p.bark();
		p.weep();
		
	}
}
