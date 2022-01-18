import javax.swing.plaf.synth.SynthUI;
import java.util.*;

public class Main { // 계산기
    public static void main(String[] args) {
//        System.out.println("hello world");
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("====기능을 선택하세요====");
            System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기");
            int input = scanner.nextInt();
            System.out.println("두 수를 입력하세요.");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            if (input == 1) {
                System.out.println("더하기 :" + (num1 + num2) + "입니다.");
            }else if (input == 2) {
                System.out.println("빼기 :" + (num1 - num2) + "입니다.");
            }else if (input == 3) {
                System.out.println("곱하기" + (num1 * num2) + "입니다.");
            }else if (input == 4) {
                System.out.println("나누기" + (num1 / num2) + "입니다.");
            }else {
                System.out.println("다시 시도하세요");
            }
        }
    }
}
