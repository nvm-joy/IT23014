import java.util.Scanner;

public class Ch2Ex10 {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double M = sc.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double i = sc.nextDouble();

        System.out.print("Enter the final temperature: ");
        double f = sc.nextDouble();

        double Q = M*(f-i)*4184;

        System.out.print("The energy needed is " + Q);
    }
    
}
