package StudentCouncil;

public class ProjectHead implements Person {

   private Member member;

   public ProjectHead(Member member){ this.member = member;}

    @Override
    public int getAdvancedPoints() {
        return member.getAdvancedPoints() + 50;
    }

    @Override
    public String getDuties() {
        return member.getDuties() + " Займається проєктами";
    }
}
