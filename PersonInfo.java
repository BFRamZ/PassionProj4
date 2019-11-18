public class PersonInfo {
    private int numKids;
    private String name;

    public void setNumKids(int setPersonsKids) {
        numKids = setPersonsKids;
    }

    public void incNumKids() {
        numKids = numKids + 1;
    }

    public int getNumKids() {
        return numKids;
    }

    public void setName(String setPersonsName) {
        name = setPersonsName;
    }
    public String getName() {
        return name;
    }
}
