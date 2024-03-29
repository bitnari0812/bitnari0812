package com.ohgiraffers.section05.overloading;

public class OverloadingTest {

    /*수업목표. 오버로딩(OverLoading)에 대해 이해할 수 있다.*/
    /*
    * 오버로딩의 사용 이유
    * 매개변수 종류별로 메소드 내용을 다르게 작성해야 하는 경우들이 있다.
    * 이때 동일한 기능의 메소드를 매개변수에 따라 다르게 이름을 정의하면 복잡하고 관리가 어렵다.
    * 규모가 작은 프로그램의 경우는 정도가 덜하지만, 규모가 거대한 경우 메소드 또한 관리가 어려워진다.
    * 따라서 동일한 이름으로 다양한 종류의 매개변수에 따라 처리해야 하는 여러 메소드를 동일한 이름으로 관리하기 위해 사용하는 기술을 오버로딩이라고 한다.
    * */

    /*
    * 오버로딩의 조건
    * 동일한 이름을 가진 메소드의 파라미터(매개변수) 선언부에 매개변수 타입, 갯수, 순서를 다르게 작성하여
    * 한 클래스 내에서 동일한 이름의 메소드를 여러개 작성할 수 있도록 한다.
    * 메소드의 시그니처가 다르면 다른 메소드로 인식하기 때문이다.
    * 즉, 시그니처 중 메소드의 이름은 동일해야하기 때문에 파라미터 선언부가 다르게 작성되어야
    * 오버로딩이 성립된다.
    * */

    /*메소드 시그니처란?
    * public void method(int num){} 이라는 메소드의 메소드명과 파라미터 선언부 부분을 시그니처라고 부른다.
    * method(int num) << 이 부분이 시그니처이다.
    * 메소드 시그니처가 달라야 하기 때문에 접근제한자나 반환형은 오버로딩 성립요건에 해당하지 않는다.
    * */

    public void test(){}

    //public void test(){}     // 에러발생

    //private void test(){}    // 접근제한자가 달라도 에러발생. 접근제한자는 메소드 시그니처에 해당하지 않는다.

    /*public int test(){
        return 0;              // 에러발생. 반환형도 메소드 시그니처에 해당하지 않는다.
    }*/

    public void test(int num){}    // 파라미터 선언부는 메소드 시그니처에 해당합니다.

    //public void test(int num2){}   // 에러발생. 매개변수의 이름은 메소드 시그니처에 영향을 주지 않는다.

    public void test(int num, int num2){}   // 매개변수 갯수에 따른 오버로딩 확인.

    public void test(int num, String name){}  // 매개변수 타입에 따른 오버로딩 확인.

    public void test(String name, int num){}  // 매개변수 순서에 따른 오버로딩 확인.

}
