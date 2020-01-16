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

    @Override
    public String toString() {
        return "Name: " + getPrisonerName() + "\nCommited Crime: " + getCrimeCommited() + "\nPrisoners Age: " + getPrisonerAge() + "\nSentenced for: " + getSentencedFor() + " years." + "\nIn sollitary: " + isInSollitary() + "\n";
    }

    //getters & setters
    public String getPrisonerName() {
        return prisonerName;
    }

    public void setPrisonerName(String prisonerName) {
        this.prisonerName = prisonerName;
    }

    public String getCrimeCommited() {
        return crimeCommited;
    }

    public void setCrimeCommited(String crimeCommited) {
        this.crimeCommited = crimeCommited;
    }

    public int getPrisonerAge() {
        return prisonerAge;
    }

    public void setPrisonerAge(int prisonerAge) {
        this.prisonerAge = prisonerAge;
    }

    public int getSentencedFor() {
        return sentencedFor;
    }

    public void setSentencedFor(int sentencedFor) {
        this.sentencedFor = sentencedFor;
    }

    public boolean isInSollitary() {
        return inSollitary;
    }

    public void setInSollitary(boolean inSollitary) {
        this.inSollitary = inSollitary;
    }
}








