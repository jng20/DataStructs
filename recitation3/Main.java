public class Main{
  public static int division(int a , int b) throws ArithmeticException{
    if(b ==0){
      throw new ArithmeticException( "Hey, this is not allowed");
    }
    return a/b;
  }

  public static void main(String[] Args){

  try{
    division(1,0) ;
  }
  catch (ArithmeticException e){
    System.out.println(e.getMessage());
  }



  }
}
