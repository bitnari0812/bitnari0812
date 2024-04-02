package chap04.test;

import java.util.Scanner;

public class Application5 {
    public static void main(String[] args) {
        /* 1부터 입력받은 정수까지의 짝수의 합을 구하세요
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 10
         *
         * -- 출력 예시 --
         * 1부터 10까지 짝수의 합 : 30
         * */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int answer = sc.nextInt();
        int sum = 0;
        for(int i = 0; i <= answer; i++){
            if(i%2==0){
                sum+= i;
            }
        }
        System.out.println("1부터 "+answer+"까지의 짝수의 합 = "+sum);
    }
}
