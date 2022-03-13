package pl.edu.pw.mini.po.first.object;

public class MyCar {

	private static String HELLO_TEXT = "Hello!";
	private static int carCount = 5;
	
	private int serialNumber = check();
	
	private String brand;
	private String make;

	private int enignePower;
	private boolean personal;

	private short maxSpeed;
	private float resistanceFactor;
	
	private String ownerLastName;//name + prefix
	
	private static String generalGreetingText() {
		return HELLO_TEXT;
	}
	
	private int check() {
		System.out.println("Check");
		return 1;
	}
	
	public static void generalCarGreeting() {
		System.out.println(generalGreetingText());
	}
	
	public void enginePowerGreeting() {
		System.out.println(generalGreetingText() + " My engine power is: " + enignePower);
	}
	
	public void maxSpeedGreeting() {
		System.out.println(generalGreetingText() + " My max speed is: " + maxSpeed);
	}
	
	public void updateOwnerLastName(String ownerLastName) {
		this.ownerLastName = "Mr" + ownerLastName;
	}
	
	static {
		System.out.println("Static anonymous block");
		carCount = 5;
	}
	
	{
		System.out.println("Anonymous block");
		this.serialNumber = carCount++;
	}
	
	public MyCar() {
		/*Somthing is going here
		this.brand = brand;
		this.make = make;
		this.enignePower = enignePower;
		this.personal = personal;
		this.maxSpeed = maxSpeed;
		this.resistanceFactor = resistanceFactor;
		*/
		//initSerialNumber();
	}
	
	public MyCar(String brand, String make, int enignePower, boolean personal, short maxSpeed, float resistanceFactor) {
		//this();
		System.out.println("Constructor ");
		
		this.brand = brand;
		this.make = make;
		this.enignePower = enignePower;
		this.personal = personal;
		this.maxSpeed = maxSpeed;
		this.resistanceFactor = resistanceFactor;
		//initSerialNumber();
	}
	/*
	private void initSerialNumber() {
		this.serialNumber = ++carCount;
	}
	*/
	public String toString() {
		return brand + " " + make + " " + enignePower + " " + personal + " " +maxSpeed + " " + resistanceFactor + " " + carCount;
	}
	
	public String getOwnerLastName() {
		return ownerLastName;
	}

	public int getSerialNumber() {
		return serialNumber;
	}
	
}
