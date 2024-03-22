package chap01.test;

public class Application1 {
    public static void main(String[] args) {
        /* Application01
         * 정수형 변수 2개를 선언하여  각 20과 30으로 초기화 한 후
         * 두 수의 더하기, 빼기, 곱하기, 나누기, 나머지를 다음과 같이 출력하세요
         *
         * -- 출력 예시 --
         * 더하기 결과  : 50
         * 빼기 결과 : -10
         * 곱하기 결과 : 600
         * 나누기한 몫 : 0
         * 나누기한 나머지 : 20
         * */

        int inum1 = 20;
        int inum2 = 30;

        System.out.println("20과 30의 합은? = "+(inum1+inum2));
        System.out.println("20에서 30을 빼면? = "+(inum1-inum2));
        System.out.println("20과 30을 곱하면? = "+(inum1*inum2));
        System.out.println("20을 30으로 나누면? = "+(inum1/inum2));
        System.out.println("20에서 30을을 나눈 나머지 값은? = "+(inum1%inum2));
    }
}
