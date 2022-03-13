package pl.edu.pw.mini.po.first;

public class MyFirstClass {

	public static void main(String[] args) {

		System.out.println("Hello world!");

		boolean flag = true;
		byte myByte = 1;
		short myShort = 1;
		int myInt = 1000;
		long myLong = 2000;
		float myFloat = 4.5f;
		double myDouble = 10.33;

		String myText = "Hello it`s me!";
		
		System.out.println(myText);
		
		
		int[] myTab;
		myTab = new int[5];
		
		myTab[0] = 0;
		myTab[1] = 10;
		myTab[2] = 20;
		myTab[3] = 30;
		myTab[4] = 40;
		
		System.out.println("Element: " + myTab[3]);
		//System.out.println("Element: " + myTab[10]);
		
		for(int i=0;i<myTab.length;i++) {
			System.out.println("Element: " + i + " - " + myTab[i]);
		}
		
		
		int [][] myTwoDimensionTab;
		
		myTwoDimensionTab = new int[5][6];
		
		System.out.println("Initialize:");
		
		//Initialize
		for(int i=0;i<myTwoDimensionTab.length;i++) {
			for(int j=0;j<myTwoDimensionTab[i].length;j++) {
				myTwoDimensionTab[i][j] = i + j;
			}
		}
		
		/*
		Also comment
		 */
		System.out.println("Print:");
		for(int i=0;i<myTwoDimensionTab.length;i++) {
			for(int j=0;j<myTwoDimensionTab[i].length;j++) {
				System.out.print(myTwoDimensionTab[i][j]);
			}
			System.out.println();
		}
		
		int[] additionalOneDimTab = myTwoDimensionTab[2];
		
		int variable = 10;
		int[] tabVariable = new int [3];
		int[][] twoDimTabVariable = new int[4][4];
		
		variable = tabVariable[2];
		variable = twoDimTabVariable[0][2];
		tabVariable = twoDimTabVariable[0];
		
		int firstVar = 5, secondVar = 10;
		if(firstVar == 5 && secondVar > 5 ) {
			System.out.println("Wow!");
		} 

		System.out.println("Switch: ");
		switch (firstVar) {
		case 1:
			System.out.println("One!");
			break;

		case 2:
			System.out.println("Two!");
			break;
		case 3:
			System.out.println("Three!");
			break;
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("i before: " + i);
			
			if(i > 5) {
				continue;
			}
			
			System.out.println("i after: " + i);
		}
		
	}

	void metda() {
	}

}
