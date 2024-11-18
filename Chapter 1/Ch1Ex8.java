import java.util.Scanner;

public class Ch1Ex8 {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of a circle : ");
        int r = sc.nextInt();

       double perimeter = 2*r*3.1416;
       double area = 3.1416*r*r;

       System.out.println("The area of the circle is : " + area);
       System.out.println("The perimeter of the circle is : " + perimeter);

    }
    
}
