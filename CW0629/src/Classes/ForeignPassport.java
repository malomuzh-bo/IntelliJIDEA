package Classes;

import java.util.*;

public class ForeignPassport extends Passport {
    private String fPassNum;
    private List<String> visas;

    public ForeignPassport(String name, String nationality, String passNum, String fPassNum) {
        super(name, nationality, passNum);
        this.fPassNum = fPassNum;
        this.visas = new ArrayList<>();
    }
    public String getForeignPassNum() {
        return fPassNum;
    }
    public void addVisa(String visa) {
        visas.add(visa);
    }
    public List<String> getVisas() {
        return visas;
    }
}
