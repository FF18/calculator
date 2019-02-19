package small.calculator;

import java.util.Scanner;

public class Calculator extends Execute {
	private int num1=0;
	private int num2;
	public int a; // last number
	private Calculator execute;
	
	public Scanner scan = new Scanner(System.in); {
		num2 = scan.nextInt();
	}

	
	public void setNum1(int num1) {
		this.num1 = num1;
		num1 = a;
	}
	public int getNum1() {
		return getNum1();
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum2() {
		return getNum2();
	}

	public void performOperation(int num1, int num2) {
		execute.getNum1();
		execute.getNum2();
		a = getNum1();
	}
}

