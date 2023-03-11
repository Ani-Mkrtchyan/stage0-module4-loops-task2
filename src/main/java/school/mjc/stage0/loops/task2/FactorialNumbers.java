package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int fact = 1;
        int i = 1;
        while (i <= printToInclusive) {
            fact *= i;
            System.out.println(i);
            i++;

        }
        System.out.println("Factorial of " + printToInclusive + " is: " + fact);
    }

    public static void main(String[] args) {
        FactorialNumbers factorialNumbers = new FactorialNumbers();
        factorialNumbers.printFactorialRow(5);
    }
}
