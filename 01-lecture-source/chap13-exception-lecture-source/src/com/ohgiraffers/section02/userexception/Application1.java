package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application1 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        try {
            et.checkEnoughMoney(30000,50000);  //정상작동하는 것
            //et.checkEnoughMoney(-50000,10000); //사용자오류1(상품가격음수) 출력
            //et.checkEnoughMoney(50000,-60000);  //사용자오류2(가진돈음수) 출력
            //et.checkEnoughMoney(50000,30000); //사용자오류3(가진돈부족) 출력
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
