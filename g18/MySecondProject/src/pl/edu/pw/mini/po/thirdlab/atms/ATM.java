package pl.edu.pw.mini.po.thirdlab.atms;

import java.util.Random;

public class ATM implements CashSetable, CashGetable{
	
	private int currentCash;
	
	public ATM() {
		currentCash = 1000 + new Random().nextInt(9001);
	}

	public void withdrawCash(int cashToGet) {
		if(currentCash >= cashToGet) {
			currentCash -= cashToGet;//currenCash = currenCash - cashToGet;
			returnCash(cashToGet);
		} else {
			denyCash(cashToGet);
		}
	}
	
	private void returnCash(int cashToReturn) {
		System.out.println("Cash returned " + cashToReturn);
	}
	
	private void denyCash(int cashToReturn) {
		System.out.println("Sorry " + cashToReturn + " is too much than I can give you.");
	}
	
	public void refillCash(int cash) {
		currentCash += cash;
	}
	
}
