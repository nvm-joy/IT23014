public class Ch1Ex11 {
    public static void main(String[] args) {
        // Current population
        long currentPopulation = 312_032_486;

        // Number of seconds in a year (365 days)
        int secondsPerYear = 365 * 24 * 60 * 60;

        // Time intervals in seconds
        double birthInterval = 7.0;      // One birth every 7 seconds
        double deathInterval = 13.0;     // One death every 13 seconds
        double immigrantInterval = 45.0; // One new immigrant every 45 seconds

        // Annual changes
        long birthsPerYear = (long) (secondsPerYear / birthInterval);
        long deathsPerYear = (long) (secondsPerYear / deathInterval);
        long immigrantsPerYear = (long) (secondsPerYear / immigrantInterval);

        // Calculate net population change per year
        long annualPopulationChange = birthsPerYear + immigrantsPerYear - deathsPerYear;

        // Display projected population for the next 5 years
        System.out.println("Year 0 (Current Population): " + currentPopulation);
        for (int year = 1; year <= 5; year++) {
            currentPopulation += annualPopulationChange;
            System.out.println("Year " + year + ": " + currentPopulation);
        }
    }
}
