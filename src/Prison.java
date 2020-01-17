import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Prison {


    private ArrayList<Cell> cellList = new ArrayList<>();

    public void addPrisoner(String prisonerName, String crimeCommited, int prisonerAge, int sentencedFor, boolean inSollitary) {
        cellList.add(new Cell(new Prisoner(prisonerName, crimeCommited, prisonerAge, sentencedFor, inSollitary)));
    }

    public void load(String filename) {
        try {
            String jsonString = new String(Files.readAllBytes(Paths.get(filename)));
            JSONArray jsonArray = new JSONArray(jsonString);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                Cell prisoner = new Cell(new Prisoner(jsonObject));
                cellList.add(prisoner);
            }
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }

    public void save(String filename) {
        JSONArray jsonArray = new JSONArray();
        for (Cell prisoner : cellList) {
            jsonArray.put(prisoner.toJSONObject());
        }

        try {
            String jsonString = jsonArray.toString(2);
            Files.write(Paths.get(filename), jsonString.getBytes());
        } catch (Exception e) {
            System.out.println("Something went wrong" + e.getMessage());
        }
    }


    // Alle print methods.
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

    @Override
    public String toString() {
        return cellList.toString();
    }


}




