package ng.MAIN;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("type your infix expression:");
	     String i = sc.next();
	     PostFixCalculator now = new PostFixCalculator(i);
	     System.out.println(i);
	     System.out.println("converted to postfix: " + now.getC().getOutput());
	     System.out.println("answer is " + now.getOutString());
	}
//	public static void main(String[] args) {
//		PostFixCalculator now = new PostFixCalculator("3+4*5/6");
//		System.out.println("3+4*5/6");
//	     System.out.println("converted to postfix: " + now.getC().getOutput());
//	     System.out.println("answer is " + now.getOutString());
//	     
//	     System.out.println();
//	     now = new PostFixCalculator("(300+23)*(43-21)/(84+7)");
//			System.out.println("(300+23)*(43-21)/(84+7)");
//		     System.out.println("converted to postfix: " + now.getC().getOutput());
//		     System.out.println("answer is " + now.getOutString());
//		     
//		 System.out.println();
//		 now = new PostFixCalculator("(4+8)*(6-5)/((3-2)*(2+2))");
//			System.out.println("(4+8)*(6-5)/((3-2)*(2+2))");
//		     System.out.println("converted to postfix: " + now.getC().getOutput());
//		     System.out.println("answer is " + now.getOutString());
//		     
//		     System.out.println();
//			 now = new PostFixCalculator("5/0");
//				System.out.println("5/0");
//			     System.out.println("converted to postfix: " + now.getC().getOutput());
//			     System.out.println("answer is " + now.getOutString());
//	}
}
