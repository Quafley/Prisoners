public class Cell {

    private int currentCellNumber;
    private static int cellNumber = 0;
    private Prisoner prisoner;

    public Cell(Prisoner prisoner) {
        this.prisoner = prisoner;
        cellNumber++;
        this.currentCellNumber = cellNumber;
    }

    public String printCell() {
        return "Current cellnumber: " + currentCellNumber + "\n" + prisoner.toString();
    }

    public Prisoner getPrisoner() {
        return this.prisoner;
    }
}
