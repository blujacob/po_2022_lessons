package pl.edu.pw.mini.po.secondlab;

import java.util.Random;

public class Person {
	
	private static int personCount = staticAny();
	
	private int id;// = personCount++;
	private String name;
	private String lastName;
	private int pulse = any();

	private int nuddleCount;

	static {
		System.out.println("Anonymous static block");
		personCount = (new Random()).nextInt(100) + 100;
	}
	
	{
		System.out.println("Anonymous block");
		this.id = personCount++;
	}
	
	public Person() {
		
		this.name = "defaultname";
		this.lastName = "defaultsurname";
	}
	
	public Person(String name, String lastName) {
		System.out.println("Constructor");
		updateId();
		this.name = name;
		this.lastName = lastName;

		Random random = new Random();
		this.pulse = 60 + random.nextInt(50);
	}

	public Person(String name) {
		updateId();
		this.name = name;
		this.lastName = "All the same";

		Random random = new Random();
		this.pulse = 60 + random.nextInt(50);
	}
	
	private static int staticAny() {
		System.out.println("Static any");
		return 7;
	}
	
	private int any() {
		System.out.println("any");
		return 7;
	}
	
	
	
	private void updateId() {
		
		//Any other business logic
		
		this.id = personCount++;//personCount = personCount + 1;
	}
	
	public void updateNuddles(int newNuddles) {
		nuddleCount += newNuddles;
	}

	private static void doNothing() {
		
	}
	
	private static String getGeneralHello() {
		return new String("Hello!!!");
	}
	
	public static void greet() {
		System.out.println(getGeneralHello());
	}

	public void greetWithPulse() {
		System.out.println(getGeneralHello() + "my pulse is: " + pulse);
	}

	public int getNuddleCount() {
		return nuddleCount;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public int getPulse() {
		return pulse;
	}

	public int getId() {
		return id;
	}

}
