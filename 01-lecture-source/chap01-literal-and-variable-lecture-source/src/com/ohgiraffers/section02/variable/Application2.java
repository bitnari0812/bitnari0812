package com.ohgiraffers.section02.variable;

public class Application2 {

    public static void main(String[]args){

        /*수업목표 : 변수를 선언하고 값을 할당하여 사용할 수 있다*/
        /*변수를 사용하는 방법*/
        /*1. 변수를 준비한다(선언)*/
        /*2. 변수의 값을 대입한다(값, 대입 및 초기화)*/
        /*3. 변수를 사용한다.*/


        /*자료형이란?*/
        /*다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 Compiler와 약속한 키워드이다*/
        /*예) 앞에서 사용한 int 자료형은 정수를 4byte만큼 읽어서 하나의 값으로 취급하겠다는 약속이다*/
        /*이러한 자료값은 기본자료형(Primary type)과 참조자료형(Referance type)으로 나누어진다*/
        /*그 중 기본자료형 8가지부터 살펴보기로 한다*/
        /**/

        /*1-1-1. 숫자를 취급하는 자료형*/
        /*정수를 취급하는 자료형에는 4가지가 있다.*/
        byte bnum;       //1byte
        short snum;      //2byte
        int inum;        //4byte
        long lnum;       //8byte

        /*실수를 취급하는 자료형은 2가지가 있다.*/
        float fnum;      //4byte
        double dnum;     //8byte


        /*1-1-2. 문자를 취급하는 자료형*/
        /*문자를 취급하는 자료형은 한 가지가 있다.*/
        char ch;          //2byte

        /*1-1-3. 논리값을 취급하는 자료형*/
        boolean isTrue;   //1byte

        /*이상 8가지를 기본자료형이라고 한다(외울것)*/

        /*1-1-4. 문자열을 취급하는 자료형*/
        String str;       //4byte(엄밀히 이야기하면 주소값은 4byte 정수값)


    }


}
