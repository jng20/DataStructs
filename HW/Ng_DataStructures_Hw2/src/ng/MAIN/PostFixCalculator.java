package ng.MAIN;

import ng.CLASSES.LinkedStack;

public class PostFixCalculator {

	private String in;
	private Converter c;
	private double out;
	private String outString;
	
	public PostFixCalculator() {
		
	}
	public PostFixCalculator(String in) {
		//super();
		this();
		this.in = in;
		c = new Converter(in);
		out = this.calculate(c.getOutput());
		outString = out + "";
		if(outString.equals("Infinity")) {
			outString = "Can't divide by 0";
		}
	}
	public String getIn() {
		return in;
	}
	public void setIn(String in) {
		this.in = in;
	}
	public Converter getC() {
		return c;
	}
	public void setC(Converter c) {
		this.c = c;
	}
	public double getOut() {
		return out;
	}
	public void setOut(double out) {
		this.out = out;
	}
	public String getOutString() {
		return outString;
	}
	public void setOutString(String outString) {
		this.outString = outString;
	}
	
	public static double calculate(String s) {
		double ret = 0;
		LinkedStack<String> temp =  new LinkedStack<String>();
		String[] store = s.split(" ");
		for(int i = 0; i < store.length; i++) {
			String index = store[i];
			if(index.equals("+") == false && index.equals("-") == false && index.equals("*") == false && index.equals("/") == false && index.equals("^") == false) {
				temp.push(index);
			}
			if(index.equals("+") ) {
				double a = Double.parseDouble(temp.pop());
				double b = Double.parseDouble(temp.pop());
				double c = b + a;
				temp.push(c + "");
			}
			if(index.equals("-") ) {
				double a = Double.parseDouble(temp.pop());
				double b = Double.parseDouble(temp.pop());
				double c = b - a;
				temp.push(c + "");
			}
			if(index.equals("*") ) {
				double a = Double.parseDouble(temp.pop());
				double b = Double.parseDouble(temp.pop());
				double c = b * a;
				temp.push(c + "");
			}
			if(index.equals("/") ) {
				double a = Double.parseDouble(temp.pop());
				double b = Double.parseDouble(temp.pop());
				try {
					double c = b / a;
					temp.push(c + "");
				}catch(ArithmeticException e) {
		            System.out.println("Why u dividin by 0 ");
		        }
			}
			if(index.equals("^") ) {
				double a = Double.parseDouble(temp.pop());
				double b = Double.parseDouble(temp.pop());
				double c = Math.pow(b, a);
				temp.push(c + "");
			}
			
		}
		ret = Double.parseDouble(temp.pop());
		return ret;
	}
}
