package pl.edu.pw.mini.po.thirdlab.student;

import pl.edu.pw.mini.po.thirdlab.atms.CashGetable;

public class Student {
	private CashGetable atm;
	
	public void getCash(int cash) {
		atm.withdrawCash(cash);
	}
	
	public Student(CashGetable atm) {
		this.atm = atm;
	}
}
