package pl.edu.pw.mini.po.thirdlab.parent;

import pl.edu.pw.mini.po.thirdlab.atms.CashSetable;

public class Parent {
	private CashSetable atm;
	
	public void refillCash(int cash) {
		atm.refillCash(cash);
	}
	
	public Parent(CashSetable atm) {
		this.atm = atm;
	}
}
