public class Ch1Ex7 {
        public static void main(String[] args) {
            // First approximation

            double pi1 = 4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11);
            System.out.println("First approximation of π: " + pi1);
    
            // Second approximation
            
            double pi2 = 4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13);
            System.out.println("Second approximation of π: " + pi2);
        }
    
}
