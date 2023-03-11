package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number = 2; //first prime number
        while (number <= printToInclusive) {
            int count = 0;
            int i = 2;
            while (i <= number / 2) {
                if (number % i == 0) {
                    count++;
                    break;
                }
                i++;
            }
            if (count == 0 && number != 1) {
                System.out.println(number + " ");
            }
            number++;
        }
    }


    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.printPrimeNumbers(5);
    }
}
