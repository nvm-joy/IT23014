public class Ch1Ex12 {
    public static void main(String[] args) {
        // Distance in miles
        double miles = 24;

        double kilometers = miles * 1.6;

        // Time components
        int hours = 1;
        int minutes = 40;
        int seconds = 35;

        // Convert the total time to hours
        double totalTimeInHours = hours + (minutes / 60.0) + (seconds / 3600.0);

        // Calculate average speed in kilometers per hour
        double averageSpeed = kilometers / totalTimeInHours;

        System.out.printf("Average speed in kilometers per hour: %.2f km/h", averageSpeed);
    }
}
