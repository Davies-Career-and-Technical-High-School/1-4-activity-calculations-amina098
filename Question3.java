import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
      System.out.println ("Enter radius");
      double r = scan.nextDouble();
      System.out.println("circumference" + (2* 3.14 * r) );
      System.out.println(" Area" + ( 3.14 * r * r));
       

    }
}