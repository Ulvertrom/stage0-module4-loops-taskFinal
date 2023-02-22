package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        if (cathetusLength > 0) {
            for (int i = 1; i <= cathetusLength; i++) {
                for (int j = 1; j <= cathetusLength; j++)
                    System.out.print(j > cathetusLength - i? "*": " ");
                if (i < cathetusLength) System.out.print("\n");
            }

        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
