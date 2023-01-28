public class test{
  public static void main(String[] args) {
ClassA[] arr = { new ClassB(), new ClassA(), new ClassC() };
System.out.println();
for (int i = 0; i < arr.length; i++) { arr[i].myPrint(); }
}


}
