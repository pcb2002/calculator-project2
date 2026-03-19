package step2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Double> results = new ArrayList<>();

    public double calculate(int num1, int num2, char ob) {
        double res = 0;
        switch (ob) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                res = (double) num1 / num2;
                break;
            default:
                System.out.print("올바른 연산자를 입력하세요.");
            }
        results.add(res);
        return res;
        }

        public List<Double> getResults(){
        return results;
        }

        void removeResult(){
            results.removeFirst();
        }

    }
