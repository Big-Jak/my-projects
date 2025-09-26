import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a number here: ");
        int number = scanner.nextInt();
        boolean isPrime = true;
 
        if (number < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; 
                }
            }
        }
        
        // Prints the result
        if (isPrime) {
            System.out.println("Your number is a prime number");
        } else {
            System.out.println("Your number is not a prime number");
        }
    }
}