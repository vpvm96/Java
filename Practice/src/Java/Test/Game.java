package Java.Test;

import java.util.Scanner;

// arr1 -> 가위 가위 바위, 8 9
// arr2 -> 보 바위 가위 보 보 가위 1000
// 영희가 가장 많이 이기는 경우는 무엇을 냈을 때인가?
// card[] = { 0, 0, 0 }

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = "철수";
        String name2 = "영희";
        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
        System.out.println(name1 + ">>");
        String game1 = sc.next();
        System.out.println(name2 + ">>");
        String game2 = sc.next();

        if(game1.equals("가위")) {
            if (game2.equals("보")) {
                System.out.println("철수가 이겼습니다.");
            } else if (game2.equals("바위")) {
                System.out.println("영희가 이겼습니다.");
            } else {
                System.out.println("비겼습니다.");
            }
        } else if (game1.equals("바위")) {
            if (game2.equals("가위")) {
                System.out.println("영희가 졌습니다.");
            } else if (game2.equals("보")) {
                System.out.println("철수가 졌습니다.");
            } else {
                System.out.println("비겼습니다.");
            }
        } else {
            if (game2.equals("가위")) {
                System.out.println("철수가 이겼습니다.");
            } else if (game2.equals("바위")) {
                System.out.println("영희가 이겼습니다.");
            }else {
                System.out.println("비겼습니다.");
            }
        }
    }
}
