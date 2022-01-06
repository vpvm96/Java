package practice01;

public class Operator1 {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 14;

        int result1 = num1 * num2;
        int result2 = num1 % num2;

        System.out.println("result1 :" + result1);
        System.out.println("result2 :" + result2);
        System.out.println("---------------------");

        num1++;
        num2 *= 2;
        System.out.println("num1++ :" + num1);
        System.out.println("num2 *= 2 :" + num2);
        System.out.println("---------------------");

        System.out.println("num1++ :" + num1++);
        System.out.println("--num1 :" + --num1);

    }
}
