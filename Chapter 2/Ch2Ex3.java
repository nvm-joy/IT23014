import java.util.Scanner;

public class Ch2Ex3 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for feet : ");

        double f = sc.nextDouble();

        double m = f*0.305;

        System.out.printf(f + " feet is "+ m + " meters");
    }
    
}
