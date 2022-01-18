package Java;

public class Identifier {
    /*Identifier(식별자)란 클래스, 상수, 메소드 등에 붙이는 이름을 말한다.
    1.식별자 규칙 특수문자(%, *, &, @, ^등), 공백(탭, space 등)은 식별자로 사용할수 없으나, '_' , '$'는 예외로 사용가능하다.
    2.한글도 식별자로 사용 가능하다.
    3.if,while,class 등 자바 언어의 키워드는 식별자로 사용할 수 없다.
    4.식별자의 첫 번째 문자로 숫자는 사용할 수 없다.
    5.true, false, null 은 자바의 키워드이므로 식별자로 사용할 수 없다.
    6.'_'와 '$'는 식별자의 첫 번째 문자로 사용할 수 있으나, 일반적으로 잘 사용하지 않는다.
    7.대소문자를 구별한다, 길이 제한이 없다.
    다음 식별자로 사용할 수 있는 예이다. ex) int name; , char student_ID; , void $func() { } , class Monster3 { } ,
    int WhatsYourNameMyNameIsKite; , int barChart; int barchar; 대소문자 구분 , int 가격;
    다음 식별자로 사용할 수 없는 예이다. ex) int 3Chapter, int class if { }, char false;, void null() { }, class %calc { }
    8.좋은 이름을 붙이는 관습으로 읽기쉽게 한다.
    */
    public class  HelloWorld {
        class AutoVendingMachine {
            // 클래스 이름의 첫 번째 문자는 대문자로 시작 그 후는 각 단어의 첫번째 문자만 대문자.
            int myAge; // 변수 메소드 이름
            boolean isSingle;
            public int getAge() { return 20; }

            final double PI = 3.141592; // 상수 이름은 전체를 대문자로 표기하도록 권장.
        }
    }
}
