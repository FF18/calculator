package small.calculator;

public class EnumType extends Main {
	String ADD="+", SUBTRACT="-", MULTIPLY="*", DIVIDE="/", QUIT="Esc";
	double RANDOM=Math.random();
	//	String ("+"), ("-"), ("*"), ("/");
	public enum Type {
		ADD, SUBTRACT, MULTIPLY, DIVIDE, QUIT, RANDOM;
		//		ADD("+"), SUBTRACT("-"), MULTIPLY("*"), DIVIDE("/");//, QUIT("break"), RANDOM("random");
	}

	public void setType() {

	}

	public String getType() {
		return getType();
	}


}

