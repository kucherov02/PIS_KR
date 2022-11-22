package StudentCouncil;

public class PRHead implements Person{

    private Member member;

    public PRHead(Member member){
        this.member = member;
    }


    public int getAdvancedPoints() {
        return member.getAdvancedPoints() + 30;
    }

    @Override
    public String getDuties() {
        return member.getDuties() + " Займається піаром";
    }
}
