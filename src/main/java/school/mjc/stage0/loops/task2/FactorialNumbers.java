package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        if (printToInclusive < 2) {
            System.out.println(
                    switch (printToInclusive) {
                        case 0 -> 1;
                        case 1 -> 1 + "\n" + 1;
                        default -> "";
                    }
            );
        } else {
            System.out.println(1);
            int i = 1;
            while (i <= printToInclusive) {
                int j = 1;
                int fact = 1;
                while (j <= i) {
                    fact *= j;
                    j++;
                }
                System.out.println(fact);
                i++;

            }
        }
    }

    public static void main(String[] args) {
        FactorialNumbers factorialNumbers = new FactorialNumbers();
        factorialNumbers.printFactorialRow(5);
    }
}
