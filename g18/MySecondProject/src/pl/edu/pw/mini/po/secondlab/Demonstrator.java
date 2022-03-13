package pl.edu.pw.mini.po.secondlab;

import java.util.Random;

public class Demonstrator {

	public static void main(String[] args) {
		
		Demonstrator demonstrator = new Demonstrator();
		//demonstrator.demonstrate1();
		demonstrator.demonstrate2();
		
	}

	private void demonstrate2() {
		
		System.out.println("Sqrt: " + Math.sqrt(10));
		
		Random random = new Random();
		for(int i=0;i<20;i++) {
			System.out.println("Random: " + (40 + random.nextInt(20)));
		}
		
		String string = new String ("Hello I am String!");
		System.out.println("Contains am? " + string.contains("am"));
		System.out.println("Substring? " + string.substring(2, 17));
		
		int myPrimitive;
		Integer myInteger = Integer.valueOf(10);
		String stringNumber1 = new String("111");
		String stringNumber2 = new String("222");
		
		System.out.println("String sum: " + (stringNumber1 + stringNumber2));
		
		Integer myInteger1 = Integer.valueOf(stringNumber1);
		Integer myInteger2 = Integer.valueOf(stringNumber2);
		
		System.out.println("Integer sum: " + (myInteger1 + myInteger2));
		
		Long myLong;
		Double myDouble;
		Float myFloat;
		Short myShort;
		
		Integer anotherInteger = 1;
		
	}
	
	private void demonstrate1() {
		Person person1 = new Person("Piotrek", "Jakis");
		Person person2 = new Person("Anna", "Wanna");
		
		System.out.println("Person1: " + person1.getName() 
				+ " " + person1.getLastName() + " " + person1.getPulse());
		System.out.println("Person2: " + person2.getName() + 
				" " + person2.getLastName()+ " " + person2.getPulse());
		
		
		
		
		Person.greet();
		
		
		
		person1.greetWithPulse();
		
		//more code
		
		person1.updateNuddles(1);
		
		//more ode
		
		person1.updateNuddles(1);
		
		
		//more code
		System.out.println("Person1 nuddle count " + person1.getNuddleCount());
		
		/*
		Person person1 = new Person();
		Person person2 = new Person();
		
		System.out.println("Person1: " + person1);
		System.out.println("Person2: " + person2);
		
		person1.name = "Maciek";
		
		System.out.println("Person`s name: " + person1.name);
		
		person2.name = "Alicja";
		
		System.out.println("Second person name: " + person2.name);
		
		Person person3 = person2;
		
		System.out.println("Third person name: " + person3.name);
		
		System.out.println("Person3: " + person3);
		
		person3.name = "Genowefa";
		
		System.out.println("Person2 changed: " + person2.name);
		System.out.println("Person3 changed: " + person3.name);
		
		person2 = null;
		*/
		
		
		System.out.println("Person1: " + person1.getId());
		System.out.println("Person2: " + person2.getId());
		Person person3 = new Person("aaa", "bb");
		System.out.println("Person3: " + person3.getId());
	}
	
}
