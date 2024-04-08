import javax.management.loading.MLet;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    private Scanner sc = new Scanner(System.in);
    private MemberManeger MManer = new MemberManeger();

    public void mainmenu(){

        mainmenu:
        while (true){
            System.out.println("== == == 회원 정보 관리 == == ==");
            System.out.println("1. 회원 정보 추가");
            System.out.println("2. 회원 정보 조회");
            System.out.println("3. 회원 정보 수정");
            System.out.println("4. 회원 정보 삭제");
            System.out.println("0. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            sc.nextInt();
            sc.nextLine();

            switch

        }
    }

    public void addMember(){
        System.out.println("== == == 회원 추가 == == ==");
        System.out.print("회원번호 : ");
        int id = sc.nextInt();
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.println("비밀번호 : ");
        String pwd = sc.nextLine();
        System.out.println("나이 : ");
        int age = sc.nextInt();
        MManer.addMList(new MemberDTO(id,name,pwd,age));
    }
    public void showAllMember(){
        System.out.println("== == == 회원 조회 == == ==");
        List<MemberDTO> memberList = MManer.showAllMember();
        if(!memberList.isEmpty()){
            for(MemberDTO member : memberList){
                System.out.println(member);
            }
        }else{
            System.out.println("목록이 존재하지 않습니다.");
        }
    }
    public void updateMember(){
        System.out.println("== == == 회원 정보 수정 == == ==");
        System.out.print("수정할 회원의 번호 : ");
        int id = sc.nextInt();
        System.out.println("수정할 회원 이름 : ");
        String name = sc.nextLine();
        System.out.println("수정할 회원 비밀번호 : ");
        String pwd = sc.nextLine();
        System.out.println("수정할 회원 나이 : ");
        int age = sc.nextInt();

        MemberDTO updateMember = new MemberDTO(id,name,pwd,age);
        if(MManer.updateMember(updateMember)){
            System.out.println("성공적으로 수정되었습니다.");
        }else {
            System.out.println("수정할 정보를 찾지 못했습니다.");
        }
    }
    public void deliteMember(){
        System.out.println("== == == 회원 정보 삭제 == == ==");
        System.out.println("삭제할 회원의 번호 : ");
        if(MManer.deleteMember(sc.nextInt())){
            System.out.println("성공적으로 삭제되었습니다.");
        }else {
            System.out.println("삭제할 정보를 찾지 못했습니다.");
        }
    }
}
