package StudentCouncil;

public class Head implements Person{
    private Member member;

    public Head(Member member){
        this.member = member;
    }


    @Override
    public int getAdvancedPoints() {
        return member.getAdvancedPoints() + 60;
    }

    @Override
    public String getDuties() {
        return member.getDuties() + " Керує організацією";
    }
}
