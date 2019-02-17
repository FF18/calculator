package small.calculator;

import java.util.Scanner;

public class Divide extends Calculator implements calcprint {
	private int num1=0;
	private int num2;

	public Scanner scan = new Scanner(System.in); {
		num2 = scan.nextInt(num2);
		if(num2!=0) {
			num1 = num1/num2;
		}else {
			System.out.println("Mistake: divide to zero impossible!");
		}

	}

	@Override
	public int getType() {
		return getType();
	}
	
	@Override
	public void execute() {
			
	}
}
