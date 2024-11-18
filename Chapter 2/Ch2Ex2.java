import java.util.Scanner;

public class Ch2Ex2 {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of a cylinder : ");
        double r = sc.nextDouble();
        System.out.print("Enter length of a cylinder : ");
        double l = sc.nextDouble();

       double area = r*r*3.1416;
       double volume = area * l;

       System.out.println("The volume of the cylinder is : " + volume);

    }
    
}
