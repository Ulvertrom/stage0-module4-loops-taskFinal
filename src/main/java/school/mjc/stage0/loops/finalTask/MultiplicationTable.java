package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        if (numberTableToPrint >= 0) {
            for (int multiplied = 1; multiplied <= 10; multiplied++)
                System.out.println(multiplied + " x " + numberTableToPrint + " = " + multiplied * numberTableToPrint);
        }
    }
}
