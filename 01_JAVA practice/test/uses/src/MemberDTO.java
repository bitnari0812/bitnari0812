public class MemberDTO {
    private static int nextId = 1;
    private int id;
    private String name;
    private String pwd;
    private int age;

    public MemberDTO(String name, String pwd, int age) {
        this.id = nextId++;
        this.name = name;
        this.pwd = pwd;
        this.age = age;
    }

    public MemberDTO(int id, String name, String pwd, int age) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.age = age;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        MemberDTO.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                '}';
    }
}
