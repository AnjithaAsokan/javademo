package basic;

public class Switch {
	public static void main(String[] args) {
		int a=10,b=15;
		char op='1';
		switch (op) {
		case '1':System.out.println("addition ="+(a+b));
		break;
		case '2':System.out.println("Subtraction="+(a-b));
		break;
		case '3':System.out.println("Multiplication="+(a*b));
		break;
		case '4':System.out.println("Division="+(a/b));
		break;
		
		default:System.out.println("Invalid Entry");
		
		}

	}



}
