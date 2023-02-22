package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        if (cathetusLength > 0) {
            for (int i = 1; i <= cathetusLength; i++) {
                for (int j = 1; j <= 2 * cathetusLength - 1; j++) {
                    if (j <= cathetusLength - i || j >= cathetusLength + i) System.out.print(" ");
                    if (cathetusLength - i < j && j < cathetusLength) System.out.print(cathetusLength - j + 1);
                    if (cathetusLength <= j && j < cathetusLength + i) System.out.print(j - cathetusLength + 1);
                }
                if (i < cathetusLength) System.out.print("\n");
            }
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
