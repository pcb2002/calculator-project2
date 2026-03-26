package step2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Double> resultList = new ArrayList<>();
        Calculator calculator = new Calculator(resultList);

        while (true) {
            try {
                System.out.println("\n계산기 step2입니다. (exit 입력 시 종료)");

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

                double result = calculator.calculate(num1, num2, ob);
                System.out.println("결과: " + result);

                //계산 기록 지우기 기능
                System.out.print("계산 기록을 지우시겠습니까? (y 입력): ");
                String rv = sc.next();
                if (rv.equals("y")) {
                    calculator.removeResult();
                }

                System.out.print("더 계산하시겠습니까? (종료하려면 exit 입력): ");
                String end = sc.next();
                if (end.equals("exit")) {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                sc.nextLine(); // 중요: 버퍼에 남아있는 잘못된 입력을 비움
            }
        }

        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }
}