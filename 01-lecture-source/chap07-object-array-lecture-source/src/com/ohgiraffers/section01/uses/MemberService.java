package com.ohgiraffers.section01.uses;

public class MemberService {

    public void signUpMember(){
        Member[] members = new Member[5];
        members[0] = new Member(1,"user01","pass01","홍길동",20,'남');
        members[1] = new Member(1,"user02","pass02","유관순",15,'여');
        members[2] = new Member(1,"user03","pass03","이순신",40,'남');
        members[3] = new Member(1,"user04","pass04","신사임당",36,'여');
        members[4] = new Member(1,"user05","pass05","윤봉길",22,'남');

        MemberRegister memberRegister = new MemberRegister();
        memberRegister.register(members);

    }
    public void showAllMember(){
        MemberFinder finder = new MemberFinder();
        for(Member member : finder.findAllMembers()){
            if(member !=null){
                System.out.println(member.getInformation());
            }
        }
        System.out.println("=================================");
    }

}
