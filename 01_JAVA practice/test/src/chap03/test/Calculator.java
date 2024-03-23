package chap03.test;
public class Calculator {
    public static void main(String[] args) {
        /* 다음 조건을 만족하는 프로그램을 작성하시오.
         *   구현 클래스 Calculator, Application01
         *   구현 내용
         *   Calculator
         *   - checkMethod(): void 설명 : 함수 호출, 확인용 메소드
         *   - sumTwoNumber(a:int, b:int): int 설명 : 두 수를 입력 받아 합을 리턴한다.
         *   - minusTwoNumber(a:int, b:int): int 설명 : 두 수를 입력 받아 차를 리턴한다.
         *   - multiTwoNumber(a:int, b:int): int 설명 : 두 수를 입력 받아 곱한 값을 리턴한다.
         *   - divideTwoNumber(a:int, b:int): int 설명 : 두 수를 입력 받아 나눈 값을 리턴한다
         */
        // 함수 호출, 확인용 메소드
    }

    public static void checkmethod() {
    }

    public void checkMethod() {
            System.out.println("함수 호출 확인용 메소드입니다.");
        }

        // 두 수를 입력 받아 합을 리턴하는 메소드
        public int sumTwoNumber(int a, int b) {
            return a + b;
        }

        // 두 수를 입력 받아 차를 리턴하는 메소드
        public int minusTwoNumber(int a, int b) {
            return a - b;
        }

        // 두 수를 입력 받아 곱한 값을 리턴하는 메소드
        public int multiTwoNumber(int a, int b) {
            return a * b;
        }

        // 두 수를 입력 받아 나눈 값을 리턴하는 메소드
        public int divideTwoNumber(int a, int b) {
            return a / b;
        }
    }
