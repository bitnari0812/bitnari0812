package com.ohgiraffers.section04.comparison;

public class Application1 {

    public static void main(String[] args){

        /*비교연산자에 대해 이해하고 활용할 수 있다.*/
        /*
        * 비교연산자
        * 비교연산자는 피연산자 사이에 상대적인 크기를 판단하여 참 혹은 거짓을 변환하는 연산자
        * 연산자 중 참 혹은 거짓을 반환하는 연산자는 상황연산자와 조건식이나 조건문의 조건절에 많이 사용한다
        * (충분히 연습이 필요함!)
        * */

        /*
        * 비교연산자의 종류
        * '==' : 왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 true 다르면 false를 반환
        * '!=' : 왼쪽의 피연산자와 오른쪽의 피연산자가 다르면 ture 같으면 false를 반환
        * '>' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크면 true 작으면 false를 반환
        * '>=' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크거나 같으면 true 아니면 false를 반환
        * '<' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 작으면 true 크면 false를 반환
        * '<=' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 작거나 같으면 true 아니면 false를 반환
        * */

        /*1. 숫자값 비교*/
        /*1-1. 정수 비교*/
        int inum1 = 10;
        int inum2 = 20;

        System.out.println("======정수 값 비교======");
        System.out.println("inum1과 inum2가 같은지 비교 : "+(inum1 == inum2));
        System.out.println("inum1과 inum2가 다른지 비교 : "+(inum1 != inum2));
        System.out.println("inum1이 inum2보다 큰지 비교 : "+(inum1 > inum2));
        System.out.println("inum1이 inum2보다 크거나 같은지 비교 : "+(inum1 >= inum2));
        System.out.println("inum1이 inum2보다 작은지 비교 : "+(inum1 < inum2));
        System.out.println("inum1이 inum2보다 작거나 같은지 비교 : "+(inum1 <= inum2));


        System.out.println("======실수 값 비교======");
        double dnum1 = 10.0;
        double dnum2 = 20.0;
        System.out.println("dnum1과 dnum2이 같은지 비교 : "+(dnum1 == dnum2));
        System.out.println("dnum1과 dnum2이 다른지 비교 : "+(dnum1 != dnum2));
        System.out.println("dnum1이 dnum2보다 큰지 비교 : "+(dnum1 > dnum2));
        System.out.println("dnum1이 dnum2보다 크거나 같은지 비교 : "+(dnum1 >= dnum2));
        System.out.println("dnum1이 dnum2보다 작은지 비교 : "+(dnum1 < dnum2));
        System.out.println("dnum1이 dnum2보다 작거나 같은지 비교 : "+(dnum1 <= dnum2));

        /*2. 문자값 비교*/
        char ch1 = 'a';
        char ch2 = 'A';
        System.out.println("======문자값 비교======");
        System.out.println("ch1과 ch2가 같은지 비교 : "+(ch1 == ch2));
        System.out.println("ch1과 ch2가 다른지 비교 : "+(ch1 != ch2));
        System.out.println("ch1이 ch2보다 큰지 비교 : "+(ch1 > ch2));
        System.out.println("ch1이 ch2보다 크거나 같은지 비교 : "+(ch1 >= ch2));
        System.out.println("ch1이 ch2보다 작은지 비교 : "+(ch1 < ch2));
        System.out.println("ch1이 ch2보다 작거나 같은지 비교 : "+(ch1 <= ch2));

        /*3. 논리값 비교*/
        /*논리값은 ==과 !=은 비교 가능하지만, 대소비교는 불가능하다.*/
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("======문자값 비교======");
        System.out.println("bool1과 bool2가 같은지 비교 : "+(bool1 == bool2));
        System.out.println("bool1과 bool2가 다른지 비교 : "+(bool1 != bool2));
        //System.out.println("bool1이 bool2보다 큰지 비교 : "+(bool1 > bool2)); //에러 발생


        /*4. 문자열의 값 비교*/
        /*문자열도 ==과 !=는 비교 가능하지만, 대소비교는 불가능하다.*/
        String str1 = "java";
        String str2 = "java";
        System.out.println("======문자열값 비교======");
        System.out.println("str1과 str2이 같은지 비교 : "+(str1 == str2));
        System.out.println("str1과 str2가 다른지 비교 : "+(str1 != str2));
        //System.out.println("str1이 str보다 큰지 비교 : "+(str1 > str2)); //에러 발생

        int x = 10;
        int y = 11;

        boolean result = x <= y;
        System.out.println(result);           //대입연산자(==)


    }


}
