// Lab-01 – Ashesi Premier League
import java.util.Scanner;

public class FootballPlayer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Task 1
        String name;
        int age;
        double height;     
        double weight;     
        int jerseyNumber;

        System.out.print("What is the name of your player: ");
        name = input.nextLine();

        System.out.print("How old is your player: ");
        age = input.nextInt();

        System.out.print("How tall is your player (in meters): ");
        height = input.nextDouble();

        System.out.print("How much does your player weigh (in pounds): ");
        weight = input.nextDouble();

        System.out.print("What is your Jersey number: ");
        jerseyNumber = input.nextInt();

        System.out.println("Player name - " + name);
        System.out.println("Age - " + age);
        System.out.println("Height - " + height + " m");
        System.out.println("Weight - " + weight + " lbs");
        System.out.println("Jersey Number - " + jerseyNumber);

        //  Task 2
        double secondWeight= 0.45359237;
        int secondHeight = 100;

        double weightKg = weight * secondWeight;
        int roundedWeightKg = (int) weightKg;
        double heightCm = height * secondHeight;

        System.out.println(" Converted Player Details ");
        System.out.println("Player name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Height : " + heightCm + " cm");
        System.out.println("Weight : " + roundedWeightKg + " kg");
        System.out.println("Jersey Number : " + jerseyNumber);

        //  Task 3
        System.out.println("After First Season");
        System.out.println("After your first season, " + name + " is " + (++age) + " years old");
        System.out.println("Your jersey number is now " + (--jerseyNumber));

        // Task 4
        boolean playerEligibility = (age >= 18 && age <= 35) && (roundedWeightKg < 90);

        System.out.println(" Eligibility Check ");
        if (playerEligibility) {
            System.out.println(name + " is eligible to play.");
        } else {
            System.out.println(name + " is not eligible to play.");
        }

        //  Task 5
        String category;
        if (age < 20) {
            category = "Rising Star";
        } else if (age <= 30) {
            category = "Prime Player";
        } else {
            category = "Veteran";
        }
        System.out.println("Player category: " + category);

        //  Task 6
        String position;
        switch (jerseyNumber) {
            case 1: 
                position = "Goalkeeper"; break;
            case 2: case 3: case 4: case 5: 
                position = "Defender"; break;
            case 6: case 8: 
                position = "Midfielder"; break;
            case 7: case 11: 
                position = "Winger"; break;
            case 9: 
                position = "Striker"; break;
            case 10: 
                position = "Playmaker"; break;
            default:
                position = "Position Unknown";
        }
        System.out.println("Position: " + position);

        //  Task 7
        System.out.println("Unwanted Fall Through Demo ");
        switch (jerseyNumber) {
            case 2: case 5:
                System.out.println("Defender");
            case 6: case 8:
                System.out.println("Midfielder");
            case 7: case 11:
                System.out.println("Winger");
            default:
                System.out.println("Unknown");
        }
        System.out.println(" Grouped Case Demo ");
        switch (jerseyNumber) {
            case 2: case 5:
                System.out.println("Defender"); break;
            case 6: case 8:
                System.out.println("Midfielder"); break;
            case 7: case 11:
                System.out.println("Winger"); break;
            default:
                System.out.println("Unknown");
        }

        //  Task 8
        String lineupDecision;
        if (category.equals("Prime Player")) {
            if (roundedWeightKg < 80) {
                lineupDecision = "Starting Lineup";
            } else {
                lineupDecision = "Bench";
            }
        } else {
            lineupDecision = "Bench";
        }
        System.out.println("Lineup Decision: " + lineupDecision);

        // Task 9
        String finalDecision = playerEligibility ? "Play" : "Rest";
        System.out.println("Final Decision: " + finalDecision);

        //  Task 10
        boolean isAttacker = (jerseyNumber == 7 || jerseyNumber == 9 
                            || jerseyNumber == 10 || jerseyNumber == 11);

        System.out.println(" PLAYER REPORT ");
        System.out.println("Player: " + name);
        System.out.println("Age: " + age + " (" + category + ")");
        System.out.println("Height: " + heightCm + " cm");
        System.out.println("Weight: " + roundedWeightKg + " kg");
        System.out.println("Jersey: " + jerseyNumber);
        System.out.println("Position: " + position);
        System.out.println("Attacker jersey: " + (isAttacker ? "Yes" : "No"));
        System.out.println("Eligibility: " + (playerEligibility ? "Eligible" : "Not Eligible"));
        System.out.println("Lineup Decision: " + lineupDecision);
        System.out.println("Final Decision: " + finalDecision);

        input.close();
    }
}