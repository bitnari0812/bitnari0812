package com.ohgiraffers.section04.wrapper;

public class Application2 {
    public static void main(String[] args) {

        /*문자열 파싱(parsing)에 대해 이해할 수 있다*/
        /*
        * parsing : 문자열(String)값을 기본자료형 값으로 변경하는 것을 parsing이라고 한다.
        * */

        byte b = Byte.parseByte("1");
        short s = Short.parseShort("22");
        int i = Integer.parseInt("4");
        long l = Long.parseLong("8");  // 8L은 안됨 (L 없이)
        float f = Float.parseFloat("4.0f");  // f는 됨
        double d = Double.parseDouble("4.0");
        boolean bl = Boolean.parseBoolean("true");
        char c = "abc".charAt(0);   // 문자는 파싱 안됨

    }
}
