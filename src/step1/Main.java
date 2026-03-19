package step1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\n계산기 step1입니다. (exit 입력 시 종료)");

                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();
                if (num1 < 0) {
                    System.out.println("양의 정수를 입력해주세요.");
                    continue;
                }

                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();
                if (num2 < 0) {
                    System.out.println("양의 정수를 입력해주세요.");
                    continue;
                }

                System.out.print("사칙연산 기호를 입력하세요: ");
                char ob = sc.next().charAt(0);

                float result = 0;

                switch (ob) {
                    case '+': result = num1 + num2; break;
                    case '-': result = num1 - num2; break;
                    case '*': result = num1 * num2; break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("0으로 나눌 수 없습니다.");
                            continue;
                        }
                        result = (float) num1 / num2; break;
                    default:
                        System.out.println("올바른 연산자를 입력하세요.");
                        continue;
                }

                System.out.println("결과: " + result);
                System.out.print("더 계산하시겠습니까?: ");

                String end = sc.next();
                if (end.equals("exit")) {
                    break;
                }

            } catch (InputMismatchException e) {
                // 숫자가 아닌 문자가 들어왔을 때 실행되는 구간
                System.out.println("잘못된 입력입니다. 양의 정수를 입력해주세요.");
                sc.nextLine(); //입력 버퍼에 남아있는 '잘못된 문자'를 비워줌
            }
        }

        System.out.println("계산기를 종료합니다.");
        sc.close();
    }
}