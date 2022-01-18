// 동적바인딩
class TestClass2 extends TestClass {
    public TestClass2() {
        System.out.println("def");
    }
    // 폴리모피즘 -> 다형성
    // 다형성 구현 중에서 대표적 2가지 방식 -> 오버라이딩
    @Override
    public int getA() { return 10; }

    @Override
    public String toString() { return "fff"; }
}
// Static : 미리 빌드하는 것.
public class TestClass {
    static class 이상원 {
        static String print() { return "내이름은 이상원ㅋ"; }
    }

    public TestClass() {
        System.out.println("abc");
    }

    // 같은 클래스 내에서 다형성 실현
    // 오버로딩 -> 같은 클래스 내에서 다르게 구현한거 (같은 이름인데,,,)
    public int getA() { return 1; }
    public int getA(int test) { return 2; }

    public static void main(String[] args) {
        TestClass a = new TestClass();
        TestClass2 b = new TestClass2();
        System.out.println(b.getA());
        System.out.println(b.toString());
        System.out.println(이상원.print());
    }
}
