import java.util.Scanner;
19
class Largest_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1. number :");
        int num1 = scan.nextInt();
        System.out.print("Enter the 2. number :");
        int num2 = scan.nextInt();
        System.out.print("Enter the 3. number :");
        int num3 = scan.nextInt();
        int thebiggest = num1;
        if(num2 > thebiggest) {
            thebiggest = num2;
        }
        if(num3 > thebiggest) {
            thebiggest = num3;
        }
        System.out.println("Largest of the entered numbers = " + thebiggest);
    }
}