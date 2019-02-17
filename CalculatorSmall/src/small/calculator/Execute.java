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
	public void getNum2() {
		return;
	}
	

	public int getType() {
//		super(getType());
		
	switch(getType()){
	case ADD: this.getNum1()=getNum1()+getNum2();
	System.out.println("Result is "+ getNum1());
		break;
	case SUBTRACT: this.getNum1()=getNum1()-getNum2();
	System.out.println("Result is "+ getNum1());
		break;
	case MULTIPLY: this.getNum1()=getNum1()*getNum2();
	System.out.println("Result is "+ getNum1());
		break;
	case DIVIDE: this.getNum1()=getNum1()/getNum2();
	System.out.println("Result is "+ getNum1());
		break;
	case QUIT: getNum1()=0;
		System.out.println("End program. Good by!");
		break;
	case RANDOM:
		break;
	default:System.out.println("Mistake: incompatible operation!");
	break;
	}
}
}
