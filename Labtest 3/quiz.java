import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
          
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        

         int score = 0;
         System.out.println("Hey " + name + ", Welcome to the quiz game !\n");
         System.out.println("Who is the founder of Chatgpt?\n (a) Mark Zuckerberg\n (b) Sam altman\n (c) Jeff Bezoz");
         System.out.print("Enter your answer: ");

         char c1 = sc.next().charAt(0);
         if (c1 == 'b') {
            System.out.println("\nCongratulations! Answer is correct.\n");
            score += 5;
         }
         else {
            System.out.println("\nAnswer is wrong.\n");
            score += -1;
         }
         System.out.println("Who is the most popular sport in the world?\n (a) Football\n (b) Cricket\n (c) Baseball");
         System.out.print("Enter your answer: ");

         char c2 = sc.next().charAt(0);
         if (c2 == 'a') {
            System.out.println("\nCongratulations! Answer is correct.\n");
            score += 5;
         }
         else {
            System.out.println("\nAnswer is wrong.\n");
            score += -1;
         }
         System.out.println("Which planet is known as the Red Planet?\n (a) Jupiter\n (b) Mars\n (c) Venus");
         System.out.print("Enter your answer: ");

         char c3 = sc.next().charAt(0);
         if (c3 == 'b') {
            System.out.println("\nCongratulations! Answer is correct.\n");
            score += 5;
         }
         else {
            System.out.println("\nAnswer is wrong.\n");
            score += -1;
         }
         System.out.println("How many continents are there on Earth?\n (a) 6\n (b) 8\n (c) 7");
         System.out.print("Enter your answer: ");

         char c4 = sc.next().charAt(0);
         if (c4 == 'c') {
            System.out.println("\nCongratulations! Answer is correct.\n");
            score += 5;
         }
         else {
            System.out.println("\nAnswer is wrong.\n");
            score += -1;
         }
         System.out.println("Who developed the theory of relativity?\n (a) Isaac Newton\n (b) Albert Einstein \n (c) Galileo Galilei");
         System.out.print("Enter your answer: ");

         char c5 = sc.next().charAt(0);
         if (c5 == 'b') {
            System.out.println("\nCongratulations! Answer is correct.\n");
            score += 5;
         }
         else {
            System.out.println("\nAnswer is wrong.\n");
            score += -1;
         }

         System.out.println("Your total score is " + score);

    }
    
}
