package Sample_code;
class Person{
	void displayInfo()
	{
		System.out.println("Person details:");
		
	}
}
class Student extends Person{
	String studID = "2420030171";
	void showID(){
	System.out.println("Student ID :"+ studID);
	}
}
class GraduateStudent extends Student {
    void submitcertificates() {
    	
        System.out.println("Graduate student submits his Certificates.");
    }
}


public class Q20 {
	 public static void main(String[] args) {
	        GraduateStudent gs = new GraduateStudent();
	        gs.displayInfo();   
	        gs.showID();        
	        gs.submitcertificates();  


	 }}
