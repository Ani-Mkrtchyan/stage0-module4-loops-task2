package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        } else {
            int i = 0;
            while (i <= power) {
                int result = (int) Math.pow(2, i);
                System.out.println("Power of two  " + result);
                i++;
            }
        }

    }

    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        powerOfTwo.printPower(10);
    }
}
