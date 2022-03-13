package pl.edu.pw.mini.po.thirdlab;

import java.util.Random;

import pl.edu.pw.mini.po.thirdlab.atms.ATM;
import pl.edu.pw.mini.po.thirdlab.atms.CashGetable;
import pl.edu.pw.mini.po.thirdlab.atms.CashSetable;
import pl.edu.pw.mini.po.thirdlab.atms.Cinkciarz;
import pl.edu.pw.mini.po.thirdlab.parent.Parent;
import pl.edu.pw.mini.po.thirdlab.student.Student;

public class ATMDemonstrator {

	public static void main(String[] args) {
		ATM atm = new ATM();
		
		CashGetable cashGetable = atm;
		CashSetable cashSetable = atm;
		
		//CashGetable my = new ATM();
		
		Cinkciarz cinkciarz = new Cinkciarz();
		
		Student student = new Student(cinkciarz);
		Parent parent = new Parent(cinkciarz);
		
		for(int i=0;i<1000;i++) {
			//student.getCash(500 + new Random().nextInt(500));
			//parent.refillCash(500 + new Random().nextInt(500));
		}
		
	}

}
