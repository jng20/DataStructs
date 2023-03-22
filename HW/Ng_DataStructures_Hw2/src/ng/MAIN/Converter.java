package ng.MAIN;

import ng.CLASSES.LinkedStack;
import ng.CLASSES.ParserHelper;

public class Converter{
//  private LinkedStack<String> temp ;
  private String input;
  private String output;
  public Converter(){

  }
  public Converter(String s){
    this();
    input = s;
    output = this.toPostFix(input);
  }

  
public String getInput() {
	return input;
}
public void setInput(String input) {
	this.input = input;
}
public String getOutput() {
	return output;
}
public void setOutput(String output) {
	this.output = output;
}
/*The method that does all the work in the Converter class should be called
toPostFix()
It will convert the infix expression to a postfix expression. The postfix
expression should be a string that can be evaluated by the calculator. Each
operator and operand should be separated by spaces. This is not necessarily
true of the input (i.e., the original infix expression might look like 2+2 instead of
2 + 2).
The first thing the converter class does is to tokenize the input string into a list of
tokens representing operators and operands. Parenthesis are also allowed in
infix expressions, so "(" and ")" are valid tokens. A parser method has been
provided to you for your convenience - see the ParserHelper.java file.
Once the input is tokenized, a stack is used to convert to a postfix expression.
We will go over the algorithm in recitation. Here is the basic idea: create a stack
and an output string. Read all of the tokens from left to right.
*/
  public static String toPostFix(String in){
    char[] ch = in.toCharArray();
    //List<String> p = ParserHelper.parse(ch);
    String outfix = "";
    LinkedStack<String> temp =  new LinkedStack<String>();
    for(String i : ParserHelper.parse(ch) ){
    	//System.out.println(i + "!");
      if(i.equals("(")){
        temp.push(i);
      }
      if(i.equals("(") == false && i.equals(")") == false && i.equals("+") == false && i.equals("-") == false && i.equals("*") == false && i.equals("/") == false && i.equals("^") == false){
        outfix += i;
        outfix += " ";
       // System.out.println("number check " + outfix);
      }
      if(i.equals("+") || i.equals("-")){
    	  if(temp.isEmpty()) {
    		  temp.push(i);
    		//  System.out.println("+- check " + outfix);
    	  }
    	  else {
    		  while( temp.isEmpty() == false && temp.top().equals("(") == false ){
    	          outfix += temp.pop();
    	          outfix += " ";
    	        }
    	        temp.push(i);
    	  }
        
      }
      if(i.equals("*") || i.equals("/")){
    	  if(temp.isEmpty()) {
    		  temp.push(i);
    	  }else {
    		  while(  temp.isEmpty() == false && (temp.top().equals("+") == false && temp.top().equals("-") == false && temp.top().equals("(") == false) ){
    	          outfix += temp.pop();
    	          outfix += " ";
    	        }
    	        temp.push(i);
    	  }
        
      }
      if(i.equals( "^")){
          temp.push(i);
      }
      if(i.equals(")")){
        while(temp.top().equals("(") == false){
          outfix += temp.pop();
          outfix += " ";
        }
        temp.pop();
      }
    }
    while(temp.isEmpty() == false){
      outfix += temp.pop();
      outfix += " ";
    }
    return outfix;
  }

//  public static void main(String[] args){
//	  String out = toPostFix("3+4*5/6");
//	  System.out.println("final output");
//      System.out.println(out);
//       out = toPostFix("(300+23)*(43-21)/(84+7)");
//	  System.out.println("final output");
//      System.out.println(out);
//       out = toPostFix("(4+8)*(6-5)/((3-2)*(2+2))");
//	  System.out.println("final output");
//      System.out.println(out);
//       out = toPostFix("(4+8)*(6-5)/((3-2)*(2+2))");
//	  System.out.println("final output");
//      System.out.println(out);
//out = toPostFix("(4+8)*(6-5)/((3-2)*(2+2))^3");
//System.out.println("final output");
//System.out.println(out);
//  }
  
//  	public static void main(String[] args) {
//  		Converter c = new Converter("3+4*5/6");
//  		System.out.println(c.getOutput());
//  	}
}