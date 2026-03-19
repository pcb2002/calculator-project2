package step1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        try{
            while(true){
                System.out.println("계산기 step1입니다. (exit 입력 시 종료)");
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();
                if (num1<0){
                    System.out.println("양의 정수를 입력해주세요.");
                    continue;
                }

                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();
                if (num2<0){
                    System.out.println("양의 정수를 입력해주세요.");
                    continue;
                }

                System.out.print("사칙연산 기호를 입력하세요: ");
                String ob = sc.next();

                float result = 0;

                switch (ob){
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                    case "/":
                        if (num2 == 0) {
                            System.out.println("0으로 나눌 수 없습니다.");
                            continue; // 다시 계산 루프의 처음으로 돌아감
                        }
                        result = (float) num1 / num2; break;
                    default:
                        System.out.print("올바른 연산자를 입력하세요.");
                        continue;
                }

                System.out.println("결과: "+ result);
                System.out.print("더 계산하시겠습니까?: ");

                String end = sc.next();
                if (end.equals("exit")){
                    break;
                }
            }
        }catch (InputMismatchException e) {
            System.out.println("양의 정수를 입력해주세요.");
        }
    sc.close();

    }


}