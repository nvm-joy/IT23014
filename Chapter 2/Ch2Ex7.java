import java.util.Scanner;

public class Ch2Ex7 {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");

        long minutes = sc.nextLong();

        long minutesPerDay = 24 * 60;
        long minutesPerYear = 365 * minutesPerDay;
        
        long years = minutes / minutesPerYear;
        long remainingMinutes = minutes % minutesPerYear;
        long days = remainingMinutes / minutesPerDay;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

    }
    
}
