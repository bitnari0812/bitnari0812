package chap02.test;

public class Application1 {
    public static void main(String[] args) {

        /* Application01
        int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x+=2);
		System.out.println( !('A' <= c && c <='Z') );
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);

		System.out.println() 의 결과를 예측하고 이유를 설명하시오.
		*/
        int x = 2;
        int y = 5;
        char c = 'A';
        System.out.println(y >= 5 || x < 0 && x > 2);
        System.out.println(y += 10 - x++);
        System.out.println(x+=2);
        System.out.println( !('A' <= c && c <='Z') );
        System.out.println('C'-c);
        System.out.println('5'-'0');
        System.out.println(c+1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);

        // 1. 답은 true. 논리식 구문이라 true or false로 출력되고 y는 5보다 같거나 크고 x는 0보다 작고 2보다 크다 중 후자는 틀렸지만 앞의 구문은 맞아서
        // 2. 답은 13. +=때문에 y에 10을 더해준 값에 
        // 3. 답은 3.
        // 4. 답은 false
        // 5. 답은 2.
        // 6. 답은 5.
        // 7. 답은 66.
        // 8. 답은 B.
        // 9. 답은 B.
        // 10. 답은 C.

    }
}
