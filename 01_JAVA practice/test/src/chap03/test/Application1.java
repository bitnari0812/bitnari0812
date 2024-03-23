package chap03.test;

public class Application1 {
    public static void main(String[] args) {
        // *   Application01
        // *   - main(args:String[]): void 설명 : 모든 메소드는 main 함수에서 호출하여 출력한다.
        // 메소드 호출 확인용 메소드 호출
        // 10, 20 두 개의 정수를 매개변수로 하여 두 수를 더하는 메소드 호출 후 리턴값 출력
        // 10, 5 두 개의 정수를 매개변수로 하여 두 수의 차를 구하는 메소드 호출 후 리턴값 출력
        // 10, 5 두 개의 정수를 매개변수로 하여 두 수의 곱을 구하는 메소드 호출 후 리턴값 출력
        // 10, 5 두 개의 정수를 매개변수로 하여 두 수의 몫을 구하는 메소드 호출 후 리턴값 출력


// 메소드 호출 확인용 메소드 호출 후 리턴값 출력
        System.out.println(sumTwoNumber(10, 20));
        System.out.println(minusTwoNumber(10, 5));
        System.out.println(multiTwoNumber(10, 5));
        System.out.println(divideTwoNumber(10, 5));
    }

    // 두 수를 더하는 메소드
    public static int sumTwoNumber(int a, int b) {
        return a + b;
    }

    // 두 수의 차를 구하는 메소드
    public static int minusTwoNumber(int a, int b) {
        return a - b;
    }

    // 두 수의 곱을 구하는 메소드
    public static int multiTwoNumber(int a, int b) {
        return a * b;
    }

    // 두 수의 몫을 구하는 메소드
    public static int divideTwoNumber(int a, int b) {
        return a / b;
    }
}
