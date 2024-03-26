package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {

        /*수업목표. 배열을 사용하는 예시를 이해하고 적용할 수 있다.*/
        /*5명의 자바 점수를 정수로 "입력받아서(스캐너 쓰라는 뜻)" 합계와 평균을 실수로 구하는 프로그램을 만들어 보세요.*/

        int[] scores = new int[5];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < scores.length; i++){

            System.out.print((i+1)+"번 째 학생의 자바 점수를 입력해주세요 : "); //컴퓨터는 0부터 시작하기 때문에 +1해준다.
            scores[i] = sc.nextInt();
        } //여기까지가 점수를 받는 내용

        double sum = 0.0;
        double avg = 0.0;

        for (int i = 0; i < scores.length; i++){
            sum += scores[i];
        }  //여기까지가 합계를 구하는 내용

        avg = sum / scores.length;

        System.out.println("sum = "+sum);
        System.out.println("avg = "+avg); //여기까지가 평균을 구하는 내용

    }
}
