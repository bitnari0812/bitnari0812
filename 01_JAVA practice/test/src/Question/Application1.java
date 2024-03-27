package Question;

public class Application1 {
    public static void main(String[] args) {

        //1. 기본자료형 8가지를 선언 및 초기화
        byte bnum = 1;
        short snum = 2;
        int inum = 3;
        long lnum = 4L;
        float fnum = 5.0f;
        double dnum = 6.0d;
        char cha = 'A';
        boolean boo = false;
        String str = "안녕하세요";

        //2. 정수 int의 값을 long 타입과 합
        int sum = inum+(int)lnum;
        System.out.println("int 값과 long 값의 합은? = "+(sum));

        //3. 삼항연산자를 이용해 2.의 합계를 0보다 클 때 정수입니다, 0보다 작을 때 음수입니다 표기
        String sum2 = (sum > 0)? "정수입니다." : "음수입니다.";
    }

}

