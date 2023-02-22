package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int result = 1;
        if (power > 0) {
            for (int k = 1; k <= power; k++ ) result *= numberToPrint;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
