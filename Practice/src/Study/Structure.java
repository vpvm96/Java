package Study;
// 소스 파일 : Hello.java
public class Structure {
    public static int sum(int n, int m) {
        return n + m;
    }
    //main() 메소드에서 실행 시작
    public static void main(String[] args) {
        int i = 20;
        int s;
        char a;

        s = sum(i , 10);           // 메소드 호출
        a = '?';
        System.out.println(a);        // 문자 '?' 출력
        System.out.println("Hello");  // "Hello" 문자열 출력
        System.out.println(s);       // 정수 s 값 30 출력
    }
    /*
    1.클래스 안에 변수, 상수, 함수(메소드) 등 모든 프로그램을 작성 이걸 캡슐화라 부름.
    2.클래스 바깥에는 어떠한 것도 작성해서는 안됨.
    3.자바 프로그램은 main()메소드에서부터 실행된다.
    4.클래스의 멤버 함수를 자바에서는 메소드(method)라 부른다, 메소드 이름은 사용자가 지정 개수에 제한은 없다.
    5.변수(variable)란 프로그램 실행 동안 데이터를 저장하는 공간이다, 개발자가 이름을 붙임 ex) int i; , char a;
    6.메소드 내에 선언되어 사용하는 변수를 지역변수(local variable)라고 한다, 지역변수는 메소드 내에서만 사용가능
    메소드가 실행이 끝나면 소멸함, 다음과 같이 선언과 동시에 값을 초기화 가능 ex) int i = 20; // 변수 i 선언과 동시에 20으로 초기화.
    7.자바에 모든 문장은 다음과 같이 ';'로 끝나야 한다. ex) int i = 20; , s = sum(i, 20);
    8.화면 출력 System.out.println()이나 System.out.print()를 이용하면 된다
    특징은 System.out.println()은 출력 후 다음 행으로 이동하지만, System.out.print()는 다음 줄로 넘어가지 않는다.
    * */
}

