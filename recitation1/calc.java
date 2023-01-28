public class calc{
  double num1;
  double num2;
  double num3;
  static double pi =3.14;

  public calc(){
      print("I am not the default constructor");
  }

  public calc(double one, double two){
    this.num1 = one;
    this.num2 = two;
  }

  public double getNum3(){
    return this.num3;
  }

  public double addition(){
    return num1 + num2;
  }

  public static void print(Object c){
    System.out.println(c);
  }

  public static void main(String[] args){
    System.out.println("Hello World!");

    calc c = new calc();
    c.num1 = 10;        //num2 will default to 0
    System.out.println(c.addition());
    c.print(pi);
    print(c.getNum3());

    calc c2 = new calc();
    c2.pi = 3.1415;
    print(pi);
    c.print(pi);
    //calc.print("banana");

    calc c3 = new calc(7, 12.735);
    print(c3.num1);
    print(c3.num3);

    print("making ScCalc");
    ScCalc s = new ScCalc();
      s.print(s.num1);


//BaACbab
  }
}
