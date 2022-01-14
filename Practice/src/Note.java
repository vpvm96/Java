import java.util.Scanner;

public class Note {
    public Note() {
        ////////
    }
    public int plus(int num1, int num2) { return (num1 + num2); }
    public int minus(int num1, int num2) { return (num1 - num2); }
    public int multi(int num1, int num2) { return (num1 * num2); }
    public int divide(int num1, int num2) { return (num1 / num2); }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Note note = new Note();

        while(true) {
            System.out.println("======기능을 입력하세요=======");
            System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 0.종료");
            int input = sc.nextInt();
            if (input == 0) {
                System.exit(0);
            }
            System.out.println("두 수를 입력하세요.");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if(input == 1) {
                System.out.println("더하기 :" + note.plus(num1, num2) + "입니다.");
            }else if(input == 2) {
                System.out.println("빼기 :" + note.minus(num1, num2) + "입니다.");
            }else if(input == 3) {
                System.out.println("곱하기 :" + note.multi(num1, num2) + "입니다.");
            }else if(input == 4) {
                System.out.println("나누기" + note.divide(num1, num2) + "입니다.");
            }else {
                System.out.println("다시 시도하세요.");
            }
        }
    }
}
