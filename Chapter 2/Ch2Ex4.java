import java.util.Scanner;

public class Ch2Ex4 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in pounds : ");

        double p = sc.nextDouble();

        double k = p*0.454;

        System.out.printf(p + " pounds is "+ k + " kilograms");
    }
    
}
