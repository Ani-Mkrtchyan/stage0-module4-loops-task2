package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int num = 0;
        while (num <= printTillInclusive) {
            System.out.println(num);
            num += 2;


        }
    }

    public static void main(String[] args) {
        EvenNumbersPrinter evenNumbersPrinter = new EvenNumbersPrinter();
        evenNumbersPrinter.printEvenNumbers(15);

    }
}
