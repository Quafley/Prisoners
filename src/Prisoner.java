import org.json.JSONObject;

public class Prisoner {

    private String prisonerName;
    private String crimeCommited;
    private int prisonerAge;
    private int sentencedFor;
    private boolean inSollitary;

    public Prisoner(String prisonerName, String crimeCommited, int prisonerAge, int sentencedFor, boolean inSollitary) {
        this.prisonerName = prisonerName;
        this.crimeCommited = crimeCommited;
        this.prisonerAge = prisonerAge;
        this.sentencedFor = sentencedFor;
        this.inSollitary = inSollitary;
    }

    public Prisoner(JSONObject jsonObject) {
        this.prisonerName = jsonObject.getString("name");
        this.crimeCommited = jsonObject.getString("crime");
        this.prisonerAge = jsonObject.getInt("age");
        this.sentencedFor = jsonObject.getInt("sentenced_for");
        this.inSollitary = jsonObject.getBoolean("sollitary");
    }




    @Override
    public String toString() {
        return "Name: " + getPrisonerName() + "\nCommited Crime: " + getCrimeCommited() + "\nPrisoners Age: " + getPrisonerAge() + "\nSentenced for: " + getSentencedFor() + " years." + "\nIn sollitary: " + isInSollitary() + "\n";
    }

    //getters
    public String getPrisonerName() {
        return prisonerName;
    }

    public String getCrimeCommited() {
        return crimeCommited;
    }

    public int getPrisonerAge() {
        return prisonerAge;
    }

    public int getSentencedFor() {
        return sentencedFor;
    }

    public boolean isInSollitary() {
        return inSollitary;
    }


}








