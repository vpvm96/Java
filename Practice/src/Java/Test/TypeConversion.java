package Java.Test;

public class TypeConversion {
    public static void main(String[] args) {
        byte b = 127;
        int i = 100;
        System.out.println(b + i); // b가 int 타입으로 자동 변환   (227)
        System.out.println(10 /4); // 정수 나누기이므로 결과는 2    (2)
        System.out.println(10.0 / 4); // 4가 4.0으로 자동 변환 실수 나누기이므로 결과는 (2.5)
        System.out.println((char)0x12340041); // char 로 변환된 결과 0x0041로서 문자 ('A')
        System.out.println((byte)(b + i)); // b + i 는 227, 16진수 0xE3, 즉 (-29)
        System.out.println((int)2.9 + 1.8);   //  (3.8)
        System.out.println((int)(2.9 + 1.8));  //  (4)
        System.out.println((int)2.9 + (int)1.8);  // (3)
    }
}
