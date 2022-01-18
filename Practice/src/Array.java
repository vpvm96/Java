import java.util.*;

public class Array {
    public static void main(String[] args) {
        // 값을 선언과 동시에 초기화한 배열
        int[] scores1 = {95,100,87,91};
        // 길이가 4인 배열객체를 생성
        int[] scores2 = new int[4];
        scores1[2] = 90;
        System.out.println(scores1[0]);
    }
}
