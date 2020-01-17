import org.json.JSONObject;

public class Cell {

    private int currentCellNumber;
    private static int cellNumber = 0;
    private Prisoner prisoner;

    public Cell(Prisoner prisoner) {
        this.prisoner = prisoner;
        cellNumber++;
        this.currentCellNumber = cellNumber;
    }

    public JSONObject toJSONObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", prisoner.getPrisonerName());
        jsonObject.put("crime", prisoner.getCrimeCommited());
        jsonObject.put("age", prisoner.getPrisonerAge());
        jsonObject.put("sentenced_for", prisoner.getSentencedFor());
        jsonObject.put("sollitary", prisoner.isInSollitary());
        return jsonObject;
    }

    public String printCell() {
        return "Current cellnumber: " + currentCellNumber + "\n" + prisoner.toString();
    }

    public Prisoner getPrisoner() {
        return this.prisoner;
    }
}
