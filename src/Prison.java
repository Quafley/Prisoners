import java.util.ArrayList;

public class Prison {

    private ArrayList<Cell> cellList = new ArrayList<>();

    public void addPrisoner(String prisonerName, String crimeCommited, int prisonerAge, int sentencedFor, String inSollitary) {
        cellList.add(new Cell(new Prisoner(prisonerName, crimeCommited, prisonerAge, sentencedFor, inSollitary.equalsIgnoreCase("yes"))));
    }

    @Override
    public String toString() {
        return cellList.toString();
    }

    public void printJail() {
        for (Cell cell : cellList) {
            System.out.println(cell.printCell());
        }
    }

    public void printValue(int age) {
        ArrayList<String> nieuwelijst = new ArrayList<>();
        for (Cell cell : cellList) {
            if (cell.getPrisoner().getPrisonerAge() == age) {
                nieuwelijst.add(cell.printCell());
            }
        }
        printArrayList(nieuwelijst);
    }

    public void printSpecificWord(String word) {
        //ArrayList<String> nieuwelijst = new ArrayList<>();
        for (Cell cell: cellList) {
            if(cell.getPrisoner().getCrimeCommited().contains(word)) {
                System.out.println(cell.printCell());
            }
        }
    }

    public void printSollitary(boolean inSollitary) {
        ArrayList<String> nieuwelijst = new ArrayList<>();
        for (Cell cell: cellList) {
            if(cell.getPrisoner().isInSollitary() == inSollitary) {
                nieuwelijst.add(cell.printCell());
            }
        }
        printArrayList(nieuwelijst);
    }

    public void printArrayList(ArrayList<String> array) {
        for (String prisoners: array
        ) {
            System.out.println(prisoners);
        }
    }

    public int printGemiddelde() {
        int gemiddeldestence = 0;
        for (Cell cell : cellList) {
            gemiddeldestence = gemiddeldestence + cell.getPrisoner().getPrisonerAge();
        }
        gemiddeldestence = gemiddeldestence / cellList.size();
        return gemiddeldestence;
    }

}




