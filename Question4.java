import java.util.Scanner;

class Question4 {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter price of your item");
    double num1 = scan.nextDouble();
    System.out.println("Change from $20: $" +  (20- num1));
       
    }
}