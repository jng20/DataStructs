public class recursive1{
  public static String reverse(String a){
    if(a.length() == 1){
      return a;
    }
    if(a.length() == 0 ){
      return "";
    }
    return (a.substring(a.length()-1, a.length())  + reverse(a.substring(0, a.length() -1) ));
  }

public static int findMax(int[] a, int n){

  if(n == 0 ){
    return a[0];
  }
  return Math.max(a[n], findMax(a, n-1));
}

public static int stringToInt(String s){
  if(s.length() == 1){
    return s.charAt(0)-48;
  }

  return (((s.charAt(s.length() -1) - 48)  + stringToInt(s.substring(0,s.length() -1)) * 10) ) ;
}

  public static void main(String[] args){
    System.out.println(reverse("abcd"));
    int[] ex = {1,2,3,4,5,0};
    int[] ex2 = {17,20,23,2000,1770};
    System.out.println(findMax(ex, 5));
    System.out.println(findMax(ex2, 4));
    System.out.println(stringToInt("2003949405"));
    System.out.println(stringToInt("1990"));
  }
}
