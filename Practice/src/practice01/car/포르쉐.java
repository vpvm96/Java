package practice01.car;

public class 포르쉐 implements 자동차 {
    private int 속도;
    private int 기름;

    public 포르쉐(int 속도, int 기름) {
        this.속도 = 속도;
        this.기름 = 기름;
    }

    @Override
    public int 악셀() { return this.속도; }

    @Override
    public void 브레이크() { this.속도 -= 5; }

    @Override
    public void 충전(int 기름) { this.기름 += 기름;}
}
