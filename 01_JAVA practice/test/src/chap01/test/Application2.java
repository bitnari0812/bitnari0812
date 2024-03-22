package chap01.test;

public class Application2 {
    public static void main(String[] args) {
        /* Application02
         * 사각형의 넓이와 둘레를 구하는 문제이다.
         * 너비 12.5 높이 36.4를 변수에 저장하고
         * 각 넓이와 둘레를 계산해 변수에 담고 아래와 같이 출력되도록 하시오
         *
         * -- 출력 예시 --
         * 면적 : 455.0
         * 둘레 : 97.8
         *  */

        double dnum1 = 12.5;
        double dnum2 = 36.4;
        System.out.println("너비가 12.5, 높이가 36.4인 사각형이 있다. 이때 사각형의 넓이는? = "+(dnum1*dnum2));
        System.out.println("너비가 12.5, 높이가 36.4인 사각형이 있다. 이때 사각형의 둘레는? = "+((dnum1+dnum2)*2));
    }
}
