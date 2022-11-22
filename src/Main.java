import StudentCouncil.Head;
import StudentCouncil.Member;
import StudentCouncil.PRHead;
import StudentCouncil.ProjectHead;

import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        //based object of member of the Student Council, with based advanced points and duties
        Member member = new Member();
        System.out.println("Member of SC | AP: " +member.getAdvancedPoints()+" | Duties: " + member.getDuties());

        // the head of the SC, with the biggest advanced points and the main duties
        Head head = new Head(member);
        System.out.println("Head of SC | AP: " +head.getAdvancedPoints()+" | Duties: " + head.getDuties());

        // the head of PR of the SC, with the advanced points and some special duties
        PRHead prHead = new PRHead(member);
        System.out.println("PRHead of SC | AP: " +prHead.getAdvancedPoints()+" | Duties: " + prHead.getDuties());

        // the head of projects of the SC, with the advanced points and some special duties
        ProjectHead projectHead = new ProjectHead(member);
        System.out.println("ProjectHead of SC | AP: " +projectHead.getAdvancedPoints()+" | Duties: " + projectHead.getDuties());

    }
}