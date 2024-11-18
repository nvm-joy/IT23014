import java.util.Scanner;

public class Ch2Ex6 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");

        int n = sc.nextInt();
         
        int sum = 0;
        int n1;
           while (n != 0) {
             
               n1 = n%10;
               sum += n1;
               n /= 10;
     
           }

           System.out.print("The sum of the digits is " + sum);
    }
    
}
