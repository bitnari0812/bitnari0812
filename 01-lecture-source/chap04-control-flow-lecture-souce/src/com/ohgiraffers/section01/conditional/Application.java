package com.ohgiraffers.section01.conditional;

public class Application {
    public static void main(String[] args) {

        A_if a = new A_if();
        /*단독 if 문 흐름 확인용 메소드 출력*/
        //a.testSimpleIfStatement();

        /*중첩된 if문 흐름 확인용 메소드 출력*/
        //a.testNestedIfStetement();


        B_ifElse b = new B_ifElse();
        /*단독 if-else 흐름 확인용 메소드 출력*/
        //b.simpleIfElseStatement();

        /*중첩 if-else 흐름 확인용 메소드 출력*/
        //b.testNestedIfElsestatment();

        C_ifElseIf c = new C_ifElseIf();
        //c.testSimpleIfElseIfStatement();
        //c.testNestedIfElseIfStatement();

        D_switch d = new D_switch();
        //d.testSipleSwichStatement();
        d.testSwitchVendingMachine();
    }
}
