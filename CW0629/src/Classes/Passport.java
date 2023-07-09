package Classes;

public class Passport {
    private String name;
    private String nationality;
    private String passNum;

    public Passport(String name, String nationality, String passNum) {
        this.name = name;
        this.nationality = nationality;
        this.passNum = passNum;
    }
    public String getName() {
        return name;
    }
    public String getNationality() {
        return nationality;
    }
    public String getPassNum() {
        return passNum;
    }
}
