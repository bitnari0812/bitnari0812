
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
        // 2. 답은 13. y = y+(10-x++)
        // 3. 답은 5. x = x+2 , 위 값에서 증감연산자에 의해 x값이 3이 되어서
        // 4. 답은 false
        // 5. 답은 2. 67-65 = 2
        // 6. 답은 5. 아스키코드로 연산되어 5
        // 7. 답은 66. A가 65라는 점에서 C가 67이라는 것을 알 수 있다. 문자열 계산을 했기에 66으로 출력된다.
        // 8. 답은 B. 문자열과 숫자의 연산으로 B가 출력
        // 9. 답은 B. A+1의 결과로 B가 되었다.
        // 10. 답은 C. 위의 연산 결과로 B에서 1이 더해져서 C가 되었다.

    }
}
