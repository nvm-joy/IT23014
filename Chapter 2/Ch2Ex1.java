import java.util.Scanner;

public class Ch2Ex1 {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temp in celcius : ");
        double c = sc.nextDouble();

        double f = (9.0/5) * c + 32;

        System.out.printf("The temp in farenheit is %.2f" , f);

    }
    
}
