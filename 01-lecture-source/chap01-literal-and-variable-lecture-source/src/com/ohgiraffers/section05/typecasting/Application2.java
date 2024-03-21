package com.ohgiraffers.section05.typecasting;

public class Application2 {

    public static void main(String[] args){

        /*수업목표. 강제 형변환 규칙에 대해 이해할 수 있다.*/
        /*
        * 강제 형변환
        * 바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환한다.
        * 예) (바꿀 자료형) 값;
        * */

        /*
        * 자동형변환 규칙의 반대 상황에서 강제형변환이 필요하다.
        * 1. 강제형변환 규칙
        *   1-1. 큰 자료형에서 작은 자료형으로 변경시 강제형변환이 필요하다.
        *   1-2. 실수를 정수로 변경시 강제형변환이 필요하다.
        *   1-3. 문자형을 int미만 크기의 변수에 저장할 떄 강제형변환이 필요하다.
        *   1-4. 논리형은 강제형변환 규칙에서도 제외된다.
        * */

        /*1-1. 큰 자료형에서 작은 자료형으로 변경시 강제형변환이 필요하다.*/
        /*1-1-1. 정수끼리의 강제형변환*/
        long lnum = 8;
        //int inum = lnum;          //데이터 손실 가능성을 컴파일러가 알려준다. (에러남)
        int inum = (int)lnum;       //변경하려는 자료형을 명시해서 강제형변환을 해야한다.

        short snum = (short)inum;   //데이터 손실이 되더라도 강제형변환이 필요할때 쓴다.


        /*1-1-2. 실수끼리의 강제형변환*/
        double dnum = 8.0;
        //float fnum = dnum;        //오류발생
        float fnum = (float)dnum;   //강제형변환


        /*1-2. 실수를 정수로 변경시 강제형변환이 필요하다.*/
        float fnum1 = 4.0f;
        //long lnum = fnum1;           //소수점 자리 이하의 데이터 손실 가능성으로 자료형의 바이트값이 크더라도 자동형변환이 불가능함
        lnum = (long) fnum1;


        /*1-3. 문자형을 int미만 크기의 변수에 저장할 때 강제형변환이 필요하다.(*비트값 차이)*/
        int num1 = 97;
        int num2 = -97;

        char ch2 = (char) num1;
        char ch3 = (char) num2;

        System.out.println("ch2 : "+ch2);
        System.out.println("ch3 : "+ch3);

        /*1-4. 논리형은 강제형변환 규칙에서도 제외된다.*/
        //boolean isTrue = true;
        //byte b = (byte) isTrue;



    }


}
