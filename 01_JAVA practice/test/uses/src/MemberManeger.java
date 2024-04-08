import java.util.ArrayList;
import java.util.List;

public class MemberManeger {
    private List<MemberDTO> MList = new ArrayList<>();
    public void addMList(MemberDTO member){
        MList.add(member);
    }
    public List<MemberDTO> showAllMember(){
        return MList;
    }
    public boolean updateMember(MemberDTO updateMember){
        MemberDTO oldOne = null;
        for(int i = 0; i < MList.size(); i++){
            if(MList.get(i).getId() == updateMember.getId()){
                oldOne = MList.set(i,updateMember);
            }
        }
        return oldOne != null;
    }
    public boolean deleteMember(int id){
        MemberDTO oldOne = null;
        for(int i = 0; i <MList.size(); i++){
            if(MList.get(i).getId() == id){
                oldOne = MList.remove(i);
            }
        }
        return oldOne != null;
    }
}

