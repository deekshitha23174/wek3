public class PrimeNumbers {
    public static void main(String[] args) {
        int num = 29; // Change this value to check different numbers
        boolean isPrime = true;

        // Check if the number is prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime && num > 1) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
