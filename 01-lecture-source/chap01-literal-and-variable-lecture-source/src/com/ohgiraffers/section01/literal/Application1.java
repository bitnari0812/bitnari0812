package com.ohgiraffers.section01.literal;

public class Application1 {

    public static void main(String[]args){

        /*수업목표 : 여러 값의 형태를 출력할 수 있다*/
        /*숫자는 따옴표 없음*/
        /*1. 숫자 형태의 값*/
        /*1-1. 정수 형태의 값*/
        System.out.println(1234);
        //123 정수
        /*1-2. 실수 형태의 값*/
        System.out.println(1.23);
        //1.23 실수

        /*문자 형태의 값 출력*/
        System.out.println('a'); //문자 형태의 값은 홀따옴표로 감싸주어야 한다
        //System.out.println('ab'); //홀따옴표 안-두 개 이상의 문자는 취급하지 않기 때문에 에러 발생
        //System.out.println(''); 아무 문자도 기입되지 않는 경우 에러 발생
        System.out.println('1'); //숫자 값이지만 홀따옴표 감싸져 있는 경우 문자 1로 판단
        System.out.println('남');


        /*문자 열 형태의 값 출력*/
        System.out.println("안녕하세요"); //문자 열(문자 여러개) 형태의 값은 쌍따옴표로 감싸주어야 한다
        System.out.println("123"); //정수이지만 쌍따옴표로 감싸져 있기 때문에 문자열로 판단
        System.out.println(" "); //아무것도 없는 빈-공백포함- 쌍따옴표도 문자열로 판단
        System.out.println("a"); //한 개의 문자도 쌍따옴표로 감싸면 문자열 판단 (문자 a와는 다름)

        /*4. 논리 형태의 값 출력*/
        // 참이냐 거짓이냐 (두가지의 값만 가짐)

        System.out.println(true); //뱀은 파충류인가요? 참
        System.out.println(false); // 뱀은 식물인가요? 거짓

        //true 혹은 false 값을 논리형이라고 한다



    }
}
