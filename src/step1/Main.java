package step1;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);



        while(true){
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            String ob = sc.next();

            int result = 0;

            switch (ob){
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
            }

            System.out.print("결과: "+ result);
            System.out.print("더 계산하시겠습니까> (exit 입력 시 종료): ");

            String end = sc.next();
            if (end.equals("exit")){
                break;
            }
        }

    }


}