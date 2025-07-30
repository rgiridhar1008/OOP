package Sample_code;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteVar = 100;
        short shortVar = 20000;
        int intVar = 1000000;
        long longVar = 10000000000L;

        float floatVar = 12.34f;
        double doubleVar = 1234.5678;
        
        System.out.println("byte value : "+byteVar+" Size : "+Byte.BYTES);
        System.out.println("Short value : "+shortVar+" Size : "+Short.BYTES);
        System.out.println("Int value : "+intVar+" Size : "+Integer.BYTES);
        System.out.println("Long value : "+longVar+" Size : "+Long.BYTES);
        System.out.println("Float value : "+floatVar+" Size : "+Float.BYTES);

	}

}
