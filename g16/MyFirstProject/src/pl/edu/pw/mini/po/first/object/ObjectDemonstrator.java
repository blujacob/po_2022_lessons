package pl.edu.pw.mini.po.first.object;

import java.util.Random;

public class ObjectDemonstrator {

	public static void main(String[] args) {
		
		//demonstrate();
		demonstrateOtherClassesStatic();
		/*
		ObjectDemonstrator objectDemonstrator = new ObjectDemonstrator();
		objectDemonstrator.demonstrateOtherClasses();
		*/
	}

	private static void demonstrateOtherClassesStatic() {
		
		Random random = new Random();
		System.out.println("Sqrt: " + Math.sqrt(10));
		
		for(int i=0;i<100;i++) {
			System.out.println("Random: " + (100 + random.nextInt(100)));
		}
		
		String string = new String("Hello it is me!");
		
		string = string.toUpperCase();
		System.out.println(" my strig is: " + string);
		System.out.println(string.substring(0, 8));
		
	}

	/*
	private void demonstrateOtherClasses() {
		
		
		
	}
	*/
	private static void demonstrate() {
		MyCar myCar1 = null;// = new MyCar("Saab", "9-3", 180, true, (short)230, 0.32f);
		MyCar myCar2 = new MyCar("Nissan", "Almera", 75, true, (short)150, 0.4f);
		MyCar myCar3 = new MyCar("Polonez", "Caro", 75, true, (short)150, 0.45f);
		MyCar myCar4 = myCar3;
		
		System.out.println(myCar1);
		System.out.println(myCar2);
		System.out.println(myCar3);
		System.out.println(myCar4);
		
		System.out.println(myCar2);
		
		String myString = new String("Hello!");
		String concatenatedString = "My string: " + myString + 120 + myCar2 + "   Hi hello it`s me";
		
		
		System.out.println(concatenatedString);
		
		//myCar1.enginePowerGreeting();
		//myCar1.maxSpeedGreeting();
		MyCar.generalCarGreeting();
		
		myCar2.enginePowerGreeting();
		myCar2.maxSpeedGreeting();
		MyCar.generalCarGreeting();
		
		myCar3.enginePowerGreeting();
		myCar3.maxSpeedGreeting();
		MyCar.generalCarGreeting();
		
		
		//we know the owner
		myCar3.updateOwnerLastName("Bednarz"); 
		System.out.println("The owner is: " + myCar3.getOwnerLastName());
		System.out.println("Serial no is: " + myCar3.getSerialNumber());
	}
	
}
