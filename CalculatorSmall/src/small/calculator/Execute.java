package small.calculator;

public class Execute extends EnumType{
	private int num1=0;
	private int num2;

	public void setNum1(int num1) {
		this.num1 = num1;
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


	public String getType() {
		//		super(getType());

		switch(getType()){
		case ADD: this.num1=getNum1()+getNum2();
		System.out.println("Result is "+ getNum1());
		break;
		case SUBTRACT: this.num1=getNum1()-getNum2();
		System.out.println("Result is "+ getNum1());
		break;
		case MULTIPLY: this.num1=getNum1()*getNum2();
		System.out.println("Result is "+ getNum1());
		break;
		case DIVIDE: this.num1=getNum1()/getNum2();
		System.out.println("Result is "+ getNum1());
		break;
		case QUIT: this.num1=0;
		System.out.println("End program. Good by!");
		break;
		
		public double getType(RANDOM) {
			return getType();
		}

		case RANDOM: double num1=Math.random();
		break;	

		default:System.out.println("Mistake: incompatible operation!");
		break;
		}

	}
}
