package chap03.test;

public class Application2 {
    public static void main(String[] args) {
        //Application
        // - Calculator calc = new Calculator
        //
        // - 이 구문은 Calculator 메소드를 호출하기 위해 추가한다.
        // *
        //         *   실행 결과
        //         *   - 메소트 호출 확인
        //         *   - 10과 20의 합 : 30
        //                *   - 10과 5의 차 : 5
        //                *   - 10과 5의 곱 : 50
        //                *   - 10과 5의 나눈 후 몫 : 2
        //                *  */

        Calculator cal = new Calculator();

        // 메소드 호출 확인
        Calculator.checkmethod();

        //10과 20의 합 : 30
        int isum = cal.sumTwoNumber(10,20);
        System.out.println("10과 20의 합은? = "+isum);

        //10과 5의 차 : 5
        int isum2 = cal.minusTwoNumber(10,5);
        System.out.println("10과 5의 차는? = "+isum2);

        //10과 5의 곱 : 50
        int isum3 = cal.multiTwoNumber(10,5);
        System.out.println("10과 5의 곱은? = "+isum3);

        //10과 5의 나눈 후 몫 : 2
        int isum4 = cal.divideTwoNumber(10,5);
        System.out.println("10과 5의 나눈 후 몫은? = "+isum4);

    }
}
