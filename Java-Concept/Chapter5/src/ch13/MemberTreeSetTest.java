package ch13;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2) * -1;
    }
}

public class MemberTreeSetTest {
    public static void main(String[] args) {
        
/*
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberHong = new Member(1004, "홍길동");
        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");

        memberTreeSet.addMember(memberHong);
        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberKang);

        memberTreeSet.showAllMember();
*/
        TreeSet<String> treeSet = new TreeSet<>(new MyCompare());
        treeSet.add("Lee");
        treeSet.add("Kim");
        treeSet.add("Park");

        System.out.println(treeSet);
    }
}
