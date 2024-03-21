package com.ohgiraffers.section02.variable;

public class Application3 {

    public static void main(String[] args){

        /*수업목표 : 변수의 명명 규칙에 대해 이해할 수 있다.*/
        /*변수의 명명 규칙*/
        /*변수의 이름을 지을 때 아무렇게나 짓는 것이 아닌 정해진 규칙이 있다*/
        /*실무적으로는 굉장히 중요하기 때문에 반드시 숙지해야 하고*/
        /*또한, 규칙에 맞는 올바른 변수명을 짓는 것이 좋은 프로그래밍을 하는 첫 단추이다*/
        /**/

        /*변수의 명명 규칙
        * 1. 컴파일 에러를 발생기키는 규칙
        *   1-1. 동일한 범위 내에서 동일한 변수명을 가질 수 없다.
        *   1-2. 예약어는 사용이 불가능하다.(자바에서 미리 사용하겠다고 컴파일러와 약속한 키워드를 예약이라고 한다.)
        *   1-3. 변수명은 대/소문자를 구분한다.(자바는 대/소문자를 구분하는 언어이다)
        *   1-4. 변수명은 숫자로 시작할 수 없다.(시작만 할 수 없고 숫자를 섞어서 사용하는 것은 가능하다)
        *   1-5. 특수기호는 '_'와 '$'만 사용 가능하다.(따라서 공백은 사용할 수 없다)
        *
        * 2. 컴파일 에러를 발생시키는 않지만 개발자끼리의 암묵적인 규칙
        *   2-1. 변수명의 길이 제한은 없다.(하지만 적당히 해야겠지?)
        *   2-2. 변수명이 합성어로 이루어진 경우 첫 단어는 소문자 두번째 시작하는 단어는 대문자로 시작한다.(camel-case)
        *   2-3. 단어와 단어 사이의 연결은 언더스코어(_)로 사용하지 않는다.(타 언어의 네이밍 규칙이다)
        *   2-4. 한글로 변수명을 짓는 것은 가능하지만, 권장하지 않는다.(한글을 취급하는 다양한 방식들이 존재하기 때문에 에러를 유발시킬 수 있다)
        *   2-5. 변수 안에 저장된 값이 어떤 의미를 가지는지 정확하게 표현하도록 한다.
        *   2-6. 전형적인 변수 이름이 있다면 가급적 사용하도록 한다.
        *   2-7. 명사형으로 작성하도록 한다.
        *   2-8. boolean 형은 의문문으로 가급적 긍정형태로 네이밍한다.
        * */

        /*1. 컴파일 에러를 발생시키는 규칙*/
        /*1-1. 동일한 범위 내에서 동일한 변수를 가질 수 없다.*/
        int age = 20;
        //String age = ""; // 이름이 같기 때문에 안됨
        //int age = 30; // 동일한 변수명을 가지므로 에러 발생

        /*1-2. 예약어는 사용이 불가능하다.*/
        //int true = 1; //예약어는 사용이 불가능하다.

        /*1-3. 변수명은 대소문자를 구분한다.*/
        int Age = 20; //위에서 만든 age와는 다른 것으로 취급
        int True = 10; //예약어인 true와는 대소문자 구분을 하기 때문에 다른 것으로 취급

        /*1-4. 변수명은 숫자로 시작할 수 없다.*/
        //int 1age = 10; //숫자로 시작해서 에러 발생
        int age1 = 10; //숫자가 처음에 시작하지 않으면 섞어서 사용도 가능함

        /*1-5. 특수기호는 '_'와 '$'만 사용 가능하다*/
        //int 1@ge = 20; //사용 가능한 특수문자 외에는 사용이 불가능
        int _age = 20; //언더스코어는 사용 가능함. 처음도 가능하고 중간이나 끝에도 가능함.
        int a$ge = 20; //$사용 가능. 처음도 가능하고 중간이나 끝에도 가능함.

        /*2. 컴파일 에러를 발생시키지는 않지만 개발자들끼리의 암묵적인 규칙*/
        /*2-1. 변수명의 길이제한은 없다. 하지만 적당히 하자.*/
        int dsfskjdlfjksdjflksdjkvlskdfkse;

        /*2-2. 변수명이 합성어로 이루어진 경우 첫 단어는 소문자 두번째 시작 단어는 대문자로 시작한다.*/
        /*자바에서는 클래스명만 유일하게 대문자로 시작한다.*/
        int macAge = 20;
        int minAge = 20; //두문자 이상 합성할때도 새로운 단어를 넣을 때마다 규칙을 유의한다.

        /*2-3. 단어와 단어 사이는 언더스코어(_)로 하지 않는다*/
        String user_name; //에러가 발생하진 않지만 이렇게 하면 안됨.
        String userName; //올바른 표기법

        /*2-4. 한글로 변수명을 짓는 것이 가능하지만 권장하지 않는다(매우)*/
        int 나이;

        /*2-5. 변수 안에 저장된 값이 어떤 의미를 가지는지 정확하게 표현하도록 한다.*/
        String s;
        String name; //문자열 형태의 이름이 저장되겠구나! 의도파악

        /*2-6. 전형적인 변수 이름이 있다면 가급적 사용하도록 한다.*/
        int sum = 0;
        int max = 10;
        int min = 0;
        int count = 1;

        /*2-7. 명사형으로 작성할 수 있도록 한다.*/
        String goHome; //가능하긴 하지만 가급적 명사형으로 짓는다.
        String home;

        /*2-8. boolean 형은 의문문으로 가급적 긍정상태로 네이망한다*/
        boolean isAlive = true;
        boolean isDead = false; //부정형보다 긍정형이 더 나은 방식이다.



    }
}
