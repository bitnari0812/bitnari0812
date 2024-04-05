package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application3 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        try {
            et.checkEnoughMoney(20000,30000);
        } catch (PriceNegativeException | MoneyNegativeException e) {  // |를 활용하여 두개로 묶을 수 있다.(부모가같은경우)
            /*예외가 발생한 클래스의 이름을 알 수 있다.*/
            System.out.println(e.getClass()+"발생!!");
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e) {
            /*예외 클래스명, 예외 발생 위치, 예외 메시지를 stack 호출 역순으로 빨간색 글씨를 이용해서 로그 형태로 출력해주는 기능*/
            e.printStackTrace();
        }finally {
            System.out.println("finally 블럭 동작함...");
        }
        System.out.println("프로그램을 종료합니다...");
    }
}
