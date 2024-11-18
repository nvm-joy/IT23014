import java.util.Scanner;

public class Ch2Ex5 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");     
        
        double s = sc.nextDouble();
        double g = sc.nextDouble();

        double gratuity = s * (g/100);
        double total = s+gratuity;

        System.out.print("The gratuity is $" + gratuity + " and total is $" + total);

    }
    
}
