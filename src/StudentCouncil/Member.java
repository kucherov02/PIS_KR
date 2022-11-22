package StudentCouncil;

public class Member implements Person{
    private int advancedPoints =  20;
    private String duties = "Брати участь у заходах Студентської ради |";
    @Override
    public int getAdvancedPoints() {
        return advancedPoints;
    }

    @Override
    public String getDuties() {
        return duties;
    }
}
