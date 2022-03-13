package pl.edu.pw.mini.po.first;

public class MyFirst {
	
	public static void main(String[] args) {
		
		System.out.println("Hello world!");
		byte snakeNotation = 1;
		byte kebabNotation = 2;
		short myShort = 10;
		int myInt = 100;
		long myLong = 1000;
		float myFloat = 1.5f;
		double myDouble = 10.1;
		
		
		System.out.println("My byte " + snakeNotation);
		snakeNotation = 127;
		System.out.println("My byte with 127: " + snakeNotation);
		snakeNotation = (byte)128;
		System.out.println("My byte with 128 with cast: " + snakeNotation);
		snakeNotation = (byte)129;
		System.out.println("My byte with 129 with cast: " + snakeNotation);
		
		
		int sum = snakeNotation + kebabNotation;
		long sumInt = myInt + myLong;
		
		int[] myIntTab = new int[5];
		
		myIntTab[0] = 0;
		myIntTab[1] = 10;
		myIntTab[2] = 20;
		myIntTab[3] = 30;
		myIntTab[4] = 40;
		
		
		System.out.println("Matb index 4: " + myIntTab[4]);
		//System.out.println("Matb index 5: " + myIntTab[5]);
		
		int[] emptyTab = null;
		
		//System.out.println("Empty tab: " + emptyTab[2]);
		
		//long[] myFavouriteLong = new int[10]; 
 		
		long biggerType;
		int smllerType = 10;
		
		biggerType = smllerType;
		smllerType = (int)biggerType;
		
		for(int i=0;i<10;i++) {
			System.out.println("Loop: " + i);
		}
		
		for(int i=0;i<myIntTab.length;i++) {
			System.out.println("MyIntTab: " + myIntTab[i]);
		}
		
	}
	
}
