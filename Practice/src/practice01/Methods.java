package practice01;

public class Methods {
    public String name;

    // 생성자 메소드
    public Methods() {
        name = "홍길동";
        System.out.println("#생성자:" + name);
    }
    // 인자가 없는 메소드
    public void printName() {
        System.out.println("#printName():" + name);
    }
    // 인자가 하나인 메소드(메소드 오버로딩), 인자 값이 출력됨.
    public void printName(String name) {
        System.out.println("#printName(String name):" + name);
    }
    // 가변인자를 사용한 메소드
    public void printNames(String ...name) {
        System.out.println("printNames(String...name)");
        for(String s : name) {
            System.out.println(s);
        }
    }
    // 인자가 두개인 메소드
    public int calc(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Methods m = new Methods();
        m.printName();
        m.printName("김길동");
        m.printNames("아무개", "홍길동", "김사랑");
        System.out.println("#calc(int num1, int num2):" + m.calc(20, 50));
    }
}

