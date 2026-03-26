package step3;
import java.util.ArrayList;
import java.util.List;

// T는 Number를 상속받은 타입(Integer, Double, Float 등)만 가능
public class ArithmeticCalculator<T extends Number>{
    private List<Double> resultList;

    public ArithmeticCalculator(List<Double> resultList) {
        this.resultList = resultList;
    }

    public double calculate(T num1, T num2, char symbol) {
        OperatorType op = OperatorType.matchSymbol(symbol);
        double n1 = num1.doubleValue();
        double n2 = num2.doubleValue();
        double res = switch (op) {
            case PLUS -> n1 + n2;
            case MINUS -> n1 - n2;
            case MULTIPLY -> n1 * n2;
            case DIVIDE -> {
                if (n2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                yield n1 / n2;
            }
        };
        resultList.add(res);
        return res;
    }

    public void getResults() {
        for (double res : resultList){
            System.out.println(res);
        }
    }

    public void printOptionOne(double threshold) {
        resultList.stream()                 // 1. 스트림 생성
                .filter(res -> res > threshold) // 2. 필터링 (람다식: 결과값 res가 기준값보다 크면 통과)
                .forEach(System.out::println);  // 3. 최종 연산 (출력)
    }

    public void printOptionTwo(double threshold) {
        resultList.stream()                 // 1. 스트림 생성
                .filter(res -> res == threshold) // 2. 필터링 (람다식: 결과값 res가 기준값과 같으면 통과)
                .forEach(System.out::println);  // 3. 최종 연산 (출력)
    }

    public void printOptionThree(double threshold) {
        resultList.stream()                 // 1. 스트림 생성
                .filter(res -> res < threshold) // 2. 필터링 (람다식: 결과값 res가 기준값보다 작으면 통과)
                .forEach(System.out::println);  // 3. 최종 연산 (출력)
    }

    void removeResult(){
        resultList.removeFirst();
    }

}