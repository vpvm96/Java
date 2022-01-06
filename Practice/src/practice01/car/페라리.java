package practice01.car;

public class 페라리 implements 자동차 {
    private int 속도;
    private int 기름;

    public 페라리(int 속도, int 기름) {
        this.속도 = 속도;
        this.기름 = 기름;
    }

    @Override
    public int 악셀() { return this.속도 * 2; }

    @Override
    public void 브레이크() { this.속도 -= 50; }

    @Override
    public void 충전(int 기름) { this.기름 *= 기름;}

    public int get속도() { return this.속도; }
}
