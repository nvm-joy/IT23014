import java.util.Scanner;

public class Ch2Ex12 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        double v = sc.nextDouble();
        double a = sc.nextDouble();

        double l = (v*v)/(2*a);

        System.out.print("The minimum runway length for this airplane is " + l);
    }
    
}
