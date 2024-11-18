import java.util.Scanner;

public class Ch1Ex9 {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of a rectangle : ");
        int h = sc.nextInt();
        System.out.print("Enter width of a rectangle : ");
        int w = sc.nextInt();

       double perimeter = 2*(h+w);
       double area = h*w;

       System.out.println("The area of the rectangle is : " + area);
       System.out.println("The perimeter of the rectangle is : " + perimeter);

    }
    
}
